package bookList;

import java.util.Comparator;

public class SortPrice implements Comparator<Book> {

    @Override
    public int compare(Book book, Book book2) {
        return book.getPrice() - book2.getPrice();
    }
}