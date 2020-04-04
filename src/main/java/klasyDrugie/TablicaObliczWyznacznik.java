package klasyDrugie;
// 10.Napisz program, który wczytuje od użytkownika cztery liczby i umieszcze je w tablicy dwuwymiarowej.
// Następnie oblicza wyznacznik.

import java.util.Scanner;

public class TablicaObliczWyznacznik {
    //metoda
    public static double liczWyznacznik(double a, double b, double c, double d) {
        return (a*d)-(b*c);
    }

    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // pozamieniac int na double
        System.out.println("Wpisz a1");
        int a1 = input.nextInt();
        System.out.println("Wpisz b1");
        int b1 = input.nextInt();
        System.out.println("Wpisz c1");
        int c1 = input.nextInt();

        System.out.println("Wpisz a2");
        int a2 = input.nextInt();
        System.out.println("Wpisz b2");
        int b2 = input.nextInt();
        System.out.println("Wpisz c2");
        int c2 = input.nextInt();


        int[][] tablica = new int[2][3];        //tabl dwuwumiarowa, 2 wiersze 3 kolumny
        tablica[0][0] = a1;                           // (zero i jeden)
        tablica[0][1] = b1;
        tablica[0][2] = c1;

        tablica[1][0] = a2;
        tablica[1][1] = b2;
        tablica[1][2] = c2;

        double w = liczWyznacznik(a1, b1, a2, b2);
        double wx = liczWyznacznik(c1, b1, c2, b2);
        double wy = liczWyznacznik(a1, c1, a2, c2);

        System.out.println("wyznacznik w to "  + w);
        System.out.println("wyznacznik wx to "  + wx);
        System.out.println("wyznacznik wy to "  + wy);
        System.out.println();

        //sprawdzenie czy sprzeczny oznaczony nieoznaczony
        if (w != 0) {
            double x = wx/w;
            double y = wy/w;

            System.out.println("rozwiazanie x to " +  x);
            System.out.println("rozwiazanie y to " + y);
            System.out.println("Uklad oznaczony, jedno rozwiazanie");
        }

        else if (w == 0 && wx == 0 && wy == 0) {
            System.out.println("Uklad nieoznaczony, nieskonczenie wiele rozwiazan");
        }

        else if (w == 0 && (wx != 0 || wy != 0)) {
            System.out.println("Uklad sprzeczny, brak rozwiazan");
        }
    }
}