package matura2021;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Neon {

    /////////////////////
    // ZADANIE 1
    /////////////////////
    public static int dlugoscNapisu(List<String> lista) {
        int result = 0;

        for (String item: lista
             ) {
            String[] s = item.split(" ");

            if (s[0].equals("DOPISZ")) {
                result++;
            }
            if (s[0].equals("USUN")) {
                result--;
            }
        }

        return result;
    }



    /////////////////////
    // ZADANIE 2
    /////////////////////
    public static void kolejneInstrukcje(List<String> lista) {
        List<String> instrukcje = new LinkedList<>();
        int aktualnaDlugosc = 1;
        int najwiekszaDlugosc = 1;
        String aktualnaInstrukcja = "";
        String najwiekszaInstrukcja = "";

        for (String item: lista
        ) {
            String[] s = item.split(" ");
            instrukcje.add(s[0]);
        }


        for (int i = 1; i < instrukcje.size() ; i++) {
            if (instrukcje.get(i).equals(instrukcje.get(i-1))) {
                aktualnaDlugosc++;
                aktualnaInstrukcja = instrukcje.get(i);
            }
            else {
                if (aktualnaDlugosc > najwiekszaDlugosc) {
                    najwiekszaDlugosc = aktualnaDlugosc;
                    najwiekszaInstrukcja = aktualnaInstrukcja;
                }

                aktualnaDlugosc = 1;
                aktualnaInstrukcja = "";
            }
        }

        System.out.println("Instrukcja " + najwiekszaInstrukcja + " wystepuje jako ciag o dlugosci " + najwiekszaDlugosc);
    }



    /////////////////////
    // ZADANIE 3
    /////////////////////
    public static void najczestszaLitera(List<String> lista) {
        List<String> litery = new LinkedList<>();
        Set<String> literyNiepowtarzajace = new TreeSet<>();
        String aktualnaLitera = "";
        String najczestszaLitera = "";
        int aktualneWystepowanie = 0;
        int najczeszeWystepowanie = 0;


        for (String item: lista
        ) {
            String[] s = item.split(" ");

            if (s[1].matches(".*[A-Za-z].*") && s[0].equals("DOPISZ")) {
                litery.add(s[1]);
                literyNiepowtarzajace.add(s[1]);
            }
        }


        for (String item: literyNiepowtarzajace
             ) {
            aktualneWystepowanie = Collections.frequency(litery, item);
            aktualnaLitera = item;

            if (aktualneWystepowanie > najczeszeWystepowanie) {
                najczeszeWystepowanie = aktualneWystepowanie;
                najczestszaLitera = aktualnaLitera;
            }
        }

        System.out.println("Litera " + najczestszaLitera + " dopisywana jest " + najczeszeWystepowanie + " razy");
    }



    /////////////////////
    // ZADANIE 4
    // TODO: 30.05.2021 dokonczyc zadanie
    /////////////////////

    // na końcu napisu trzeba dopisać pojedynczą litere
    public static String dopisz(String wyraz, String litera) {
        StringBuilder builder = new StringBuilder(wyraz);
        builder.append(litera);

        return builder.toString();
    }

    // na końcu napisu trzeba dopisać pojedynczą literę (możesz założyć, że napis jest niepusty)
    public static String zmien(String wyraz, String litera) {
        StringBuilder builder = new StringBuilder(wyraz);
        builder.setCharAt(wyraz.length() - 1, litera.charAt(0));

        return builder.toString();
    }

    // należy usunąć ostatnią literę aktualnego napisu (możesz założyć, że napis jest niepusty)
    // wszedzie jest usun 1?
    public static String usun(String wyraz) {
        StringBuilder builder = new StringBuilder(wyraz);
        builder.deleteCharAt(wyraz.length() - 1);

        return builder.toString();
    }

    // pierwsze od lewej wystąpienie podanej litery w napisie należy zamienić na następną literę w alfabecie
    // jeśli litera nie występuje w napisie, nie należy nic robić
    public static String przesun(String wyraz, String litera) {

        return "";
    }


    /////////////////////
    // MAIN
    /////////////////////
    public static void main(String[] args) throws IOException {
        List<String> dane = new ArrayList<>(Files.readAllLines(Path.of("przykladNeon.txt")));


        /////////////////////
        // ZADANIE 1 - WYNIK
        /////////////////////
        System.out.println("Zadanie 1");
        System.out.println("Dlugosc calego napisu to " + dlugoscNapisu(dane));
        System.out.println();


        /////////////////////
        // ZADANIE 2 - WYNIK
        /////////////////////
        System.out.println("Zadanie 2");
        kolejneInstrukcje(dane);
        System.out.println();


        /////////////////////
        // ZADANIE 3 - WYNIK
        /////////////////////
        System.out.println("Zadanie 3");
        najczestszaLitera(dane);
        System.out.println();


        /////////////////////
        // ZADANIE 4 - WYNIK
        /////////////////////
        System.out.println("Zadanie 4");
        String test = "MATURA";
        System.out.println(dopisz(test, "Q"));
        System.out.println(zmien(test, "X"));
        System.out.println(usun(test));
    }
}