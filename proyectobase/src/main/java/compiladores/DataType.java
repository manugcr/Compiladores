package compiladores;

public enum DataType {
    VOID, 
    INT, 
    DOUBLE, 
    CHAR, 
    STRING, 
    BOOLEAN;

    // Get dataType from string ignoring case
    public static DataType getDataType(String dataType) {
        switch (dataType.toLowerCase()) {
            case "void":
                return DataType.VOID;
            case "int":
                return DataType.INT;
            case "double":
                return DataType.DOUBLE;
            case "char":
                return DataType.CHAR;
            case "string":
                return DataType.STRING;
            case "boolean":
                return DataType.BOOLEAN;
            default:
                return null;
        }
    }
}