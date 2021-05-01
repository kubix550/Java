package matura2017;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Piksele {

    public static int wiersze = 200;    // 200
    public static int kolumny = 320;    // 320

    ///////////////////
    // ZADANIE 1
    ///////////////////
    public static void zadaniePierwsze(int[][] tablica) {
        int najjasniejszyElement = 0;
        int najciemniejszyElement = Integer.MAX_VALUE;

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
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
        for (int i = 0; i < kolumny; i++) {
            if (tablica[konkretnyWiersz][i] != tablica[konkretnyWiersz][kolumny - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int liczbaUsunietychWierszy(int[][] tablica) {
        int liczbaUsunietychWierszy = 0;

        for (int i = 0; i < wiersze; i++) {
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
    // todo piksele naroznikowe, w danych jest blad

    // x - poziomo (wiersz)
    // y - pionowo (kolumna)
    public static boolean czyPikselWewnetrzny(int x, int y) {
        return (x >= 1 && x < wiersze - 1 && y >= 1 && y < kolumny - 1);
    }

    public static int policzWewnetrzne(int[][] tablica) {
        int result = 0;

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                if (czyPikselWewnetrzny(i, j)) {

                    if (Math.abs(tablica[i][j] - (tablica[i - 1][j])) > 128 ||
                            Math.abs(tablica[i][j] - (tablica[i + 1][j])) > 128 ||
                            Math.abs(tablica[i][j] - (tablica[i][j - 1])) > 128 ||
                            Math.abs(tablica[i][j] - (tablica[i][j + 1])) > 128) {
                        result++;
                    }
                }

                // sprawdza czy nie jest naroznikiem
                else {
                    if (i != j && (i != wiersze-1) && (j != kolumny-1)) {
                        // pierwszy wiersz
                        if (i == 0) {
                            if (j == kolumny - 1) {
                                System.out.println("hello");
                            }
                            if (Math.abs(tablica[i][j] - (tablica[i + 1][j])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i][j - 1])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i][j + 1])) > 128) {
                                result++;
                            }
                        }

                        // ostatni wiersz
                        if (i == wiersze - 1) {
                            if (Math.abs(tablica[i][j] - (tablica[i - 1][j])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i][j - 1])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i][j + 1])) > 128) {
                                result++;
                            }
                        }

                        // pierwsza kolumna
                        if (j == 0) {
                            if (Math.abs(tablica[i][j] - (tablica[i - 1][j])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i + 1][j])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i][j + 1])) > 128) {
                                result++;
                            }
                        }

                        // ostatnia kolumna
                        if (j == kolumny - 1) {
                            if (Math.abs(tablica[i][j] - (tablica[i - 1][j])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i + 1][j])) > 128 ||
                                    Math.abs(tablica[i][j] - (tablica[i][j - 1])) > 128) {
                                result++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }


    ///////////////////
    // ZADANIE 4
    ///////////////////
    public static int[] arrayKolumny(int[][] tablica, int konkretnaKolumna) {
        int[] restult = new int[wiersze];

        for (int i = 0; i < wiersze; i++) {
            restult[i] = tablica[i][konkretnaKolumna];
        }

        return restult;
    }

    public static int najdluzszyCiagArray(int[] tablica) {
        int najdluzszyCiagChwilowo = 1;
        int obecnieNajdluzszy = 0;

        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i - 1] == tablica[i]) {
                najdluzszyCiagChwilowo++;
            } else {
                obecnieNajdluzszy = najdluzszyCiagChwilowo;
                najdluzszyCiagChwilowo = 1;
            }
        }

        if (najdluzszyCiagChwilowo > obecnieNajdluzszy) {
            obecnieNajdluzszy = najdluzszyCiagChwilowo;
        }

        return obecnieNajdluzszy;
    }

    public static int najdluzszyCiagOgolnie(int[][] tablica) {
        int najdluszyCiag = 0;

        for (int i = 0; i < kolumny; i++) {
            if (najdluzszyCiagArray(arrayKolumny(tablica, i)) > najdluszyCiag) {
                najdluszyCiag = najdluzszyCiagArray(arrayKolumny(tablica, i));
            }
        }

        return najdluszyCiag;
    }


    ///////////////////
    // MAIN
    ///////////////////
    public static void main(String[] args) throws IOException {
        int[][] piksele = new int[wiersze][kolumny];
        int licznikWiersza = 0;

        File file = new File("przykladPiksele.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String[] tablicaString = scanner.nextLine().split(" ");

            for (int i = 0; i < tablicaString.length; i++) {
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
        System.out.println();

        System.out.println("Zadanie 3");
        System.out.println("Sasiadujace piksele: " + policzWewnetrzne(piksele));
        System.out.println();

        System.out.println("Zadanie 4");
        System.out.println("Najdluzszy ciag tych samych pikseli w obrazku to: " + najdluzszyCiagOgolnie(piksele));
    }
}