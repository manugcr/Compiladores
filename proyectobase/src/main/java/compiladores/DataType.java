package compiladores;

public enum DataType {
    INT,
    DOUBLE,
    CHAR,
    VOID,
    STRING,
    BOOLEAN;

    public static DataType getDataType(String dataType) {
        switch (dataType.toUpperCase()) {
            case "INT":
                return DataType.INT;
            case "DOUBLE":
                return DataType.DOUBLE;
            case "CHAR":
                return DataType.CHAR;
            case "VOID":
                return DataType.VOID;
            case "STRING":
                return DataType.STRING;
            case "BOOLEAN":
                return DataType.BOOLEAN;
            default:
                throw new IllegalArgumentException("DataType not found");
        }
    }
    
}


