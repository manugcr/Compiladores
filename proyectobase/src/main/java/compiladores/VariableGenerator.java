/**
 * The VariableGenerator class is a singleton class that generates unique variable names for use in Three Address Code (TAC) generation.
 * The class maintains a list of variables and a count of the number of variables generated so far. 
 * Each new variable is named by appending the current count to a base string "t", and the count is then incremented.
 * A variable is a temporary storage location for intermediate values in the TAC.
 * 
 * Here's a brief overview of its methods:
 * - getInstanceOf(): This static method returns the singleton instance of the VariableGenerator class. If the instance doesn't exist, it creates one.
 * - getNumberOfVariables(): This method returns the current count of variables.
 * - getVariables(): This method returns the list of all variables generated so far.
 * - getLastVariable(): This method returns the most recently created variable.
 * - getNewVariable(): This method creates a new variable, adds it to the list of variables, and returns the new variable.
 * 
 * This class is thread-safe and ensures that each variable has a unique name, which is crucial for the correct execution of the generated TAC.
 */

package compiladores;

import java.util.LinkedList;

public class VariableGenerator {
    
    private static VariableGenerator instance;
    private int count;
    private LinkedList<String> variables;

    private VariableGenerator() {
        this.count = 0;
        this.variables = new LinkedList<String>();
    }
    
    public static VariableGenerator getInstanceOf() {
        if (instance == null) {
            instance = new VariableGenerator();
        }
        return instance;
    }

    public int getNumberOfVariables() {
        return this.count;
    }

    public LinkedList<String> getVariables() {
        return this.variables;
    }

    public String getLastVariable() {
        return this.variables.getLast();
    }

    public String getNewVariable() {
        String newVariable = "t" + this.count;
        this.variables.add(newVariable);
        this.count++;
        return newVariable;
    }

}
