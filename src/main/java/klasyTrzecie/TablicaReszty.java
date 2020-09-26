package klasyTrzecie;

// 6.Jest dana tablica 10 liczb całkowitych. Sprawdź ile jest różnych reszt z dzielenia tych liczb przez 37.

import java.util.Set;
import java.util.TreeSet;

public class TablicaReszty {
    public static void main(String[] args) {
        int reszta;
        int[] tablica = {37, 6, 6, 140, 340, 0, 218, 11, 222, 3};
        Set<Integer> niepowtarzajaceReszty = new TreeSet<>();

        for (int i = 0; i < tablica.length ; i++) {
            reszta = tablica[i]%37;                                     // reszta z dzielenia kazdej
            niepowtarzajaceReszty.add(reszta);                          // dodaje reszte do TreeSet
        }

        System.out.println("Rozne reszty z dzielenia:");
        System.out.println(niepowtarzajaceReszty);                      // w zbiorze Set elementy sie nie moga powtorzyc wiec wyswietla
    }
}