import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
    }

    public void printBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("- " + book.getName());
        }
    }

    public void removeBook(String assumedName) {
        int index = getIndex(assumedName);
        books.remove(index);
    }

    private int getIndex(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(title)) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
