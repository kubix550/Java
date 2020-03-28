package klasyDrugie;
// 12.Napisz metodę, która sprawdzi czy z trzech podanych długości boków można zbudować trójkąt
// a następnie obliczy jego pole.

import java.util.Scanner;

public class CzyIstniejeTrojkat {
    public static boolean czyMozna(int a, int b, int c) {
        return ( ((a + b) > c) && ((b + c) > a) && ((a + c) > b) );       // && oznacza "i"
    }

    public static int poleTrojkata(int a, int b, int c) {
        return (int) Math.sqrt( ((a+b+c)/2) * (((a+b+c)/2)-a) * (((a+b+c)/2)-b) * (((a+b+c)/2)-c) );
    }

    public static void main(String[] args) {
        int bok1;
        int bok2;
        int bok3;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz bok 1");
            bok1 = input.nextInt();

            System.out.println("Wpisz bok 2");
            bok2 = input.nextInt();

            System.out.println("Wpisz bok 3");
            bok3 = input.nextInt();

            if (czyMozna(bok1, bok2, bok3)) {
                System.out.println("Mozna zrobic trojkat");

                System.out.println("Jego pole to " + poleTrojkata(bok1, bok2, bok3));
            }
            else {
                System.out.println("Nie mozna zrobic trojkata");
            }
        }
    }
}
