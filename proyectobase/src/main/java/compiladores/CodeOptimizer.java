package compiladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeOptimizer {
    
    private String inputCode;
    private String outputCode;
    private String filePath = "./optimizedCode.txt";

    public CodeOptimizer(String inputCode) {
        this.inputCode = inputCode;
        this.outputCode = "";
    }

    public String optimizeCode() {
        System.out.println("\n ----------- Optimizer begins ----------- ");

        // Remove redundant assignments
        cleanAssignments();

        // Remove unused variables
        cleanVariables();
        
        // Save optimized code to filePath.
        File file = new File(filePath);
        if(file.exists())
            file.delete();
        
        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(outputCode);
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nOptimized code written to " + filePath);
        System.out.println("\n ----------- Optimizer ends ------------- ");

        return outputCode;
    }

    /*
     * Remove redundant assignments.
     * For example:
     *      t0 = 5;             t1 = 5
     *      t1 = t0;    --->    t2 = t1     --->    t2 = 5
     *      t2 = t1;
     * 
     * We search for the pattern t_n = val and replace all the ocurrences of t_n with val.
     */
    private void cleanAssignments() {
        String[] lines = inputCode.split("\n");
        
        for (String line : lines) {
            

            outputCode += line + "\n";
        }

    }
    


    /*
    * Remove unused variables.
    *      We could use the symbol table to check if a variable is used or not.
    *      Alternatively, we could read every line of the TAC code and check if a variable appears more than once.
    */ 
    private void cleanVariables() {

    }
}
