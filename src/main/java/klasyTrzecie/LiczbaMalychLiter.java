package klasyTrzecie;
// 3.Napisz program, który oblicza liczbę małych liter w podanym wyrazie.

import java.util.Scanner;

public class LiczbaMalychLiter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int LicznikMalych = 0;
        int LicznikDuzych = 0;

        System.out.println("Wprowadz wyraz:");
        String string = input.nextLine();

        for (int i = 0; i < string.length() ; i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                LicznikMalych++;
            }

            // licznik duzych liter poza poleceniem
            if (Character.isUpperCase(string.charAt(i))) {
                LicznikDuzych++;
            }
        }

        System.out.println("Liczba malych liter: " + LicznikMalych);
        System.out.println("Liczba duzych liter:" + LicznikDuzych);
    }
}