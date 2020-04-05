package bookList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);
        String sortingType;
        String sortingOrder;

        while (true) {
            System.out.println("Wybierz typ sortowania: autor, tytul, cena, strony");
            sortingType = input.nextLine();

            switch (sortingType) {

                //SORTOWANIE AUTORA ZEWNETRZNY KOMPARATOR
                case "autor":{                                                      //znajduje pasujace przypadki i wyswietla wszystko po kolei dalej, chyba ze napotka break
                    System.out.println("Wybierz kolejnosc sortowania: AZ, ZA");
                    sortingOrder = input.nextLine();

                    switch (sortingOrder) {
                        case "AZ":{
                            Collections.sort(bookList, new SortAuthor());
                            System.out.println(bookList);
                            break;
                        }
                        case "ZA":{
                            Collections.sort(bookList, new SortAuthor());
                            Collections.reverse(bookList);
                            System.out.println(bookList);
                            break;
                        }
                        default:{
                            System.out.println("Nieznana kolejnosc sortowania");
                            break;
                        }
                    }
                    break;
                }

                //SORTOWANIE TYTULU, ZEWNETRZNY KOMPARATOR
                case "tytul":{
                    System.out.println("Wybierz kolejnosc sortowania: AZ, ZA");
                    sortingOrder = input.nextLine();

                    switch (sortingOrder) {
                        case "AZ":{
                            Collections.sort(bookList, new SortTitle());
                            System.out.println(bookList);
                            break;
                        }
                        case "ZA":{
                            Collections.sort(bookList, new SortTitle());
                            Collections.reverse(bookList);
                            System.out.println(bookList);
                            break;
                        }
                        default:{
                            System.out.println("Nieznana kolejnosc sortowania");
                            break;
                        }
                    }
                    break;
                }

                //SORTOWANIE STRON, ZEWNETRZNY KOMPARATOR
                case "strony":{
                    System.out.println("Wybierz kolejnosc sortowania: rosnaco, malejaco");
                    sortingOrder = input.nextLine();

                    switch (sortingOrder) {
                        case "rosnaco":{
                            Collections.sort(bookList, new SortPages());
                            System.out.println(bookList);
                            break;
                        }
                        case "malejaco":{
                            Collections.sort(bookList, new SortPages());
                            Collections.reverse(bookList);
                            System.out.println(bookList);
                            break;
                        }
                        default:{
                            System.out.println("Nieznana kolejnosc sortowania");
                            break;
                        }
                    }
                    break;
                }

                //SORTOWANIE CENY, ZEWNETRZNY KOMPARATOR
                case "cena":{
                    System.out.println("Wybierz kolejnosc sortowania: rosnaco, malejaco");
                    sortingOrder = input.nextLine();

                    switch (sortingOrder) {
                        case "rosnaco":{
                            Collections.sort(bookList, new SortPrice());
                            System.out.println(bookList);
                            break;
                        }
                        case "malejaco":{
                            Collections.sort(bookList, new SortPrice());
                            Collections.reverse(bookList);
                            System.out.println(bookList);
                            break;
                        }
                        default:{
                            System.out.println("Nieznana kolejnosc sortowania");
                            break;
                        }
                    }
                    break;
                }

                //INNY PRZYPADEK
                default:{
                System.out.println("Nieznany typ sortowania");
                    break;
                }
            }
        }
    }
}