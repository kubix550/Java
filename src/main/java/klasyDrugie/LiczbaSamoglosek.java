package klasyDrugie;
// 21.Napisz program, który przy pomocy instrukcji switch obliczy liczbę samogłosek we wprowadzonym przez użytkownika tekście.
// Każda samogłoska ma być obliczona oddzielnie.

import java.util.Scanner;

public class LiczbaSamoglosek {
    public static void main(String[] args) {
        int licznikA = 0;
        int licznikO = 0;
        int licznikE = 0;
        int licznikI = 0;
        int licznikU = 0;
        int licznikY = 0;

        String text;
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadz tekst");
        text = input.nextLine();


        for (int i = 0; i < text.length() ; i++) {
            switch (text.charAt(i)) {
                case 'a':
                    licznikA++;
                    break;
                case 'o':
                    licznikO++;
                    break;
                case 'e':
                    licznikE++;
                    break;
                case 'i':
                    licznikI++;
                    break;
                case 'u':
                    licznikU++;
                    break;
                case 'y':
                    licznikY++;
                    break;

                default:
                    System.out.println(text.charAt(i) + " jest spolgloska");
            }
        }
        System.out.println();
        System.out.println("We wprowadzonym tekscie " + "'" + text + "'" + " znaleziono:");
        System.out.println(licznikA + " samoglosek A");
        System.out.println(licznikO + " samoglosek O");
        System.out.println(licznikE + " samoglosek E");
        System.out.println(licznikI + " samoglosek I");
        System.out.println(licznikU + " samoglosek U");
        System.out.println(licznikY + " samoglosek Y");

    }
}