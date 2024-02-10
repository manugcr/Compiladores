/**
 * This class represents a function identifier within the symbol table. In programming languages, functions are named
 * blocks of code that perform a specific task and can be called from other parts of the program. The Function class
 * extends the ID class to inherit common properties such as name, data type, usage status, and initialization status.
 * Additionally, it introduces specific functionality and properties related to functions.
 * 
 * The args field stores a list of parameters (inputs) associated with the function. Each parameter is represented by
 * the Parameter class, which encapsulates information about its data type and name.
 * 
 * The isPrototype field indicates whether the function is a prototype declaration, typically used in function
 * declarations to specify the function's signature without providing its implementation. This distinction is important
 * during semantic analysis and code generation.
 * 
 * The class provides methods to manipulate and access these properties, including adding arguments to the function,
 * retrieving argument data types, determining whether the function matches a given prototype (in terms of argument
 * types), and managing the prototype status.
 * 
 * By extending the ID class, the Function class leverages encapsulation and code reuse, promoting maintainability
 * and consistency within the symbol table implementation.
 */


package compiladores;

import java.util.LinkedList;

class Parameter {
    private DataType dataType;
    private String name;

    public Parameter(DataType dataType, String name) {
        this.dataType = dataType;
        this.name = name;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public String getName() {
        return this.name;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Function extends ID {

    private LinkedList<Parameter> args;
    private Boolean isPrototype;

    public Function(String name, DataType dataType, Boolean used, Boolean initialized) {
        super.name = name;
        super.dataType = dataType;
        super.used = used;
        super.initialized = initialized;
        this.args = new LinkedList<Parameter>();
        this.isPrototype = false;
    }

    public void setArgs(LinkedList<Parameter> args) {
        this.args = args;
    }

    public LinkedList<Parameter> getArgs() {
        return this.args;
    }

    public LinkedList<DataType> getDataTypeArgs() {
        LinkedList<DataType> dataTypes = new LinkedList<DataType>();

        for (Parameter parameter : this.args) {
            dataTypes.add(parameter.getDataType());
        }

        return dataTypes;
    }

    public void addArg(DataType arg, String name) {
        Parameter parameter = new Parameter(arg, name);
        args.add(parameter);
    }

    public void setIsPrototype(Boolean isPrototype) {
        this.isPrototype = isPrototype;
    }

    public Boolean getIsPrototype() {
        return this.isPrototype;
    }

    public Boolean compareArgs(LinkedList<Parameter> prototypeArgs) {
        if (this.args.size() != prototypeArgs.size()) {
            return false;
        }
        for (int i = 0; i < this.args.size(); i++) {
            if (this.args.get(i).getDataType() != prototypeArgs.get(i).getDataType()) {
                return false;
            }
        }
        return true;
    }

}
