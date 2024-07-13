/*
 * A Listener in ANTLR is an interface that responds to 'enter' and 'exit' events for each rule in your grammar. 
 * As ANTLR traverses the parse tree generated from your source code, it triggers these events. 
 * By overriding methods in the Listener, you can add custom behavior to be executed at each node in the parse tree. 
 * This is useful to build the symbol table and perform type checking.
 * Essentially, the Listener acts as a bridge between the abstract syntax tree generated by ANTLR and the rest of your compiler or interpreter.
 * 
 * The Listener is a good choice when you want to perform a single pass over the parse tree.  
 */

package compiladores;

import java.util.LinkedList;

import compiladores.compiladoresParser.FactorContext;
import compiladores.compiladoresParser.If_stmtContext;
import compiladores.compiladoresParser.ProgramContext;
import compiladores.compiladoresParser.For_stmtContext;
import compiladores.compiladoresParser.StatementContext;
import compiladores.compiladoresParser.Else_stmtContext;
import compiladores.compiladoresParser.StatementsContext;
import compiladores.compiladoresParser.While_stmtContext;
import compiladores.compiladoresParser.AssignmentContext;
import compiladores.compiladoresParser.InstructionContext;
import compiladores.compiladoresParser.Return_stmtContext;
import compiladores.compiladoresParser.InstructionsContext;
import compiladores.compiladoresParser.Block_of_codeContext;
import compiladores.compiladoresParser.Function_stmtContext;
import compiladores.compiladoresParser.Function_callContext;
import compiladores.compiladoresParser.Call_parameterContext;
import compiladores.compiladoresParser.Parameters_listContext;
import compiladores.compiladoresParser.Function_prototypeContext;
import compiladores.compiladoresParser.Function_declarationContext;
import compiladores.compiladoresParser.Call_parameters_listContext;
import compiladores.compiladoresParser.Parameters_prototypeContext;
import compiladores.compiladoresParser.Statement_with_assignContext;

public class Listener extends compiladoresBaseListener {

    private SymbolTable symbolTable = SymbolTable.getInstanceOf();
    String filePath = "./output/symbolTable.txt";
    String warningMessage = "";

    /*
     * Initial rule.
     * - We need to delete the symbol table and create a new context.
     * - We only enter the program once because its a single pass listener.
     */
    @Override
    public void enterProgram(ProgramContext ctx) {

        symbolTable.delFile(filePath);

        System.out.println("\n ----------- Listener begins ----------- ");

        symbolTable.addContext();
    }

    /*
     * Final rule.
     * - We need to log the symbol table and then check for erros and warnings.
     */
    @Override
    public void exitProgram(ProgramContext ctx) {

        delContext();

        if (warningMessage.equals("")) {
            System.out.println("No warnings or errors.");
            System.out.println("Symbol table written to " + filePath);
        } else {
            System.out.println(warningMessage);
        }

        System.out.println(" ----------- Listener ends -------------\n\n");
    }

    /*
     * A block of code means a new context, its delimited by curly braces {}.
     * For example we have a block of code after function declaration.
     * 
     * int addition(int, int) { ... }
     * 
     * - We load a new context and the function parameters are added to the local
     * context.
     */
    @Override
    public void enterBlock_of_code(Block_of_codeContext ctx) {

        if (ctx.getParent() instanceof Function_stmtContext) {
            symbolTable.addContext();
            Function function = (Function) symbolTable.searchSymbol(ctx.getParent().getChild(0).getChild(1).getText());
            LinkedList<Parameter> parameters = function.getArgs();

            for (Parameter parameter : parameters) {
                Variable variable = new Variable(parameter.getName(), parameter.getDataType(), false, true);
                symbolTable.addSymbol(variable);
            }
        }
    }

    /*
     * When we exit a block of code we need to check:
     * - If we come from a function, and if the function has a return statement.
     * - We also need to delete and save the local context after a succesful exit.
     */
    @Override
    public void exitBlock_of_code(Block_of_codeContext ctx) {

        if (ctx.getParent() instanceof Function_stmtContext) {

            DataType returnType = DataType.getDataType(ctx.getParent().getChild(0).getChild(0).getText());
            Boolean returnFlag = false;

            InstructionsContext instructions = ctx.instructions();

            while (instructions.getChildCount() != 0) {
                /* Look for return statement */
                if (instructions.instruction().getChild(0) instanceof Return_stmtContext) {
                    returnFlag = true;
                    break;
                }
                instructions = (InstructionsContext) instructions.instructions();
            }

            /*
             * Check for errors:
             * - If a function is VOID and has a return statement.
             * - If a function is non VOID but hasnt got a return statement.
             */
            if (returnType.toString() == "VOID" && returnFlag) {
                throw new RuntimeException("error: 'return' with a value in function returning void");
            }

            if (returnType.toString() != "VOID" && !returnFlag) {
                throw new RuntimeException("error: control reaches end of non-void function [-Wreturn-type]");
            }
        }

        delContext();
    }

