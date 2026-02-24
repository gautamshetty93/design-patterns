public class Client {
    public static void main(String[] args) {

        BookCollection collection = new BookCollection();

        collection.addBook(new Book("Clean Code"));
        collection.addBook(new Book("Design Patterns"));
        collection.addBook(new Book("Effective Java"));

        Iterator<Book> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
