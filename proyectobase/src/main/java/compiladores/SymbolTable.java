/**
 * This class implements a symbol table, a fundamental component in compilers and interpreters. The symbol table
 * organizes information about identifiers (symbols) encountered during the compilation process. Its purpose is to
 * track and manage the symbols' properties, such as their names, data types, usage status, and initialization status.
 * 
 * The symbol table is essential for various compiler tasks, including semantic analysis, code generation, and error
 * checking. It helps ensure consistency and correctness in the generated code by detecting undeclared variables,
 * type mismatches, and other semantic errors.
 * 
 * The symbol table is implemented using a hierarchical structure of contexts, represented by a linked list of maps.
 * Each context corresponds to a scope in the source code, such as a function or a block. The use of a linked list allows
 * for efficient handling of nested scopes, enabling proper scoping rules (e.g., variable shadowing).
 * 
 * Within each context, symbols are stored in a map data structure, specifically a LinkedHashMap, to preserve insertion
 * order. This choice ensures that symbols are processed in the order they were declared, facilitating error reporting
 * and symbol table visualization.
 * 
 * Key operations supported by the symbol table include adding and deleting contexts, adding symbols to the current
 * context, searching for symbols globally and locally within the current context, retrieving lists of unused and
 * uninitialized symbols, printing the symbol table to the console, saving it to a file, and deleting a file.
 */
    
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
            writer.write("----------------- Symbol Table -----------------\n");
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