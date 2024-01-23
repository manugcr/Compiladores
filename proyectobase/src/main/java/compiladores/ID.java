package compiladores;


public abstract class ID {
    protected String name;
    protected DataType dataType;
    protected Boolean used;
    protected Boolean initialized;

    public ID(String name, DataType dataType, Boolean used, Boolean initialized) {
        this.name = name;
        this.dataType = dataType;
        this.used = used;
        this.initialized = initialized;
    }

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
}
