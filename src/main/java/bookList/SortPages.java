package bookList;

import java.util.Comparator;

public class SortPages implements Comparator<Book> {            //comparable vs comparator


    @Override
    public int compare(Book book, Book book2) {
        return book.getPageCount() - book2.getPageCount();      // zwraca rozne liczby w zaleznosci od tego ktory book wiekszy/mniejszy/rowny
    }
}