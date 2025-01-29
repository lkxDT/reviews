public class Book {
    private String name;

    public Book(String name) {
        if(name == null || name.equals(""))
        {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
