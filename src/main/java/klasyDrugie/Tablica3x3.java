package klasyDrugie;
// 11.Napisz program, w którym będzie zadeklarowana tablica dwuwymiarowa 3x3 liczb całkowitych.
// Liczby będą dobrane losowo z przedziału od 10 do 99. Oblicz sumę elementów znajdujacych się ponad główną przekątną takiej macierzy.
// todo: zrobic z tego metode (1 - przygotowuje macierz, 2 - sumuje elementy macierza, 3 - do losowania, ktora zwraca jedna liczbe z przedzialu 10-99 = zainicjalizuj element

import java.util.Random;

public class Tablica3x3 {
    public static void main(String[] args) {
        Random losowa = new Random();
        int suma = 0;

        int[][] macierz = new int[3][3];
        for (int i = 0; i < 3; i++) {      // i = numer wiersza
            System.out.println("Jestem w wierzu numer " + i);

            for (int j = 0; j < 3; j++) {  // j = numer kolumny
                System.out.println("Jestem w kolumnie numer " + j);
                macierz[i][j] = losowa.nextInt(90) + 10;  // od 10 do 99
            }
        }

        System.out.println();
        // tu sie wyswietla macierz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("W elemencie (" + i + "," + j + ") jest liczba " + macierz[i][j]);
                //tu sie sumuje elementy nad glowna przekatna (gdy numer kolumny jest wiekszy niz numer wiersza)
                if (j > i) {
                    suma = suma + macierz[i][j];    // tu sa elementy ktore sa na pewno ponad glowna przekatna
                }
            }
        }
        System.out.println();
        System.out.println("Suma elementow nad glowna przekatna to " + suma);
    }
}