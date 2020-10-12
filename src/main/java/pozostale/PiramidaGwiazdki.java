package pozostale;

import java.util.Scanner;

public class PiramidaGwiazdki {
    public static void main(String[] args) {
        int wysokosc;
        int licznik = 0;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Podaj wysokosc piramidy");
            wysokosc = input.nextInt();
        }
        while (wysokosc <= 0);                                  // wysokosc musi byc dodatnia


        for (int i = 1; i <= wysokosc; i++) {                   // glowna petla, mowi ile ma byc wierszy

            for (int j = 1; j <= wysokosc - i; j++) {           // ustawia spacje PRZED GWIAZDKAMI, w kazdej nowej linijce jest o "i" spacji mniej
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {              // ustawia gwiazdke PO SPACJACH, w kazdej linijce ma byc nieparzysta ilosc gwiazdek
                System.out.print("*");                          // na poczatku zawsze 1 gwiazdka czyli 1*2-1 = 1, zgadza sie
            }

            System.out.println();                               // ustawia nowa linijke bo wczesniej bylo bez "ln" aby byly obok siebie
        }
    }
}