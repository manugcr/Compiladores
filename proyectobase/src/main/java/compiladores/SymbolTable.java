package compiladores;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class SymbolTable {
    private LinkedList<Map<String, ID>> list;
    private static SymbolTable instace;

    private SymbolTable() {
        this.list = new LinkedList<Map<String, ID>>();
    }

    
    public static SymbolTable getInstanceOf() {
        if (instace == null) {
            instace = new SymbolTable();
        }
        return instace;
    }


    public void addContext() {
        this.list.add(new LinkedHashMap<String, ID>());
    }


    public void delContext() {
        this.list.removeLast();
    }


    public void addSymbol(ID id) {
        this.list.getLast().put(id.getName(), id);
    }


    public ID searchSymbol(String name) {
        Iterator<Map<String, ID>> iterator = list.descendingIterator();

        while(iterator.hasNext()) {
            Map<String,ID> context = iterator.next();
            
            if(context.containsKey(name)) {
                return context.get(name);
            }
        }
        return null;
    }


    public ID searchLocalSymbol(String name) {
        if (list.getLast().containsKey(name)) {
            return list.getLast().get(name);
        }
        return null;
    }    


    public List<String> getUnusedID() {
        List<String> unusedList = new ArrayList<String>();

        for(Map.Entry<String, ID> entry: list.getLast().entrySet()) {
            if(!entry.getValue().getUsed()) {
                unusedList.add(entry.getKey());
            }
        }
        return unusedList;
    }


    public List<String> getUsedUninitialized() {
        List<String> usedUninitialized = new ArrayList<String>();

        for(Map.Entry<String, ID> entry: list.getLast().entrySet()) {
            if(entry.getValue() instanceof Function && entry.getValue().getUsed() && !entry.getValue().getInitialized()) {
                usedUninitialized.add(entry.getKey());
            }
        }
        return usedUninitialized;
    }


    public void printSymbolTable() {
        System.out.println("----------------- Symbol Table -----------------");
        System.out.println(String.format("%-20s%-10s%-6s%-12s\n", "NAME", "TYPE", "USED", "INITIALIZED"));
        for (Map<String, ID> map : this.list) {
            for (ID id : map.values()) {
                String name = id.getName();
                DataType type = id.getDataType();
                String used = String.valueOf(id.getUsed());
                String initialized = String.valueOf(id.getInitialized());
                System.out.println(String.format("%-20s%-10s%-6s%-12s\n", name, type, used, initialized));  
            }
        }
    }


    public void saveSymbolTable(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Write the headers of the symbol table.
            writer.write("----------------- Symbol Table Context -----------------\n");
            writer.write(String.format("%-20s%-10s%-6s%-12s\n", "NAME", "TYPE", "USED", "INITIALIZED"));
            for (Map<String, ID> map : this.list) {
                for (ID id : map.values()) {
                    String name = id.getName();
                    DataType type = id.getDataType();
                    String used = String.valueOf(id.getUsed());
                    String initialized = String.valueOf(id.getInitialized());
                    writer.write(String.format("%-20s%-10s%-6s%-12s\n", name, type, used, initialized));
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to write file: " + filePath);
        }
    }
    


    public void delFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
}