    /*
     * We create a new function
     * - If the function hasnt got a prototype we add it to the local context.
     * - If it has a prototype we check for parameters and return types, and
     * initialize the function.
     */
    @Override
    public void exitFunction_declaration(Function_declarationContext ctx) {

        String functionName = ctx.ID().getText();
        Parameters_listContext parameters = ctx.parameters_list();
        DataType dataType = DataType.getDataType(ctx.TYPE().getText());

        Function function = new Function(functionName, dataType, false, true);

        /* Add function parameters. */
        while (parameters.getChildCount() != 0) {
            function.addArg(DataType.getDataType(parameters.TYPE().getText()), parameters.ID().getText());
            if (parameters.getChildCount() == 4) {
                parameters = (Parameters_listContext) parameters.parameters_list();
            } else {
                break;
            }
        }

        Function prototype = (Function) symbolTable.searchLocalSymbol(functionName);

        if (prototype == null) {
            if (functionName.equals("main")) {
                function.setUsed(true);
            }

            symbolTable.addSymbol(function);
        } else {
            /* Different types */
            if (function.getDataType() != prototype.getDataType()) {
                throw new RuntimeException("error: conflicting types for ' " + functionName + "'");
            }
            /* Different parameters */
            if (!function.compareArgs(prototype.getArgs())) {
                throw new RuntimeException("error: conflicting types for ' " + functionName + "'");
            }

            prototype.setArgs(function.getArgs());
            prototype.setInitialized(true);
        }
    }

    /*
     * Add the prototype to the symbol table.
     */
    @Override
    public void exitFunction_prototype(Function_prototypeContext ctx) {

        String functionName = ctx.ID().getText();

        if (symbolTable.searchLocalSymbol(functionName) == null) {
            DataType dataType = DataType.getDataType(ctx.TYPE().getText());
            Function function = new Function(functionName, dataType, false, false);

            Parameters_prototypeContext parameters = ctx.parameters_prototype();

            while (parameters.getChildCount() != 0) {
                function.addArg(DataType.getDataType(parameters.TYPE().getText()), null);

                if (parameters.getChildCount() >= 3) {
                    parameters = parameters.parameters_prototype();
                } else {
                    break;
                }
            }
            symbolTable.addSymbol(function);
        } else {
            throw new RuntimeException("error: redefinition of prototype ' " + functionName + "'");
        }

    }

    /*
     * Add each declared variable to the local context, checking for redefinitions
     * and if the variable is initialized.
     */
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

            if (initialized) {
                String value = statementsTypes.getChild(0).getChild(2).getText();
                variable.setValue(value);
            }

            variable.setInitialized(initialized);
            symbolTable.addSymbol(variable);

