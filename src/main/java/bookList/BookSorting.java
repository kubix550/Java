package bookList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSorting {

    public static void main(String[] args) {
        Book ksiazka1 = new Book("As Red as Blood", "Salla Simukka", 272, 36);
        Book ksiazka2 = new Book("Catalyst: A Rogue One Novel", "James Luceno", 496, 27);
        Book ksiazka3 = new Book("The Testing", "Joelle Charbonneau", 352, 35);
        Book ksiazka4 = new Book("Monument 14", "Emmy Laybourne", 344, 30);
        Book ksiazka5 = new Book("Free to Fall", "Lauren Miller", 496, 35);
        Book ksiazka6 = new Book("Ready Player One", "Ernest Cline", 400, 38);
        Book ksiazka7 = new Book("Toradora", "Yuyuko Takemiya", 240, 38);

        List<Book> bookList = new ArrayList<>();
        bookList.add(ksiazka1);
        bookList.add(ksiazka2);
        bookList.add(ksiazka3);
        bookList.add(ksiazka4);
        bookList.add(ksiazka5);
        bookList.add(ksiazka6);
        bookList.add(ksiazka7);

        // mozna po wprowadzeniu informacji podac sposob sortowania, moze byc z reversem albo nie

        System.out.println(ksiazka1.compareTo(ksiazka2));   //metoda compareTo, this to ksiazka1 a ksiazka2 to book, mozna to ifem porownac
        Collections.sort(bookList);                         //collections to kolekcja mozna uzyc w arraylist, sort sortuje kolekcje, WIEC JAK SIE wpisze to bedzie posortowane bez odwrotu
        System.out.println(bookList);                           //trzeba uzyc zewn komparatorow zeby posortowac po innuchj parametrach
        System.out.println();


        // tu zewmetrzny
        Collections.sort(bookList, new SortPages());
        Collections.reverse(bookList);                  //to odwraca kolejnosc sortowania
        System.out.println(bookList);
    }
}