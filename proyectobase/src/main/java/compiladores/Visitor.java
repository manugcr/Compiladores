package compiladores;


import compiladores.compiladoresParser.ProgramContext;

public class Visitor extends compiladoresBaseVisitor<String> {


    @Override
    public String visitProgram(ProgramContext ctx) {
        System.out.println("\n-------------------\n<<Visitor begins>>\n-------------------");
        System.out.println("\n-------------------\n<<Visitor ends>>\n-------------------");
        return super.visitProgram(ctx);
    }


    
}
