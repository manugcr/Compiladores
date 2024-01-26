package compiladores;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.ErrorNode;

import compiladores.compiladoresParser.AssignmentContext;
import compiladores.compiladoresParser.Block_of_codeContext;
import compiladores.compiladoresParser.Call_listContext;
import compiladores.compiladoresParser.Else_stmtContext;
import compiladores.compiladoresParser.FactorContext;
import compiladores.compiladoresParser.For_stmtContext;
import compiladores.compiladoresParser.Function_callContext;
import compiladores.compiladoresParser.Function_declarationContext;
import compiladores.compiladoresParser.Function_prototypeContext;
import compiladores.compiladoresParser.Function_stmtContext;
import compiladores.compiladoresParser.If_stmtContext;
import compiladores.compiladoresParser.InstructionContext;
import compiladores.compiladoresParser.ProgramContext;
import compiladores.compiladoresParser.Return_stmtContext;
import compiladores.compiladoresParser.StatementContext;
import compiladores.compiladoresParser.StatementsContext;
import compiladores.compiladoresParser.While_stmtContext;
import compiladores.compiladoresParser.InstructionsContext;
import compiladores.compiladoresParser.Parameters_prototypeContext;
import compiladores.compiladoresParser.Statement_with_assignContext;
import compiladores.compiladoresParser.Parameter_listContext;
import compiladores.compiladoresParser.Call_parameterContext;

public class Listener extends compiladoresBaseListener { 
    private SymbolTable symbolTable = SymbolTable.getInstanceOf();
    String filePath = "./symbolTable.log";
    String warningMessage = "";


    // Initial rule. We need to delete the symbol table and create a new context.
    @Override
    public void enterProgram(ProgramContext ctx) {
        symbolTable.delFile(filePath);

        System.out.println("\n---------------------");
        System.out.println("  <<Listener begins>>  ");
        System.out.println("---------------------");

        symbolTable.addContext();
    }


    // Final rule. We need to log the symbol table and delete the context.
    @Override
    public void exitProgram(ProgramContext ctx) {
        delContext();
        System.out.println(warningMessage);

        System.out.println("---------------------");
        System.out.println("  <<Listener ends>>  ");
        System.out.println("---------------------\n");
    }


    // A block of code comes after a function declaration. 
    // We need to add the function arguments to the symbol table and create a new context.
    @Override
    public void enterBlock_of_code(Block_of_codeContext ctx) {
        
        if(ctx.getParent() instanceof Function_stmtContext) {
            symbolTable.addContext(); 
            System.out.println(symbolTable.searchSymbol(ctx.getParent().getChild(0).getChild(1).getText()));
            Function function = (Function) symbolTable.searchSymbol(ctx.getParent().getChild(0).getChild(1).getText());
            LinkedList<Parameter> parameters = function.getArgs();

            for (Parameter parameter : parameters) {
                Variable variable = new Variable(parameter.getName(), parameter.getDataType(), false, true);
                symbolTable.addSymbol(variable);
            }
        }
    }


    // A block of code comes after a function declaration.
    // We check for return statement, log to the symbol table and delete local context.
    @Override
    public void exitBlock_of_code(Block_of_codeContext ctx){
        
        if(ctx.getParent() instanceof Function_stmtContext) {
            DataType returnType =  DataType.getDataType(ctx.getParent().getChild(0).getChild(0).getText());
            Boolean returnFlag = false;

            InstructionsContext instructions = ctx.instructions();

            while(instructions.getChildCount() != 0) {
                // Look for return statement
                if(instructions.instruction().getChild(0) instanceof Return_stmtContext) {
                    returnFlag = true;
                    break;
                }
                instructions = (InstructionsContext) instructions.instructions();
            }

            if(returnType.toString() == "VOID" && returnFlag) {
                throw new RuntimeException("error: 'return' with a value in function returning void");
            }

            if(returnType.toString() != "VOID" && !returnFlag) {
                throw new RuntimeException("error: control reaches end of non-void function [-Wreturn-type]");
            }
        }

        delContext();
    }

    
    // We first check if the variable existis inside the symbol table.
    // And then we initialize it.
    @Override
    public void exitAssignment(AssignmentContext ctx) {
        String name = ctx.ID().getText();
        ID variable = symbolTable.searchSymbol(name);

        if (variable == null) {
            throw new RuntimeException("error: undefined reference to '" + name + "'");
        } 
        else {
            if (!variable.getInitialized()) {
                variable.setInitialized(true);
            }
        }
    }    
    

