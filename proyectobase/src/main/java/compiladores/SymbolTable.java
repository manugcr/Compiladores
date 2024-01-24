package compiladores;

import java.util.LinkedList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;

public class SymbolTable {
    private LinkedList<Map<String, ID>> list;
    private static SymbolTable instace;

    private SymbolTable() {
        this.list = new LinkedList<Map<String, ID>>();
    }

    public static SymbolTable getInstanceOf() {
        if (instace == null)
            instace = new SymbolTable();
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
        for (Map<String, ID> map : this.list) {
            if (map.containsKey(name))
                return map.get(name);
        }
        return null;
    }

    public ID searchLocalSymbol(String name) {
        return this.list.getLast().get(name);
    }

    public List<String> getUnusedID() {
        List<String> unusedID = new LinkedList<String>();
        for (Map<String, ID> map : this.list) {
            for (ID id : map.values()) {
                if (!id.getUsed())
                    unusedID.add(id.getName());
            }
        }
        return unusedID;
    }

    public List<String> getUsedUninitialized() {
        List<String> usedUninitialized = new LinkedList<String>();
        for (Map<String, ID> map : this.list) {
            for (ID id : map.values()) {
                if (id.getUsed() && !id.getInitialized())
                    usedUninitialized.add(id.getName());
            }
        }
        return usedUninitialized;
    }

    public void printSymbolTable() {
        for (Map<String, ID> map : this.list) {
            for (ID id : map.values()) {
                System.out.println(id.getName() + " " + id.getDataType() + " " + id.getUsed() + " " + id.getInitialized());
            }
        }
    }

}
