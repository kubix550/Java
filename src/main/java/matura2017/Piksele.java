package matura2017;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Piksele {

    ///////////////////
    // ZADANIE 1
    ///////////////////
    public static void zadaniePierwsze(int[][] tablica) {
        int najjasniejszyElement = 0;
        int najciemniejszyElement = Integer.MAX_VALUE;

        for (int i = 0; i < 200 ; i++) {
            for (int j = 0; j < 320 ; j++) {
                if (tablica[i][j] > najjasniejszyElement) {
                    najjasniejszyElement = tablica[i][j];
                }

                if (tablica[i][j] < najciemniejszyElement) {
                    najciemniejszyElement = tablica[i][j];
                }
            }
        }

        System.out.println("Najjasniejszy element: " + najjasniejszyElement);
        System.out.println("Najciemniejszy element: " + najciemniejszyElement);
    }


    ///////////////////
    // ZADANIE 2
    ///////////////////
    public static boolean czyWierszMaOsSymetrii(int[][] tablica, int konkretnyWiersz) {
        for (int i = 0; i < 320 ; i++) {
            if (tablica[konkretnyWiersz][i] != tablica[konkretnyWiersz][319-i]) {
                return false;
            }
        }
        return true;
    }

    public static int liczbaUsunietychWierszy(int[][] tablica) {
        int liczbaUsunietychWierszy = 0;

        for (int i = 0; i < 200 ; i++) {
            // jak nie ma osi symetrii to mozna go usunac
            if (!czyWierszMaOsSymetrii(tablica, i)) {
                liczbaUsunietychWierszy++;
            }
        }
        return liczbaUsunietychWierszy;
    }


    ///////////////////
    // ZADANIE 3
    ///////////////////
    // todo

    public static void main(String[] args) throws IOException {
        int[][] piksele = new int[200][320];
        int licznikWiersza = 0;

        File file = new File("przykladPiksele.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String[] tablicaString = scanner.nextLine().split(" ");

            for (int i = 0; i < tablicaString.length ; i++) {
                piksele[licznikWiersza][i] = Integer.valueOf(tablicaString[i]);
            }

            licznikWiersza++;
        }

        // wyswietlanie pliku
        // tu sa wiersze
//        for (int i = 0; i < 200 ; i++) {
//
//            // tu linijki
//            for (int j = 0; j < 320 ; j++) {
//                System.out.print(piksele[i][j] + " ");
//            }
//
//            System.out.println(); // spacja po kazdej linijce
//        }

        System.out.println("Zadanie 1");
        zadaniePierwsze(piksele);
        System.out.println();

        System.out.println("Zadanie 2");
        System.out.println("Aby mial pionowa os symetrii nalezy usunac " + liczbaUsunietychWierszy(piksele) + " wierszy");
    }
}