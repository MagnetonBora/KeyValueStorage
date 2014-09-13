package kvs;

import java.util.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    public void add(Record record) {
        storage.add(record);
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