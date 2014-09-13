package kvs;

public class Main {

    public static void enterMessage() {
        System.out.println("Starting server");
        System.out.println("...............");
    };

    public static void basicUseCase() {
        CRUD db = new CRUD();
        db.add(new Record(1, "one"));
        db.add(new Record(2, "two"));
        db.add(new Record(3, "three"));
        System.out.print(db);
    };

    public static void main(String[] args) {

        enterMessage();
//        basicUseCase();

        

    }
}
