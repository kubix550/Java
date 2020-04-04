package klasyDrugie;
// 3.Napisz program, który sprawdza czy liczba wprowadzone przez użytkownika jest podzielna przez 4.

import java.util.Scanner;

public class CzyPodzielnaPzezCztery {
    public static void main(String[] args) {
        int liczba;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Wpisz liczbe");
            liczba = input.nextInt();

            if (liczba%4 == 0) {
                System.out.println("Liczba jest podzielna przez 4");
                System.out.println();
            }

            else {
                System.out.println("Liczba nie jest podzielna przez 4");
                System.out.println();
            }

        }
    }
}
