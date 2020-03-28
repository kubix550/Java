package klasyPierwsze;
// 4. Napisać program, który wczytuje imię od użytkownika i wyświetla czy imię jest męskie czy żeńskie.

import java.util.Scanner;

public class CzyImieZenskie {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        if (name.endsWith("a")) {
            System.out.println("Imie jest zenskie");
        }
    }
}
