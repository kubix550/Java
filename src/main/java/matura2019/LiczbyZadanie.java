package matura2019;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiczbyZadanie {

    /////////////////
    // 4.1
    /////////////////
    public static boolean czyPotegaTrojki(int liczba) {

        for (int i = 1; i < 11 ; i++) {
            if (Math.pow(3.0, i) == liczba) {
                return true;
            }
        }

        return false;
    }

    public static int ilePotegTrojki(List<String> liczby) {
        int licznik = 0;

        for (String liczba: liczby
             ) {
            if (czyPotegaTrojki(Integer.parseInt(liczba))) {
                licznik++;
            }
        }

        return licznik;
    }

    /////////////////
    // 4.2
    /////////////////
    public static int silnia(int liczba) {
        int silnia = 1;

        if (liczba > 1) {
            for (int i = 1; i <= liczba ; i++) {
                silnia = silnia*i;
            }
        }

        return silnia;
    }

    public static int sumaSilni(int liczba) {
        String liczbaString = String.valueOf(liczba);
        int sumaSilni = 0;

        for (int i = 0; i < liczbaString.length() ; i++) {
            sumaSilni = sumaSilni + silnia(Integer.valueOf(liczbaString.charAt(i) + ""));
        }

        return sumaSilni;
    }

    public static List<Integer> liczbyRowneSumieSilni(List<String> liczby) {
        List<Integer> result = new ArrayList<>();

        for (String liczba: liczby
             ) {
            if (Integer.parseInt(liczba) == sumaSilni(Integer.parseInt(liczba))) {
                result.add(Integer.parseInt(liczba));
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        List<String> listaLiczb = Files.readAllLines(Paths.get("przykladLiczby.txt"));


        System.out.println("Zadanie 4.1");
        System.out.println("Tyle liczb jest potegami trojki: " + ilePotegTrojki(listaLiczb));
        System.out.println();

        System.out.println("Zadanie 4.2");
        System.out.println(liczbyRowneSumieSilni(listaLiczb));

        // todo 4.3
    }
}