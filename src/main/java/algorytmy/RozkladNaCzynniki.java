package algorytmy;

import java.util.ArrayList;
import java.util.List;

public class RozkladNaCzynniki {
    public static void naCzynniki(int liczba) {
        List<Integer> czynniki = new ArrayList<>();
        int dzielnik = 2;

        System.out.println("Czynniki liczby " + liczba);

        while (liczba != 1) {
            while (liczba%dzielnik == 0) {
                liczba = liczba / dzielnik;

                czynniki.add(dzielnik);
            }

            dzielnik++;
        }

        System.out.println(czynniki);
    }

    public static void main(String[] args) {
        naCzynniki(12);
    }
}