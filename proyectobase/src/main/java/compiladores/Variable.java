package compiladores;

public class Variable extends ID {
    
    public Variable(String name, DataType dataType, Boolean used, Boolean initialized) {
        super.name = name;
        super.dataType = dataType;
        super.used = used;
        super.initialized = initialized;
    }

}
