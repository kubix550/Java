package klasyTrzecie;

// 15.Napisz program, który posortuje zdefiniowaną tablicę. Użyj klasy TreeSet.

import java.util.Set;
import java.util.TreeSet;

public class TablicaSortowanie {
    public static void main(String[] args) {
        int[] tablica = {1, 5, 25, 10, 15, 2, 2, 1, 7, 6, 6, 7, 2, 2, 2, 2, 6, 9, 4, 2, 0};

        Set<Integer> posortowany = new TreeSet<>();

        for (int i = 0; i < tablica.length ; i++) {
            posortowany.add(tablica[i]);
        }

        System.out.println(posortowany);
        System.out.println("Pomija duplikaty, sortuje zgodnie z kolejnoscia");
    }
}