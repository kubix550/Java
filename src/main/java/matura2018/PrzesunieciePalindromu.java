package matura2018;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrzesunieciePalindromu {

    // metoda sprawdza czy jest palindromem
    public static boolean czyPalindrom(String w) {
        return (w.equals(new StringBuilder(w).reverse().toString()));
    }

    // metoda obraca slowo o iles znakow
    public static String rotate(String w, int k) {
        StringBuilder builder = new StringBuilder();

        // bierze ostatnie "k" znakow ze stringa, dodaje do buildera
        for (int i = (w.length() - k) ; i < w.length() ; i++) {
            builder.append(w.charAt(i));
        }

        // dziala na pozostale litery z poczatku wyrazu (jeden mniej niz poprzednio), tez dodaje do buildera
        for (int i = 0; i < (w.length() - k); i++) {
            builder.append(w.charAt(i));
        }

        return builder.toString();
    }

    // znajduje najmniejsza liczbe o ile trzeba przesunac zeby byl palindromem (k)
    public static int ilePrzesunac(String w) {

        for (int i = 0; i < w.length() ; i++) {

            if (czyPalindrom(rotate(w, i))) {
                return i;
            }
        }

        // jak nie bedzie palindromem to zwraca -1
        return -1;
    }

    public static void wyswietlPoLinijce(String sciezka) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(sciezka));

        // strumien filtruje tylko elementy, ktore maja liczbe przesuniec wieksza  od -1 (czyli sa palindromami)
        List<String> palindromy = strings.stream().filter(a -> ilePrzesunac(a) > -1).collect(Collectors.toList());
        System.out.println(palindromy);

        // strumien wyswietla dla kazdego wyrazu ile trzeba przesunac zeby byl palindromem
         strings.stream().filter(a -> ilePrzesunac(a) > -1).forEach(a -> System.out.println(ilePrzesunac(a)));


//        List<Integer> liczbaPrzesuniec = strings.stream().filter(a -> ilePrzesunac(a) > -1).collect(Collectors.to);
//        strings.stream().filter(a -> ilePrzesunac(a) > -1).collect(Collectors.groupingBy(palindromy, liczbaPrzesuniec));
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Wyswietla o ile przesunac konkretny wyraz (akkaj):");
        System.out.println(ilePrzesunac("akkaj"));
        System.out.println();

        System.out.println("Wyswietla z pliku wszystkie palindromy i o ile trzeba bylo przesunac:");
        wyswietlPoLinijce("przesuniecieDane.txt");

        // todo hashmapa
        // akkaj - 3
        // dabccba - 3 itd
        // strumien, collects, potem groupingby (okreslic klucz i wartosc)
        // w metodzie wyswietlpolinijce zwrocic hashmape
    }
}