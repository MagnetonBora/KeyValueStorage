package kvs;

import java.util.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

class Item {

    private Map<String, Object> item = null;

    public Item() {
        super();
        item = new HashMap<String, Object>();
    };

    public Item(String key, Object value) {
        item = new HashMap<String, Object>();
        item.put(key, value);
    };

    @Override
    public String toString() {
        return item.toString();
    };

}

class Record {

    private int id;
    private String name;

    public Record() {
        super();
    };

    public Record(int id, String name) {
        this.id = id;
        this.name = name;
    };

    public int getId() {
        return id;
    };

    public  String getName() {
        return name;
    };

    @Override
    public String toString() {
        return "item (id, name) => " + "(" + id + ", " + name + ")";
    }
};

class CRUD {

    private List<Record> storage = null;

    public CRUD() {
        super();
        storage = new ArrayList<Record>();
    };

    public CRUD add(Record record) {
        storage.add(record);
        return this;
    };

    public void get() throws NotImplementedException {
        throw new NotImplementedException();
    };

    public void update() throws NotImplementedException {
        throw new NotImplementedException();
    };

    public void delete() throws NotImplementedException {
        throw new NotImplementedException();
    };

    @Override
    public String toString() {
        String buf = "";
        for(Record record : storage) {
            buf += record + "\n";
        }
        return buf;
    };

};