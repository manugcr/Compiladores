package compiladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class CodeOptimizer {
    
    private String inputCode;
    private String outputCode;
    private String filePath = "./optimizedCode.txt";

    public CodeOptimizer(String initialCode) {
        this.inputCode = initialCode;
        this.outputCode = "";
    }

    public String optimizeCode() {
        System.out.println("\n ----------- Optimizer begins ----------- ");



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


}
