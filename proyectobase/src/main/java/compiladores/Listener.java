package compiladores;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.Block_of_codeContext;
import compiladores.compiladoresParser.Function_stmtContext;
import compiladores.compiladoresParser.ProgramContext;

public class Listener extends compiladoresBaseListener { 
    private SymbolTable symbolTable = SymbolTable.getInstanceOf();
    String filePath = "./symbolTable.log";
    String warningMessage = "";

    public void saveContextToFile() {
        symbolTable.saveSymbolTable(filePath);

        if(!symbolTable.getUnusedID().isEmpty())
            warningMessage += ("\nWarning: Unused " + symbolTable.getUnusedID()); 
 
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
        saveContextToFile();
        System.out.println(warningMessage);

        System.out.println("---------------------");
        System.out.println("  <<Listener ends>>  ");
        System.out.println("---------------------\n");
    }

    @Override
    public void enterBlock_of_code(Block_of_codeContext ctx) {
        System.out.println("Entered block of code: " + ctx.getText());

        if (ctx.getParent() instanceof Function_stmtContext) {
            symbolTable.addContext();
            Function function = (Function) symbolTable.searchSymbol(ctx.getParent().getChild(0).getChild(1).getText());
            System.out.println(ctx.getParent().getChild(0).getChild(1).getText());
            LinkedList<Parameter> parameters = function.getArgs();
            for (Parameter parameter : parameters) {
                Variable variable = new Variable(parameter.getName(), parameter.getDataType(), false, true);
                symbolTable.addSymbol(variable);
            }
        }
    }

    @Override
    public void exitBlock_of_code(Block_of_codeContext ctx) {
        System.out.println("Exited block of code: " + ctx.getText());
    }
    
    @Override
    public void visitTerminal(TerminalNode node) {
        // System.out.println("    TOKEN --> " + node.getText());
    }
}