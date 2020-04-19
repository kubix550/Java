package klasyDrugie;
// 21.Napisz program, który przy pomocy instrukcji switch obliczy liczbę samogłosek we wprowadzonym przez użytkownika tekście.
// Każda samogłoska ma być obliczona oddzielnie.

import java.util.Scanner;

public class LiczbaSamoglosek {
    public static void main(String[] args) {
        int licznik = 0;

        String text;
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadz tekst");
        text = input.nextLine();


        for (int i = 0; i < text.length() ; i++) {
            switch (text.charAt(i)) {
                case 'a':
                case 'o':
                case 'e':
                case 'i':
                case 'u':
                case 'y':
                    licznik++;
                    break;

                default:
                    System.out.println(text.charAt(i) + " jest spolgloska");
            }
        }

        System.out.println("We wprowadzonym tekscie " + "'" + text + "'" + " znaleziono " + licznik + " samoglosek");
    }
}