package maturaOgolne.zadanieCzwarte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RozwiazanieZadCzwarte {
    public static List<Punkt> konwerterPunktow(List<String> lista) {
        List<Punkt> wynik = new ArrayList<>();

        for (String wiersz : lista
        ) {

            String[] tablica = wiersz.split(" ");                                           // rozdziela po spacji
            Punkt punkt = new Punkt(Double.valueOf(tablica[0]), Double.valueOf(tablica[1]));      // dodaje do tablicy, konwertuje na Double
            wynik.add(punkt);                                                                     // dodaje punkty do tablicy klasy Punkt
        }

        return wynik;
    }

    public static List<Okrag> konwerterOkregow(List<String> lista) {
        List<Okrag> wynik = new ArrayList<>();

        for (String wiersz : lista
        ) {

            String[] tablica = wiersz.split(" ");
            Okrag okrag = new Okrag(Integer.parseInt(tablica[0]), Integer.parseInt(tablica[1]), Integer.parseInt(tablica[2]));
            wynik.add(okrag);
        }

        return wynik;
    }


    public static int[] iloscPunktowCwiartka(List<Punkt> lista) {
        int[] wynik = {0, 0, 0, 0};

        int pierwszaCwiartka = 0;
        int drugaCwiartka = 0;
        int trzeciaCwiartka = 0;
        int czwartaCwiartka = 0;


        for (int i = 0; i < lista.size() ; i++) {
            // sprawdza 1 cwiartke
            if (lista.get(i).getX() > 0 && lista.get(i).getY() > 0) {

                // na 1 miejscu jest 1 cwiartka, pobiera poprzedni wynik jezeli cos bylo i dodaje do licznika punktow
                pierwszaCwiartka = pierwszaCwiartka + 1;
            }

            // sprawdza 2 cwiartke
            if (lista.get(i).getX() < 0 && lista.get(i).getY() > 0) {
                drugaCwiartka = drugaCwiartka + 1;
            }

            // sprawdza 3 cwiartke
            if (lista.get(i).getX() < 0 && lista.get(i).getY() < 0) {
                trzeciaCwiartka = trzeciaCwiartka + 1;
            }

            // sprawdza 4 cwiartke
            if (lista.get(i).getX() > 0 && lista.get(i).getY() < 0) {
                czwartaCwiartka = czwartaCwiartka + 1;
            }
        }

        wynik[0] = pierwszaCwiartka;
        wynik[1] = drugaCwiartka;
        wynik[2] = trzeciaCwiartka;
        wynik[3] = czwartaCwiartka;


        return wynik;
    }


    public static List<Okrag> styczneOkregi(List<Okrag> lista) {
        List<Okrag> wynik = new ArrayList<>();

        lista.stream()
                .forEach(a -> {
                    // tu okregi styczne, bez wzgledu czy Y jest dodatnie czy ujemne bo bierze wartosc bezwzgledna
                    if (a.getR() == Math.abs(a.getY())) {
                        wynik.add(a);
                    }
                });

        return wynik;
    }


    public static double poleFigury(List<Punkt> lista) {
        List<Trojkat> listaTrojkatow = new ArrayList<>();
        double pole = 0;

        for (int i = 0; i < lista.size() - 1; i++) {        // ostatni element punktow to lista.size() - 1, samo lista.size jest za duzo
            Punkt a = new Punkt(0,0);
            Punkt b = lista.get(i);
            Punkt c = lista.get(i+1);

            Trojkat trojkat = new Trojkat(a, b, c);

            listaTrojkatow.add(trojkat);
        }

        // dodajemy ostatni trojkat (ostatni i pierwszy element)
        Punkt a = new Punkt(0,0);
        Punkt b = lista.get(lista.size() - 1);      // ostatni element
        Punkt c = lista.get(0);                     // pierwszy

        Trojkat ostatniTrojkat = new Trojkat(a, b, c);
        listaTrojkatow.add(ostatniTrojkat);

        // pole figury
        for (int i = 0; i < listaTrojkatow.size() ; i++) {
            pole = pole + listaTrojkatow.get(i).poleTrojkata();
        }

        return pole;
    }


    public static void main(String[] args) throws FileNotFoundException {
        // sposob zapisu do pliku
        File wynik1 = new File("wynik1.txt");
        File wynik2 = new File("wynik2.txt");
        File wynik3 = new File("wynik.3.txt");

        PrintWriter zapis1 = new PrintWriter(wynik1);
        PrintWriter zapis2 = new PrintWriter(wynik2);
        PrintWriter zapis3 = new PrintWriter(wynik3);



        // zwraca liste stringow z punktami
        List<String> listaStringPunkty = null;
        try {
            listaStringPunkty = Files.readAllLines(Paths.get("C:\\Users\\Kuba\\IdeaProjects\\projekt\\src\\main\\java\\maturaOgolne\\zadanieCzwarte\\punkty.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zwraca liste stringow z okregami
        List<String> listaStringOkregi = null;
        try {
            listaStringOkregi = Files.readAllLines(Paths.get("C:\\Users\\Kuba\\IdeaProjects\\projekt\\src\\main\\java\\maturaOgolne\\zadanieCzwarte\\okregi.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // konwertujemy Stringi na Punkty
        List<Punkt> listaPunktow = konwerterPunktow(listaStringPunkty);

        // konwertujemy Stringi na Okregi
        List<Okrag> listaOkregow = konwerterOkregow(listaStringOkregi);




        // ZADANIE 4.1 - ilosc punktow w kazdej cwiartce
        // tu listaStringPunkty z wynikami, wyswietla ja
        int[] punktyWynik = iloscPunktowCwiartka(listaPunktow);
        System.out.println("Pierwsza cwiartka: " + punktyWynik[0]);
        System.out.println("Druga cwiartka: " + punktyWynik[1]);
        System.out.println("Trzecia cwiartka: " + punktyWynik[2]);
        System.out.println("Czwarta cwiartka: " + punktyWynik[3]);
        System.out.println();

        // zapisuje wyniki w pliku
        zapis1.println(punktyWynik[0]);
        zapis1.println(punktyWynik[1]);
        zapis1.println(punktyWynik[2]);
        zapis1.println(punktyWynik[3]);
        zapis1.close();


        // ZADANIE 4.2 - styczne okregi i ich ilosc
        List<Okrag> listaStycznychOkregow = styczneOkregi(listaOkregow);

        // tu sortuje okregi w porzadku naturalnym, po metodzie CompareTo w klasie Okrag
        Collections.sort(listaStycznychOkregow);

        System.out.println("Posortowane okregi po wielkosci:");
        System.out.println(listaStycznychOkregow);
        System.out.println("Ilosc stycznych okregow: " + listaStycznychOkregow.size());


        // tu zapisuje w oddzielnych linijkach styczne okregi, x - y - r
        // w ostatniej linijce ilosc okregow
        for (Okrag okrag : listaStycznychOkregow
        ) {
            zapis2.println(okrag.getX() + " " + okrag.getY() + " " + okrag.getR());
        }
        zapis2.println(listaStycznychOkregow.size());
        zapis2.close();


        // tu sortuje jeszcze po promieniu uzywajac zewnetrznego comparatora
        Collections.sort(listaStycznychOkregow, new PromienComparator());
        System.out.println("Tu posortowane jeszcze po promieniach:");
        System.out.println(listaStycznychOkregow);
        System.out.println();




        // ZADANIE 4.3 - pole figury
        // dodac pola trojkatow gdzie wierzcholkami jest x, y i 0
        // od pierwszego do n-1
        // ostatnie pole dodac recznie

        System.out.println("Pole figury to:");
        System.out.println(poleFigury(listaPunktow));

        zapis3.println( (int)poleFigury(listaPunktow) );
        zapis3.close();
    }
}