package compiladores;

import compiladores.compiladoresParser.AssignmentContext;
import compiladores.compiladoresParser.Block_of_codeContext;
import compiladores.compiladoresParser.ProgramContext;

public class Listener extends compiladoresBaseListener{
    private Integer context = 0;

    
    @Override
    public void enterProgram(ProgramContext ctx) {
        System.out.println("\nComienza la compilacion (LISTENER).");
        super.enterProgram(ctx);
    }

    @Override
    public void exitProgram(ProgramContext ctx) {
        System.out.println("Termina la compilacion (LISTENER).\n");
        super.exitProgram(ctx);
    }

    @Override
    public void enterAssignment(AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(AssignmentContext ctx) {
        System.out.println("Asignacion (out) Hijos = " + ctx.getChildCount() + ": "+ ctx.getText() );
        System.out.println(ctx.getChild(0).getText());
    }

    @Override
    public void enterBlock_of_code(Block_of_codeContext ctx) {
        context++;
    }

    @Override
    public void exitBlock_of_code(Block_of_codeContext ctx) {
        System.out.println("Fin contexto " + context);
        context--;
    }

}
