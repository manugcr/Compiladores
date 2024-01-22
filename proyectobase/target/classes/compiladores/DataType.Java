package compiladores;

public enum DataType {
    VOID,
    INT,
    DOUBLE,
    CHAR;

    public static DataType getDataTypeFromString(String dataType) {
        for(DataType data : DataType.values())
            if(data.name().equalsIgnoreCase(dataType.toUpperCase()))
                return data;
        throw new IllegalArgumentException("The specified data type was not found");
    }
}