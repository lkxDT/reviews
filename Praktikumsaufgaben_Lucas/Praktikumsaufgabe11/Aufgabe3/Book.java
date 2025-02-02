public class Book {
    private String name;

    public Book(String name) {
        if(name == null || name.equals(""))
        {
            throw new IllegalArgumentException();
        } else {
            this.name=name;
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
