package algorytmy;

public class Horner {
    public static int[] tablica = {1, -5, 6, 8, -5, 2};     // x^2 - 5x + 6
    public static int x = 2;                                // przykladowa wartosc wielomianu w punkcie x

    public static int hornerIter(int n) {                   // "n" - stopien wielomianu
        int wynik = tablica[0];

        for (int i = 1; i <= n ; i++) {                     // "n" mowi ile elementow wprzod po pierwszym elemencie tablicy
            wynik = wynik*x + tablica[i];
        }
        return wynik;
    }

    public static int hornerRekur(int n) {
        if (n == 0) {                                       // jezeli wielomian jest stopnia zerowego to zwraca pierwszy element tablicy
            return tablica[0];
        }

        return hornerRekur(n-1) * x + tablica[n];
    }

    public static void main(String[] args) {
        // a0 * x + a1

        System.out.println(hornerIter(2));

        System.out.println(hornerRekur(2));
    }
}