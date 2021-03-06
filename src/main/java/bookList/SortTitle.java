package bookList;

import java.util.Comparator;

public class SortTitle implements Comparator<Book> {
    @Override
    public int compare(Book book, Book book2) {
        return book.getTitle().compareTo(book2.getTitle());
    }
}
