package klasyPierwsze;
// 5. Napisać program, który wczyta od użytkownika trzy długości boków trojkąta i sprawdzi czy trójkąt jest prostokątny.

import java.util.Scanner;

public class TrojkatProstok {
    public static boolean czyprost(int a, int b, int c) {
        return ((a * a) + (b * b) == (c * c) || (b * b) + (c * c) == (a * a) || (a * a) + (c * c) == (b * b)); //bo moze byc true/false
    }

    public static void main(String[] args) {
        int bok1;
        int bok2;
        int bok3;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz 1 bok");
            bok1 = input.nextInt();

            System.out.println("Wpisz 2 bok");
            bok2 = input.nextInt();

            System.out.println("Wpisz 3 bok");
            bok3 = input.nextInt();

            // dwie kreski || to "lub"

            if (czyprost(bok1, bok2, bok3)) {
                System.out.println("Jest prostokatny");
            }

            else {
                System.out.println("Nie jest prostokatny");
            }

        }
    }
}