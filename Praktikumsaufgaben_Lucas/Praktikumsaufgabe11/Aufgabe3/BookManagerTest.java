import java.util.NoSuchElementException;
public class BookManagerTest {
    public static void main(String[] args) {
        testAddBook();
        testRemoveBook();
        testRemoveBookNotFound();
        testPrintBooks();
    }

    public static void testAddBook() {
        BookManager manager = new BookManager();
        manager.addBook("Test Book");
        if (manager.getBooks().size() != 1) {
            System.out.println("testAddBook failed: size mismatch");
        } else if (!"Test Book".equals(manager.getBooks().get(0).getName())) {
            System.out.println("testAddBook failed: name mismatch");
        } else {
            System.out.println("testAddBook passed");
        }
    }

    public static void testRemoveBook() {
        BookManager manager = new BookManager();
        manager.addBook("Test Book");
        manager.removeBook("Test Book");
        if (manager.getBooks().size() != 0) {
            System.out.println("testRemoveBook failed");
        } else {
            System.out.println("testRemoveBook passed");
        }
    }

    public static void testRemoveBookNotFound() {
        BookManager manager = new BookManager();
        manager.addBook("Test Book");
        try {
            manager.removeBook("Nonexistent Book");
            System.out.println("testRemoveBookNotFound failed");
        } catch (NoSuchElementException e) {
            System.out.println("testRemoveBookNotFound passed");
        }
    }

    public static void testPrintBooks() {
        BookManager manager = new BookManager();
        manager.addBook("Test Book 1");
        manager.addBook("Test Book 2");
        manager.printBooks();
        // This test is for manual verification of the print output
    }
}
