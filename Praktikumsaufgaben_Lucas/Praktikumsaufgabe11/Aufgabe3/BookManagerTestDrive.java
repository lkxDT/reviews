import java.util.*;

public class BookManagerTestDrive {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook("Java von Kopf bis Fuß");
        manager.addBook("Effective Java");
        manager.printBooks();
    }
}
