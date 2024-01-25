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

    public Function (String name, DataType dataType, Boolean used, Boolean initialized) {
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
        LinkedList <DataType> dataTypes = new LinkedList<DataType>();

        for (Parameter parameter : this.args)
            dataTypes.add(parameter.getDataType());
        
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
        if(this.args.size() != prototypeArgs.size())
            return false;
        for(int i=0; i<this.args.size(); i++)
            if(this.args.get(i).getDataType() != prototypeArgs.get(i).getDataType())
                return false;
        
        return true;
    }
    
}