    // Enter a new context for if, else, for and while statements.
    @Override
    public void enterIf_stmt(If_stmtContext ctx) {
        symbolTable.addContext();
    }
    

    @Override
    public void enterElse_stmt(Else_stmtContext ctx) {
        symbolTable.addContext();
    }

    
    @Override
    public void enterFor_stmt(For_stmtContext ctx) {
        symbolTable.addContext();
    }

    
    @Override
    public void enterWhile_stmt(While_stmtContext ctx) {
        symbolTable.addContext();
    }


    // Any error in the listner will throw a RuntimeException here.
    @Override
    public void visitErrorNode(ErrorNode node) {
        throw new RuntimeException("ErrorNode");
    }
    
    
    // Exits instruction only from if, else, for and while statements.    
    @Override
    public void exitInstruction(InstructionContext ctx) {
        if (!(ctx.getChild(0) instanceof Block_of_codeContext)) {
            if (ctx.getParent() instanceof If_stmtContext | ctx.getParent() instanceof Else_stmtContext | ctx.getParent() instanceof For_stmtContext | ctx.getParent() instanceof While_stmtContext) {
                delContext();
            }
        }
    }


    // Log context to symbol table.
    public void delContext() {

        symbolTable.saveSymbolTable(filePath);

        if(!symbolTable.getUnusedID().isEmpty()) {
            warningMessage += ("\nWarning: Unused " + symbolTable.getUnusedID()); 
        }
        
        if(!symbolTable.getUsedUninitialized().isEmpty()) {
            throw new RuntimeException("error: undefined reference to '" + symbolTable.getUsedUninitialized().get(0) + "'");
        }

        symbolTable.delContext();
    }


    // A factor is a NUMBER, ID, FUNCTION CALL, or an expression.
    @Override
    public void exitFactor(FactorContext ctx) {
        if(ctx.ID() != null) {
            ID id = symbolTable.searchSymbol(ctx.ID().getText());

            if(id != null) {
                if(!id.getInitialized())
                    warningMessage += ("\nwarning: '" + ctx.ID().getText() + "' is used uninitialized");
                id.setUsed(true);
            }
            else
                throw new RuntimeException("error: '" + ctx.ID().getText() + "' undeclared (first use in this function)");
        }
        else if(ctx.inc_dec() != null) {
            ID id = symbolTable.searchSymbol(ctx.inc_dec().ID().getText());

            if(id != null) {
                if(!id.getInitialized())
                    warningMessage += ("\nwarning: '" + ctx.inc_dec().ID().getText() + "' is used uninitialized");
                id.setUsed(true);
            }
            else
                throw new RuntimeException("error: '" + ctx.inc_dec().ID().getText() + "' undeclared (first use in this function)");
        }
    }


    @Override
    public void exitFunction_call(Function_callContext ctx) {
        Function function = (Function) symbolTable.searchSymbol(ctx.ID().getText());

        if(function != null) { //Function exists
            if (ctx.getParent() instanceof FactorContext && function.getDataType() == DataType.VOID) //Function void as a factor
                throw new RuntimeException("error: void value not ignored as it ought to be");
            
            LinkedList<DataType> expectedParameters = function.getDataTypeArgs();
            
            LinkedList<DataType> parameters = new LinkedList<>();

            Call_listContext callParameters = ctx.call_list();

            while(callParameters.getChildCount() != 0){
                Call_parameterContext parameter = callParameters.call_parameter();

                if (parameter.NUMBER() != null) //Parameter is a number
                    parameters.add(DataType.INT);
        
                else if(parameter.ID() != null) { //Parameter is a variable
                    String variableName = parameter.ID().getText();
                    Variable variable = (Variable) symbolTable.searchSymbol(variableName);
                    if(variable != null) { //Variable exists
                        if(!variable.getInitialized())
                            warningMessage += ("\nwarning: '" + variableName + "' is used uninitialized");
                        variable.setUsed(true);
                    } 
                    else //Variable does not exist
                        throw new RuntimeException("error: '" + variableName + "' undeclared (first use in this function)");
                    
                    parameters.add(variable.getDataType());
                }

                else if(parameter.inc_dec() != null) { //Parameter is a inc_dec
                    String variableName = parameter.inc_dec().ID().getText();
                    Variable variable = (Variable) symbolTable.searchSymbol(variableName);

                    if(variable != null) { //Variable exists
                        if(!variable.getInitialized())
                            warningMessage += ("\nwarning: '" + variableName + "' is used uninitialized");
                        variable.setUsed(true);
                    }
                    else //Variable does not exist
                        throw new RuntimeException("error: '" + variableName + "' undeclared (first use in this function)");

                    parameters.add(DataType.INT);
                }

                else if(parameter.function_call() != null){ //Parameter is a function call
                    Function functionParameter = (Function) symbolTable.searchSymbol(parameter.function_call().ID().getText()); //It does not check if the function exist because it is another function call 
                    parameters.add(functionParameter.getDataType());
                }

                else if(parameter.logical_arithmetic_expression() != null)  //Parameter is an opal
                    parameters.add(DataType.INT);
                
                if (callParameters.getChildCount() == 3)
                    callParameters = (Call_listContext) callParameters.getChild(2);
                else 
                    break;
                
            }

            if(!compareLists(parameters, expectedParameters))
                throw new RuntimeException("error: In function " + function.getName() + " invalid parameters\n Obtained: " + parameters + "\n Expected " + expectedParameters);

            function.setUsed(true);
        }
        else //Function does not exist
            throw new RuntimeException("error: implicit declaration of function " + ctx.ID().getText());
    }

