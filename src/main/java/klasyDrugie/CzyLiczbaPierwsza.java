package klasyDrugie;
// 14.Napisz metodę, która stwierdza czy liczba jest pierwsza.

import java.util.Scanner;

public class CzyLiczbaPierwsza {
    public static boolean czyPierwsza(int a) {
        boolean pierwsza = true;

        for (int i = 2; i < a ; i++) {                  //od 2 do a-1
            if (a%i == 0) {                             //sprawdza czy sie dzieli przez cos innego
                pierwsza = false;
                break;                                  //jak wyjdzie liczba to nie ma co dalej
            }
        }

        return pierwsza;
    }

    public static void main(String[] args) {
        int liczba;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz liczbe");
            liczba = input.nextInt();

            if (czyPierwsza(liczba)) {
                System.out.println("Jest pierwsza");
            }
            else {
                System.out.println("Nie jest pierwsza");
            }
        }
    }
}