package compiladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class CodeOptimizer {

    private String inputCode;
    private String outputCode;
    private String filePath = "./output/optimizedCode.txt";

    public CodeOptimizer(String inputCode) {
        this.inputCode = inputCode;
        this.outputCode = "";
    }

    public String optimizeCode() {
        System.out.println("\n ----------- Optimizer begins ----------- ");

        // Split the input code into lines
        List<String> lines = Arrays.asList(inputCode.split("\n"));

        // Apply the optimizations
        lines = propagateConstants(lines);
        lines = eliminateDeadCode(lines);
        lines = removeEmptyLines(lines);

        // Join the optimized lines into a single string
        outputCode = String.join("\n", lines);

        // Save optimized code to filePath
        File file = new File(filePath);
        if (file.exists())
            file.delete();

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(outputCode);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Optimized code written to " + filePath);
        System.out.println(" ----------- Optimizer ends ------------- ");

        return outputCode;
    }

    private List<String> propagateConstants(List<String> code) {
        List<String> optimizedCode = new ArrayList<>();
        Map<String, String> constants = new HashMap<>();

        for (String line : code) {
            // Match lines of the form "t_n = constant"
            if (line.matches("t\\d+ = \\d+")) {
                String[] parts = line.split(" = ");
                constants.put(parts[0], parts[1]);
            } else {
                // Replace constants in other lines
                for (String key : constants.keySet()) {
                    line = line.replace(key, constants.get(key));
                }
                optimizedCode.add(line);
            }
        }

        return optimizedCode;
    }

    private List<String> eliminateDeadCode(List<String> code) {
        List<String> optimizedCode = new ArrayList<>();
        Set<String> usedVariables = new HashSet<>();

        // Reverse pass to identify used variables
        for (int i = code.size() - 1; i >= 0; i--) {
            String line = code.get(i);
            Matcher m = Pattern.compile("t\\d+ = (.*)").matcher(line);
            if (m.find()) {
                String rhs = m.group(1).trim();
                if (usedVariables.contains(rhs)) {
                    optimizedCode.add(0, line);
                    usedVariables.add(line.split(" = ")[0].trim());
                }
            } else {
                optimizedCode.add(0, line);
                String[] parts = line.split(" ");
                for (String part : parts) {
                    if (part.matches("t\\d+")) {
                        usedVariables.add(part);
                    }
                }
            }
        }

        return optimizedCode;
    }

    private List<String> removeEmptyLines(List<String> code) {
        List<String> optimizedCode = new ArrayList<>();

        for (String line : code) {
            if (!line.trim().isEmpty()) {
                optimizedCode.add(line);
            }
        }

        return optimizedCode;
    }
}
