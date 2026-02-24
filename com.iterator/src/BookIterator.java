public class BookIterator implements Iterator<Book> {

    private BookCollection collection;
    private int position = 0;

    public BookIterator(BookCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return position < collection.getBooks().size();
    }

    @Override
    public Book next() {
        return collection.getBooks().get(position++);
    }
}