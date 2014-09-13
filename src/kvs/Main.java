package kvs;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {

    public static void enterMessage() {
        System.out.println("Starting server");
        System.out.println("...............");
    };

    public static void basicUseCase() {
        CRUD db = new CRUD();

        db.add(new Record(1, "one"))
          .add(new Record(2, "two"))
          .add(new Record(3, "three"));

        System.out.print(db);
    };

    public static void main(String[] args) {

        enterMessage();
//        basicUseCase();

        Item item = new Item("one", new Item("foo", -1));
        System.out.print(item);

    }
}
