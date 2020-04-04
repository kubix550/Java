package klasyPierwsze;
// 10. Napisz program, w którym wczytujemy 5 liczb wprowadzonych przez użytkownika do tablicy.
// Następnie wszystkie liczby należy podnieść do kwadratu i wyświetlić.

import java.util.Scanner;

public class LiczbyDoTablicy {
    public static void main(String[] args) {
        int liczba = 0;
        int[] tablica = new int[5];
        Scanner input = new Scanner(System.in);

        while (liczba != 5) {
            System.out.println("Wpisz liczbe");
            tablica[liczba] = input.nextInt();
            System.out.println(tablica[liczba]*tablica[liczba]);
            liczba++;
        }
    }
}