            if (statementsTypes.getChildCount() == 3) {
                statementsTypes = (StatementsContext) statementsTypes.getChild(2);
            } else {
                break;
            }
        }
    }

    /*
     * When we assign a value to a variable:
     * - We first check wether it exists in the context and then we initialize it.
     */
    @Override
    public void exitAssignment(AssignmentContext ctx) {

        String variableName = ctx.ID().getText();

        ID variable = symbolTable.searchSymbol(variableName);

        if (variable == null) {
            throw new RuntimeException("error: '" + variableName + "' undeclared");
        } else {
            if (!variable.getInitialized()) {
                variable.setInitialized(true);
            }
        }
    }

    /*
     * A factor is an operand of a logical or arithmetic expression.
     * - We need to check if the variable was declared and if it was initialized.
     */
    @Override
    public void exitFactor(FactorContext ctx) {

        if (ctx.ID() != null) {
            ID id = symbolTable.searchSymbol(ctx.ID().getText());

            if (id != null) {
                if (!id.getInitialized()) {
                    warningMessage += ("\nwarning: '" + ctx.ID().getText() + "' is used uninitialized");
                }
                id.setUsed(true);
            } else {
                throw new RuntimeException("error: '" + ctx.ID().getText() + "' undeclared");
            }
        } else if (ctx.inc_dec() != null) {
            ID id = symbolTable.searchSymbol(ctx.inc_dec().ID().getText());

            if (id != null) {
                if (!id.getInitialized()) {
                    warningMessage += ("\nwarning: '" + ctx.inc_dec().ID().getText() + "' is used uninitialized");
                }
                id.setUsed(true);
            } else {
                throw new RuntimeException("error: '" + ctx.inc_dec().ID().getText() + "' undeclared");
            }
        }
    }

    /*
     * When we call a function:
     * - We need to check if the function was declared,
     * - If the parameters are the same as the expected ones, and if it should
     * return a value. (we use compareLists() for this.)
     */
    @Override
    public void exitFunction_call(Function_callContext ctx) {

        Function function = (Function) symbolTable.searchSymbol(ctx.ID().getText());

        if (function != null) {

            LinkedList<DataType> expectedParameters = function.getDataTypeArgs();
            LinkedList<DataType> parameters = new LinkedList<>();
            Call_parameters_listContext callParameters = ctx.call_parameters_list();

            while (callParameters.getChildCount() != 0) {
                Call_parameterContext parameter = callParameters.call_parameter();

                if (parameter.NUMBER() != null) {
                    parameters.add(DataType.INT);
                } else if (parameter.ID() != null) {
                    String variableName = parameter.ID().getText();
                    Variable variable = (Variable) symbolTable.searchSymbol(variableName);

                    if (variable != null) {
                        if (!variable.getInitialized()) {
                            warningMessage += ("\nwarning: '" + variableName + "' is used uninitialized");
                        }
                        variable.setUsed(true);
                    } else {
                        throw new RuntimeException("error: '" + variableName + "' undeclared");
                    }

                    parameters.add(variable.getDataType());
                } else if (parameter.inc_dec() != null) {
                    String variableName = parameter.inc_dec().ID().getText();
                    Variable variable = (Variable) symbolTable.searchSymbol(variableName);

                    if (variable != null) {
                        if (!variable.getInitialized()) {
                            warningMessage += ("\nwarning: '" + variableName + "' is used uninitialized");
                        }
                        variable.setUsed(true);
                    } else {
                        throw new RuntimeException("error: '" + variableName + "' undeclared");
                    }

                    parameters.add(DataType.INT);
                } else if (parameter.function_call() != null) {
                    Function functionParameter = (Function) symbolTable
                            .searchSymbol(parameter.function_call().ID().getText());
                    parameters.add(functionParameter.getDataType());
                } else if (parameter.logical_arithmetic_expression() != null) {
                    parameters.add(DataType.INT);
                }

                if (callParameters.getChildCount() == 3) {
                    callParameters = (Call_parameters_listContext) callParameters.getChild(2);
                } else {
                    break;
                }

            }

            /*
             * Check if the number of returned parameters is the same as the expected
             * parameters
             */
            if (!compareLists(parameters, expectedParameters)) {
                throw new RuntimeException("Error: In function " + function.getName()
                        + " invalid parameters\n Obtained: " + parameters + "\n Expected " + expectedParameters);
            }

            function.setUsed(true);
        } else {
            throw new RuntimeException("Error: implicit declaration of function " + ctx.ID().getText());
        }
    }

    /* Just adds the local context of for, while, if, else instructions. */
    @Override
    public void enterFor_stmt(For_stmtContext ctx) {
        symbolTable.addContext();
    }

    @Override
    public void enterWhile_stmt(While_stmtContext ctx) {
        symbolTable.addContext();
    }

    @Override
    public void enterIf_stmt(If_stmtContext ctx) {
        symbolTable.addContext();
    }

    @Override
    public void enterElse_stmt(Else_stmtContext ctx) {
        symbolTable.addContext();
    }

    /*
     * This is only to exit the if, else, for and while instructions.
     * Adds the context of the instruction to the symbol table.
     */
    @Override
    public void exitInstruction(InstructionContext ctx) {
        if (!(ctx.getChild(0) instanceof Block_of_codeContext)) {
            if (ctx.getParent() instanceof For_stmtContext | ctx.getParent() instanceof If_stmtContext
                    | ctx.getParent() instanceof Else_stmtContext | ctx.getParent() instanceof While_stmtContext) {
                delContext();
            }
        }
    }

    /*
     * Log context to the symbol table file gets unused/uninitialized variables and
     * deletes the local context.
     */
    public void delContext() {

        symbolTable.saveSymbolTable(filePath);

        if (!symbolTable.getUnusedID().isEmpty()) {
            warningMessage += ("\nWarning: Unused " + symbolTable.getUnusedID());
        }

        if (!symbolTable.getUsedUninitialized().isEmpty()) {
            throw new RuntimeException(
                    "Error: undefined reference to '" + symbolTable.getUsedUninitialized().get(0) + "'");
        }

        symbolTable.delContext();
    }

    /*
     * We use it to compare if the list of parameters we want in a function call, is
     * the same as the list of parameters we get in return.
     */
    public <T> Boolean compareLists(LinkedList<T> list1, LinkedList<T> list2) {

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int dataType = 0; dataType < list1.size(); dataType++) {
            if (list1.get(dataType) != list2.get(dataType)) {
                return false;
            }
        }

        return true;
    }

}