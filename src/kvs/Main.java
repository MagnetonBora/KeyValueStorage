package kvs;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Main {

    public static class Record {

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

    public static void enterMessage() {
        System.out.println("Starting server");
        System.out.println("...............");
    };

    public static class CRUD {

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

    public static void main(String[] args) {

        enterMessage();

        CRUD db = new CRUD();

        db.add(new Record(1, "one"));
        db.add(new Record(2, "two"));
        db.add(new Record(3, "three"));

        System.out.print(db);

    }
}
