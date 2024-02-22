/**
 * This abstract class represents an identifier (ID) within the symbol table. In programming languages, identifiers
 * typically refer to variables, constants, functions, or other named entities. The ID class encapsulates common
 * properties associated with identifiers, such as their name, data type, usage status, and initialization status.
 * 
 * The name field stores the identifier's name, allowing it to be uniquely identified within the program.
 * 
 * The dataType field specifies the data type of the identifier, providing information about the kind of value it can
 * hold (e.g., integer, floating-point, string).
 * 
 * The used field indicates whether the identifier has been referenced (used) within the program. This information
 * is crucial for detecting unused variables or functions, which may indicate errors or unnecessary code.
 * 
 * The initialized field tracks whether the identifier has been assigned a value or initialized. This helps detect
 * potential usage of uninitialized variables, preventing undefined behavior and potential bugs.
 * 
 * The class provides getter and setter methods for accessing and modifying these properties, ensuring encapsulation
 * and controlled access to the identifier's state.
 * 
 * Concrete subclasses of ID may extend this class to include additional properties or behavior specific to different
 * types of identifiers (e.g., functions may have parameters and return types).
 * 
 * The ID class is abstract because it represents a generic identifier in your symbol table.
 */


package compiladores;

public abstract class ID {
    
    String name;
    String value;
    DataType dataType;
    Boolean used;
    Boolean initialized;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Boolean getUsed() {
        return this.used;
    }

    public void setInitialized(Boolean initialized) {
        this.initialized = initialized;
    }

    public Boolean getInitialized() {
        return this.initialized;
    }

    public void setValue(String valor) {
        this.value = valor;
    }

    public String getValue() {
        return this.value;
    }
}
