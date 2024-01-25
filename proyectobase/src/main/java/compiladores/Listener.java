package compiladores;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.ErrorNode;

import compiladores.compiladoresParser.AssignmentContext;
import compiladores.compiladoresParser.Block_of_codeContext;
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
import compiladores.compiladoresParser.While_stmtContext;
import compiladores.compiladoresParser.InstructionsContext;

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


    @Override
    public void exitFactor(FactorContext ctx) {
        // TODO Auto-generated method stub
        super.exitFactor(ctx);
    }


    @Override
    public void exitFunction_call(Function_callContext ctx) {
        // TODO Auto-generated method stub
        super.exitFunction_call(ctx);
    }


    @Override
    public void exitFunction_declaration(Function_declarationContext ctx) {
        // TODO Auto-generated method stub
        super.exitFunction_declaration(ctx);
    }


    @Override
    public void exitFunction_prototype(Function_prototypeContext ctx) {
        // TODO Auto-generated method stub
        super.exitFunction_prototype(ctx);
    }


    @Override
    public void exitStatement(StatementContext ctx) {
        // TODO Auto-generated method stub
        super.exitStatement(ctx);
    }

}