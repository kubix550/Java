package klasyDrugie;
// 16.Napisz metodę, która odczytuje a i n i zwraca a do potęgi n.

import java.util.Scanner;

public class Potegowanie {
    public static int potega (int a, int b) { //a - wybrana liczba, b - wykladnik
        int calosc = a;
        for (int i = 1; i < b ; i++) { //3^2 przechodzi tylko raz bo nieprawda ze 2 < 2
            calosc = calosc*a;
        }
        return calosc;
    }

    public static void main(String[] args) {

        int wykladnik;
        int liczba;

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz liczbe");
        liczba = input.nextInt();

        System.out.println("Wpisz wykladnik");
        wykladnik = input.nextInt();

        System.out.println(potega(liczba, wykladnik));
    }
}