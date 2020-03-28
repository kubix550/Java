package klasyDrugie;
// 5.Napisz program, który wczytuje od użytkownika ciąg znaków i wypisuje ostatnią literę.

import java.util.Scanner;

public class OstatniaLiteraCiagu {
    public static void main(String[] args) {
        String string;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz ciag znakow");
            string = input.nextLine();
            System.out.println("Ostatnia litera ciagu znakow to " + string.charAt(string.length() - 1));        // charAt zwraca określony znak z łańcucha znaków
        }                                                                                                       // length() okresla długość łańcucha znakowego, wiec -1 da nam ostatnia cyfre. Ponadto np -2 daje nam przedostatnia
    }
}