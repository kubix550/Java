package klasyDrugie;
// 18.Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy

public class TablicaMinMax {
    public static void main(String[] args) {
        int[] tablica = {-4, 2, 5, 9, 40, -45, 0, 19, 420, -57, 12};

        int min = tablica[0];
        int max = tablica[0];

        for (int i = 1; i < tablica.length ; i++) {
            if (tablica[i] < min) min = tablica[i];     // podstawiamy minimum jesli bedzie mniejsza liczba
            if (tablica[i] > max) max = tablica[i];     // podstawiamy maksimum jesli bedzie wieksza liczba
        }

        System.out.println("Maksimum tablicy to: " + max);
        System.out.println("Minimum tablicy to: " + min);
    }
}
