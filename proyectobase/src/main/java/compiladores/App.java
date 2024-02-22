package compiladores;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {

        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("input/input.c");

        // create a lexer that feeds off of input CharStream
        compiladoresLexer lexer = new compiladoresLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        compiladoresParser parser = new compiladoresParser(tokens);
                
        // create Listener
        compiladoresBaseListener listener = new Listener();

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(listener);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree = null;
        try {
            // Comenzamos el parseo por la regla inicial
            tree = parser.program();

            // Conectamos el visitor y creamos el codigo intermedio
            Visitor visitor = new Visitor();
            String TAC = visitor.visit(tree);

            // Optimizamos el código
            CodeOptimizer optimizer = new CodeOptimizer(TAC);
            optimizer.optimizeCode();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}