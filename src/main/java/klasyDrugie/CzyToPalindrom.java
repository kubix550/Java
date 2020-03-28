package klasyDrugie;
// 7.Napisz program, który odczytuje tekst i sprawdza czy jest ono palindromem.

import java.util.Scanner;

public class CzyToPalindrom {
    public static void main(String[] args) {
        String string; //to co uzytkownik
        String odwrotny; //odwroc string
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz tekst");
        string = input.nextLine();

        StringBuilder builder = new StringBuilder(string);
        odwrotny = builder.reverse().toString();

        if (odwrotny.equals(string)) {
            System.out.println("Jest palindromem");
        }
        else {
            System.out.println("Nie jest palindromem");
        }

    }
}