import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Aggregate<Book> {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(this);
    }
}