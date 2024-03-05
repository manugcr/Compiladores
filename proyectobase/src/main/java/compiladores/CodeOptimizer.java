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
     * 
     * For example if we start with:
     * 
     *      t0 = 5
     *      t1 = t0
     *      var1 = t1
     * 
     * We should end with:
     * 
     *      var1 = 5
     * 
     * Search for the pattern t_n = x and replace all occurrences of t_n with x.
     * The we should delete the line t_n = x and lines containing unnecessary assignments except the last one.
     * Only leaving the last assignment for example var1 in this case.
     */
    private void cleanAssignments() {

    }


    /*
    * Remove unused variables.
    *      We could use the symbol table to check if a variable is used or not.
    *      Alternatively, we could read every line of the TAC code and check if a variable appears more than once.
    */ 
    private void cleanVariables() {

    }
}
