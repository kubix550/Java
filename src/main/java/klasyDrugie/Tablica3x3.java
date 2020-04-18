package klasyDrugie;
// 11.Napisz program, w którym będzie zadeklarowana tablica dwuwymiarowa 3x3 liczb całkowitych.
// Liczby będą dobrane losowo z przedziału od 10 do 99. Oblicz sumę elementów znajdujacych się ponad główną przekątną takiej macierzy.
// 1 - przygotowuje macierz, 2 - sumuje elementy macierza, 3 - do losowania, ktora zwraca jedna liczbe z przedzialu 10-99 = zainicjalizuj element

import java.util.Random;

public class Tablica3x3 {
    static int[][] macierz = new int[3][3];

    //METODA PRZYGOTOWUJACA MACIERZ
    public static void przygotujMacierz () {    // void bez wyniku
        for (int i = 0; i < 3; i++) {      // i = numer wiersza

            for (int j = 0; j < 3; j++) {  // j = numer kolumny
                macierz[i][j] = zainicjalizujElement();     // podstawia losowa
            }
        }
    }

    //METODA WYSWIETLAJACA MACIERZ
    public static void wyswietlMacierz () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("W elemencie (" + i + "," + j + ") jest liczba " + macierz[i][j]);
            }
        }
    }

    //METODA SUMUJACA ELEMENTY MACIERZA
    public static int sumaMacierza (String parametr) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {      // i = numer wiersza

            for (int j = 0; j < 3; j++) {  // j = numer kolumny
                if (parametr.equals("nad")) {
                    if (j > i) {
                        //tu sie sumuje elementy nad glowna przekatna (gdy numer kolumny jest wiekszy niz numer wiersza)
                        suma = suma + macierz[i][j];
                    }
                }

                if (parametr.equals("pod")) {
                    if (j < i) {
                        //tu sie sumuje elementy pod glowna przekatna (gdy numer kolumny jest mniejszy niz numer wiersza)
                        suma = suma + macierz[i][j];
                    }
                }

                if (parametr.equals("na")) {
                    if (j == i) {
                        //tu sie sumuje elementy na glownej przekatnej (gdy numer kolumny jest rowny numerowi wiersza)
                        suma = suma + macierz[i][j];
                    }
                }
            }
        }
        return suma;
    }

    // METODA DO LOSOWANIA LICZBY
    public static int zainicjalizujElement() {
        Random losowa = new Random();
        return losowa.nextInt(90) + 10;  // od 10 do 99
    }

    public static void main(String[] args) {
        przygotujMacierz();
        wyswietlMacierz();
        System.out.println("Suma elementow pod glowna przekatna to " + sumaMacierza("pod"));
        System.out.println("Suma elementow na glownej przekatnej to " + sumaMacierza("na"));
        System.out.println("Suma elementow nad glowna przekatna to " + sumaMacierza("nad"));
    }
}