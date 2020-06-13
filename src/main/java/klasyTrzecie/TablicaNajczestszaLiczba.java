package klasyTrzecie;

// 4.W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej.

public class TablicaNajczestszaLiczba {
    public static void main(String[] args) {

        // w tablicy nie moga byc liczby ujemne ze wzgledu na sposob rozwiazania
        // druga tablica nie moze byc indeksowana liczbami ujemnymi
        int[] tablica = {1, 5, 25, 10, 15, 2, 2, 1, 7, 6, 6, 7, 2, 2, 2, 2, 6, 9, 4, 2, 0};
        int najczestszaLiczba = 0;

        int[] tab = new int[26];

        // domyslnie podstawia kazdemu z tab wartosc 0, bo nie wiadomo ile jest kazdego elementu
        for (int i = 0; i < tab.length ; i++) {
            tab[i] = 0;
        }

        for (int i = 0; i < tablica.length ; i++) {
            // tablica[i] to elementy do zapisania w tablicy tab
            tab[tablica[i]] = tab[tablica[i]] + 1;
        }

        for (int i = 0; i < tab.length ; i++) {
            System.out.println("Indeks tab:" + i);
            System.out.println("Wartosc tab:" + tab[i]);
            System.out.println();
        }
    }
}