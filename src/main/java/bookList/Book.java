package bookList;
// klasa 3
//   17.Utwórz klasę bookList.Book przechowującą informacje o książce: np title,author,pageCount,price,
//   1)W klasie testujacej utwórz listę książek i posortuj je po autorze.
//   2)Napisz komparatory do sortowania ksiązek po ilości stron oraz po cenie i tytule.
//   3)Napisz klasę testującą cały program.

public class Book // implements Comparable<Book> {   interfejs mowi co klasa ma robic W ZEWN JEST COMPARATOR I COMPARE
{
    private String title;
    private String author;
    private int pageCount;
    private int price;

    public Book(String title, String author, int pageCount, int price) {
        this.title = title;
        this.author = author;
        setPageCount(pageCount);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "bookList.Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", price=" + price +
                '}';
    }

    // getter i setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0) this.pageCount = pageCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) this.price = price;
    }
}



//SORTOWANIE WEWNATRZ, PO TYTULE
//    @Override                                                  // jak to usunac to sie kod rozsypie wiec lepiej nie
//    public int compareTo(Book book) {
//        return this.getTitle().compareTo(book.getTitle());
//    }
//}


//SORTOWANIE WEWNATRZ, PO CENIE, DLUZSZY KOD

//        if (this.getPrice() == book.getPrice()) {                 //0 - identyczne, -1 ksiazka jako parametr jest wieksza, +1 jest mniejsza (jako cena)
//            return 0;                                             //brak if bo sie porownuje od razu, cena musiala miec if bo byl int
//        }
//
//        else if (this.getPrice() < book.getPrice()) {
//            return -1;
//        }
//
//        return 1;
//    }
