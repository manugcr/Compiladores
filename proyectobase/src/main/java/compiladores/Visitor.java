package compiladores;


import compiladores.compiladoresParser.ProgramContext;

public class Visitor extends compiladoresBaseVisitor<String> {


    @Override
    public String visitProgram(ProgramContext ctx) {
        System.out.println("\n ----------- Visitor begins ------------\n");
        
        // Implement here...

        System.out.println("\n ----------- Visitor ends --------------\n");
        return super.visitProgram(ctx);
    }


    
}
