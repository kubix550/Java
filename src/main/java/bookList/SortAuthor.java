package bookList;

import java.util.Comparator;

public class SortAuthor implements Comparator<Book> {
    @Override
    public int compare(Book book, Book book2) {
        return book.getAuthor().compareTo(book2.getAuthor());
    }
}