package klasyPierwsze;
// 3. Napisać program, który wczytuje dwie liczby od użytkownika i wyświetla ich sumę.

import java.util.Scanner;

public class SumaWczytanychLiczb {
    public static void main(String[] args) {
        int liczba1;
        int liczba2;
        int suma;
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz 1 liczbe");
        liczba1 = input.nextInt();

        System.out.println("Wpisz 2 liczbe");
        liczba2 = input.nextInt();

        suma = liczba1+liczba2;

        System.out.println("Suma liczb to " + suma);
    }
}