package matura2018;

import java.util.ArrayList;
import java.util.List;

public class wystepowanie {
    // n - ilosc elementow T
    // k - ilosc elementow Z

    public static void najczestsze(int n, int k, int[] T) {
        int[] Z = new int[k];
        int min;
        int max;
        List<Integer> tablicaNajczestszych = new ArrayList<>();
        List<Integer> tablicaNajrzadszych = new ArrayList<>();


        for(int i = 0; i < k; i++) {
            Z[i] = 0;
        }


        for(int i = 0; i < n; i++) {
            Z[ T[i] ] = Z[ T[i] ] + 1;
        }

        // szukamy max i min
        max = Z[0];
        min = Z[0];

        for(int i = 0; i < k; i++) {
            if (Z[i] > max) {
                max = Z[i];
            }

            // 0 nie moze byc brane pod uwage, bo domyslnie przypisane zero zawsze jest mniejsze
            if (Z[i] < min && Z[i] != 0) {
                min = Z[i];
            }
        }


        // szukamy elementu w tablicy T, ktory jest rowny min i max
        for(int i = 0; i < Z.length; i++) {
            if (Z[i] == max) {
                tablicaNajczestszych.add(i);
            }

            if (Z[i] == min) {
                tablicaNajrzadszych.add(i);
            }
        }

        System.out.println("Najczestsze liczby:");
        System.out.println(tablicaNajczestszych);
        System.out.println();
        System.out.println("Najrzadsze liczby:");
        System.out.println(tablicaNajrzadszych);
    }

    public static void main(String[] args) {
        int[] liczby = {0,0,9,9,3,4,1,1};

        najczestsze(8, 10, liczby);
    }
}