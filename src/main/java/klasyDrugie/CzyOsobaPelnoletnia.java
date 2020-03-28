package klasyDrugie;
//2.Napisz program, który wczytuje wiek i sprawdza czy osoba jest pełnoletnia.

import java.util.Scanner;

public class CzyOsobaPelnoletnia {
    public static void main(String[] args) {
        int wiek;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Wpisz swoj wiek");
            wiek = input.nextInt();

            if (wiek>=18) {
                System.out.println("Osoba jest pelnoletnia");
                System.out.println();
            }

            else {
                System.out.println("Osoba nie jest pelnoletnia");
                System.out.println();
            }

        }
    }
}
