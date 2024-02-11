/**
 * The LabelGenerator class is a singleton class that generates unique labels for use in Three Address Code (TAC) generation.
 * The class maintains a list of labels and a count of the number of labels generated so far.
 * Each new label is named by appending the current count to a base string "l", and the count is then incremented.
 * A label is a reference point in the TAC that is used for control flow, such as branching and looping for GOTO instructions.
 * 
 * Here's a brief overview of its methods:
 * - getInstanceOf(): This static method returns the singleton instance of the LabelGenerator class. If the instance doesn't exist, it creates one.
 * - getNumberOfLabels(): This method returns the current count of labels.
 * - getLabels(): This method returns the list of all labels generated so far.
 * - getLastLabel(): This method returns the most recently created label.
 * - getNewLabel(String labelType): This method creates a new label, adds it to the list of labels, and returns the new label. The labelType parameter allows for different types of labels to be created.
 * 
 * This class is thread-safe and ensures that each label has a unique name, which is crucial for the correct execution of the generated TAC.
 */


package compiladores;

public class LabelGenerator {
    
}
