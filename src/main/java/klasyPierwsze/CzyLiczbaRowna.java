package klasyPierwsze;
// 11. Napisz program, który wczyta od użytkownika liczbę całkowitą i sprawdzi czy liczba jest równa 5,10 czy 15.

import java.util.Scanner;

public class CzyLiczbaRowna {
    public static void main(String[] args) {
        int numer;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\b\b\b\b\b");                           //da sie to jakos ładniej?
            System.out.println("Wpisz liczbe");
            numer = input.nextInt();

            if (numer==5) {
                System.out.println("Liczba równa sie 5");
            }
            else if (numer==10) {
                System.out.println("Liczba równa sie 10");
            }
            else if (numer==15) {
                System.out.println("Liczba równa sie 15");
            }
            else {
                System.out.println("Liczba nie rowna sie 5,10 ani 15");
            }
        }
    }
}