    public <T> Boolean compareLists(LinkedList <T> list1, LinkedList<T> list2) {
        if(list1.size()!= list2.size())
            return false;

        for (int dataType = 0; dataType<list1.size(); dataType++)
            if(list1.get(dataType) != list2.get(dataType)) 
                return false;

        return true;
    }

    @Override
    public void exitFunction_declaration(Function_declarationContext ctx) {
        String functionName = ctx.ID().getText();
        Parameter_listContext parameters = ctx.parameter_list();
        DataType dataType = DataType.getDataType(ctx.TYPE().getText());

        Function function = new Function(functionName, dataType, false, true);
    
        //Add function parameters
        while(parameters.getChildCount() != 0){
            function.addArg(DataType.getDataType(parameters.TYPE().getText()),
                            parameters.ID().getText());
            if(parameters.getChildCount() == 4) 
                parameters = (Parameter_listContext) parameters.parameter_list();
            else
                break;
        }

        Function prototype = (Function) symbolTable.searchLocalSymbol(functionName);
        
        if(prototype == null) {
            if(functionName.equals("main"))
                function.setUsed(true);
            
            symbolTable.addSymbol(function);
        }
        
        else {
            //Different type
            if(function.getDataType() != prototype.getDataType())
                throw new RuntimeException("error: conflicting types for ' " + functionName + "'");
            //Different parameters
            if(!function.compareArgs(prototype.getArgs()))
                throw new RuntimeException("error: conflicting types for ' " + functionName + "'");
            
            prototype.setArgs(function.getArgs());
            prototype.setInitialized(true);
        }
    }


    // Function prototype should be called first in the code, and should not contain any block of code.
    @Override
    public void exitFunction_prototype(Function_prototypeContext ctx) {
        String functionName = ctx.ID().getText();

        if(symbolTable.searchLocalSymbol(functionName) == null) {
            DataType dataType = DataType.getDataType(ctx.TYPE().getText());
            Function function = new Function(functionName, dataType, false, false);

            Parameters_prototypeContext parameters = ctx.parameters_prototype();

            while (parameters.getChildCount() != 0) {
                function.addArg(DataType.getDataType(parameters.TYPE().getText()), null);

                if (parameters.getChildCount() == 3) {
                    parameters = (Parameters_prototypeContext) parameters.parameters_prototype();
                } else {
                    break;
                }
            }
            symbolTable.addSymbol(function);
        }
        else {
            throw new RuntimeException("error: redefinition of '" + functionName + "'");
        
        }
    }


    @Override
    public void exitStatement(StatementContext ctx) {
        DataType statementDataType = DataType.getDataType(ctx.TYPE().getText());
        StatementsContext statementsTypes = ctx.statements();

        while (true) {
            Variable variable = new Variable(null, statementDataType, false, null);
            String variableName;
            Boolean initialized;

            if (statementsTypes.getChild(0) instanceof Statement_with_assignContext) {
                variableName = statementsTypes.getChild(0).getChild(0).getText();
                initialized = true;
            } else {
                variableName = statementsTypes.getChild(0).getText();
                initialized = false;
            }

            if (symbolTable.searchLocalSymbol(variableName) != null) {
                throw new RuntimeException("error: redefinition of '" + variableName + "'");
            }

            variable.setName(variableName);
            variable.setInitialized(initialized);
            symbolTable.addSymbol(variable);

            if (statementsTypes.getChildCount() == 3) {
                statementsTypes = (StatementsContext) statementsTypes.getChild(2);
            }
            else {
                break;
            }
        }
    }

}