package klasyDrugie;
// 15.Napisz metodę, która oblicza liczbę dzielników podanej liczby.

import java.util.Scanner;

public class IleDzielnikow {
    public static int ileDzielnikow (int a) {
        int licznik = 2;  // bo kazda liczba ma dwa dzielniki 1 i sama siebie

        for (int i = 2; i < a; i++) {
            // nie od zera bo nie mozna, a nie od jeden bo sie dzieli przez wszystko
            // dzelnikow szukamy w zbiorze od (2, liczba), bo 2 i liczba sa dzielnikami liczba

            if (a % i == 0) {
//                System.out.println(i); wyswietla kazdy kolejny dzielnik
                licznik++;
            }
        }
        return licznik;
    }

    public static void main(String[] args) {
        int liczba;

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz liczbe");
        liczba = input.nextInt();

        System.out.println(ileDzielnikow(liczba));
    }
}