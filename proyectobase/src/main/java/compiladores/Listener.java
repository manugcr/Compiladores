package compiladores;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.Block_of_codeContext;
import compiladores.compiladoresParser.Function_stmtContext;
import compiladores.compiladoresParser.ProgramContext;
import compiladores.compiladoresParser.Return_stmtContext;
import compiladores.compiladoresParser.InstructionsContext;

public class Listener extends compiladoresBaseListener { 
    private SymbolTable symbolTable = SymbolTable.getInstanceOf();
    String filePath = "./symbolTable.log";
    String warningMessage = "";

    public void delContext() {

        symbolTable.saveSymbolTable(filePath);
        //Unused variables and functions
        if(!symbolTable.getUnusedID().isEmpty())
            warningMessage += ("\nWarning: Unused " + symbolTable.getUnusedID()); 
 
        //The prototypes defined in this context lose their scope, therefore it is verified if they were
        // used and not initialized
        if(!symbolTable.getUsedUninitialized().isEmpty()) 
            throw new RuntimeException("error: undefined reference to '" + symbolTable.getUsedUninitialized().get(0) + "'");

        symbolTable.delContext();
    }

    @Override
    public void enterProgram(ProgramContext ctx) {
        symbolTable.delFile(filePath);

        System.out.println("\n---------------------");
        System.out.println("  <<Listener begins>>  ");
        System.out.println("---------------------");

        symbolTable.addContext();
    }

    @Override
    public void exitProgram(ProgramContext ctx) {
        delContext();
        System.out.println(warningMessage);

        System.out.println("---------------------");
        System.out.println("  <<Listener ends>>  ");
        System.out.println("---------------------\n");
    }

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

    @Override
    public void exitBlock_of_code(Block_of_codeContext ctx){
        
        if(ctx.getParent() instanceof Function_stmtContext) {
            //Function return type
            DataType returnType =  DataType.getDataType(ctx.getParent().getChild(0).getChild(0).getText());
            Boolean returnFlag = false;

            InstructionsContext instructions = ctx.instructions();

            while(instructions.getChildCount() != 0) {
                //Look for the return statement
                if(instructions.instruction().getChild(0) instanceof Return_stmtContext) {
                    returnFlag = true;
                    //System.out.println(instructions.instruction().getChild(0).getChild(1));
                    break;
                }
                instructions = (InstructionsContext) instructions.instructions();
            }

            if(returnType.toString() == "VOID" && returnFlag) 
                throw new RuntimeException("error: 'return' with a value in function returning void");

            if(returnType.toString() != "VOID" && !returnFlag)
                throw new RuntimeException("error: control reaches end of non-void function [-Wreturn-type]");
        }

        delContext();
    }
    
    @Override
    public void visitTerminal(TerminalNode node) {
        // System.out.println("    TOKEN --> " + node.getText());
    }
}