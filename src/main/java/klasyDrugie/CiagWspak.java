package klasyDrugie;
// 6.Napisz program, który odczytuje napis i wypisuje go wspak.

import java.util.Scanner;

public class CiagWspak {
    public static void main(String[] args) {
        String string;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz ciag znakow");
            string = input.nextLine();

            StringBuilder builder = new StringBuilder(string);
            builder.reverse();
            System.out.println("Ciag znakow odwrotnie to: " + builder); // tostring jest domyslnie w metodzie println

            // buffer do wielowatkowych ale lepiej builder


        }
    }
}
