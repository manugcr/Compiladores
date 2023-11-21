package compiladores;

import compiladores.compiladoresParser.AssignmentContext;
import compiladores.compiladoresParser.DefinitionContext;
import compiladores.compiladoresParser.ProgramContext;
import compiladores.compiladoresParser.ListContext;

public class Visitor extends compiladoresBaseVisitor<String> {

    @Override
    public String visitAssignment(AssignmentContext ctx) {
        String tmp;
        System.out.println("Declaracion: " + ctx.getText());        
        System.out.println("    --> hijos = " + ctx.getChildCount());        
        if (ctx.getChild(2).getChildCount() > 0) {
            tmp = visitDefinition((DefinitionContext)ctx.getChild(2));
        }
        if (ctx.getChild(3).getChildCount() > 0) {
            tmp = visitList((ListContext)ctx.getChild(3));
        }
        return null;
    }

    @Override
    public String visitDefinition(DefinitionContext ctx) {
        System.out.println("Definicion: " + ctx.getText());        
        System.out.println("    --> hijos = " + ctx.getChildCount());        
        return super.visitDefinition(ctx);
    }

    @Override
    public String visitProgram(ProgramContext ctx) {
        System.out.println("Comienza el visitor:");
        return super.visitProgram(ctx);
    }
    
}
