package algorytmy;

import java.util.Scanner;

public class Fibonacci {

    public static int FibonacciIter(int koncowaLiczba) {
        if (koncowaLiczba == 1 || koncowaLiczba == 2) {                 // bo pierwsza i druga liczba z kolei to 1
            return 1;
        }

        int l = 1;
        int p = 1;
        int sumaPoprzednich = 0;

        for (int i = 3; i <= koncowaLiczba; i++) {                      // mowi ile razy trzeba przemnozyc, zaczynamy od 3 bo pierwsze dwa obsluzone u gory
            sumaPoprzednich = l + p;                                    // 1(l) + 1(p) = 2(suma)
            l = p;
            p = sumaPoprzednich;
        }

        return sumaPoprzednich;
    }


    public static int FibonacciRekur(int koncowaLiczba) {
        if (koncowaLiczba == 1 || koncowaLiczba == 2) {                                                         // bo pierwsza i druga liczba z kolei to 1
            return 1;
        }

        return FibonacciRekur(koncowaLiczba - 2) + FibonacciRekur(koncowaLiczba - 1);   // f(n) = f(n-2) + f(n-1)  czyli dwie ostatnie liczby ciaglu dodane do siebie
    }


    public static int FibonacciSumaIter(int koncowaLiczba) {
        int suma = 0;

        for (int i = 1; i <= koncowaLiczba ; i++) {                     // petla leci do liczby, do ktorej chcemy sume
            suma = suma + FibonacciIter(i);                             // suma to stara suma + kolejna liczba z ciagu fibonacciego (z wykorzystaniem metody wypisujacej konkretna liczbe z ciagu)
        }

        return suma;
    }

    public static void main(String[] args) {

        // wyswietla konkretna liczbe z ciagu fibonacciego
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz liczbe ktora chesz otrzymac z ciagu");
        int ktorazKolei = input.nextInt();

        System.out.println(FibonacciIter(ktorazKolei) + " jest " + ktorazKolei + " liczba z kolei w ciagu Fibonacciego (Iteracyjnie)");
        System.out.println(FibonacciRekur(ktorazKolei) + " jest " + ktorazKolei + " liczba z kolei w ciagu Fibonacciego (Rekurencyjnie)");
        System.out.println();


        // liczy sume elementow ciagu fibonacciego do podanej liczby (wlacznie z nia)
        System.out.println("Suma elementow ciagu Fibonacciego do liczby " + ktorazKolei + " (wlacznie) wynosi " + FibonacciSumaIter(ktorazKolei));
    }
}