package maturaOgolne.WEGA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


// EGZAMIN MATURALNY Z INFORMATYKI
// 11 maja 2018 r.
// todo podpunkt trzeci
public class ZadanieWEGA {

    public static void main(String[] args) throws IOException {
        int numerLinijki = 1;
        int maxRoznychZnakow = 0;
        StringBuilder tekst = new StringBuilder();
        String najdluzszeSlowo = "";

        // wczytanie pliku
        List<String> plik = Files.readAllLines(Paths.get("sygnaly.txt"));
        for (String string : plik) {


            // PODPUNKT 1
            if (numerLinijki%40 == 0) {
                System.out.println(numerLinijki + " " + string);                 // wyswietla co czterdziesta linijke
                tekst.append(string.charAt(9));
            }


            // PODPUNKT 2
            Set<Character> iloscRoznychZnakow = new HashSet<>();

            // rozdziela kazda linijke po znakach, dodaje je po kolei do seta (bo w secie elementy sie nie powtarzaja)
            for (int i = 0; i < string.length() ; i++) {
                iloscRoznychZnakow.add(string.charAt(i));
            }

            // ustala obecne maksimum roznych znakow
            if (iloscRoznychZnakow.size() > maxRoznychZnakow) {
                maxRoznychZnakow = iloscRoznychZnakow.size();
                najdluzszeSlowo = string;
            }

            numerLinijki++;
        }

        System.out.println();
        System.out.println("Slowo powstale z calosci: " + tekst);
        System.out.println("Najdluzsze slowo to: " + najdluzszeSlowo + ". Ma " + maxRoznychZnakow + " liter");
    }
}