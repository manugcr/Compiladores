package compiladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CodeOptimizer {
    
    private String initialCode;
    private String optimizedCode;
    private String filePath = "./optimizedCode.txt";

    public CodeOptimizer(String initialCode) {
        this.initialCode = initialCode;
        this.optimizedCode = "";
    }

    public String optimizeCode() {
        System.out.println("\n ----------- Optimizer begins ----------- ");

        optimizedCode = removeUnnecessaryAssignmets(initialCode);
        optimizedCode = removeUnusedVariables(optimizedCode);
        optimizedCode = removeLineBreak(optimizedCode);

        

        File file = new File(filePath);
        if(file.exists())
            file.delete();
        
        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(optimizedCode);
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nOptimized code written to " + filePath);
        System.out.println("\n ----------- Optimizer ends ------------- ");

        return optimizedCode;
    }

    /**
     * Find expressions like some = t_n. Then replace all occurrences of t_n with wht 
     *  value on the left.
     * 
     * Example:
     *  
     *      t1 = 10*5
     *      t2 = t1
     *      a = t2
     *      .........
     *      t2 = 10*5
     *      a = t2
     *      .........
     *      a = 10*5
     * 
     */
    public String removeUnnecessaryAssignmets(String code) {
        String optCode = "";

        String[] lines = code.split("\n");

        Pattern pattern = Pattern.compile("\\b([a-zA-Z0-9]+)\\s?=\\s?(t(?!.*[*/+\\-=<>|&])\\d+)\\b");

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()) {
                String left = matcher.group(1);
                String right = matcher.group(2);
                optCode = optCode.replace(right, left);
            }
            else {
                optCode += line + "\n";
            }
        }

        return optCode;
    }

    /**
     * First finds assigned variables and then walks through the code seeing if they
     *  are actually used
     * 
     */
    public String removeUnusedVariables(String code) {
        
        LinkedList<String> lines = new LinkedList<>(Arrays.asList(code.split("\n")));
        LinkedList<Integer> toRemove = new LinkedList<>();

        Pattern pattern = Pattern.compile("\\b(\\w+)\\s?=\\s?(\\w+)\\b");

        for(int i=0; i<lines.size(); i++) {
            Matcher matcher = pattern.matcher(lines.get(i));

            if(matcher.find()) {
                toRemove.push(i);
                for(int j=0; j<lines.size(); j++) {
                    String line = lines.get(j);
                    String match = matcher.group(1);
                    if (line.contains(match) && j!=i) {
                        toRemove.pop();
                        break;
                    }
                }
            }
            
        }

        for(int index : toRemove)
            lines.remove(index);
        String optCode = "";    
        for(String line : lines)
            optCode += line + "\n";

        return optCode;
    }

    /**
     * Remove all line breaks
     * 
     */
    public String removeLineBreak(String code) {
        String optCode = "";

        LinkedList<String> lines = new LinkedList<>(Arrays.asList(code.split("\n")));

        for(String line : lines) {
            if(!line.trim().isEmpty()) {
                optCode += line + "\n";
            }
        }

        return optCode;
    }
}
