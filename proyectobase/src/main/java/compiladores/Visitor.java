package compiladores;


import compiladores.compiladoresParser.ProgramContext;

public class Visitor extends compiladoresBaseVisitor<String> {


    @Override
    public String visitProgram(ProgramContext ctx) {
        System.out.println("Comienza el visitor:");
        return super.visitProgram(ctx);
    }
    
}
