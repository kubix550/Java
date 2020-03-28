package klasyDrugie;
// 9.Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na poprawnie wprowadzone hasło.

import java.util.Scanner;

public class WpisywanieHasla {
    public static void main(String[] args) {
        String haslo;
        String poprawneHaslo = "maslo";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Wpisz haslo");
            haslo = input.nextLine();
        }
        while (!haslo.equals(poprawneHaslo));       // The exclamation mark negates the boolean that appears next to it
        System.out.println("Poprawne haslo");
    }
}