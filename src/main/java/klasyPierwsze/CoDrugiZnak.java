package klasyPierwsze;
// 12. Napisz program, który wczyta tekst od użytkownika i wyświetli co drugi znak.

import java.util.Scanner;

public class CoDrugiZnak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz ciag znakow");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i = i + 2) {              //length() okresla dlugosc stringa nazwanego text
            System.out.print(text.charAt(i));                     //println wyswietla w kolejnych wierszach, print w jednym wierszu
        }                                                         //charAt zwraca określony znak z łańcucha znaków
    }
}
