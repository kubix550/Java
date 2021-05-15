package cwiczenia;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

// We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
// the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
// (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
// https://codingbat.com/prob/p196409
public class NajdluzszyCiagLustrzany {
    public static int maxMirror(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length  ; i++) {

            for (int j = nums.length - 1; j >= 0 ; j--) {

                // nie mozna uzyc i, j w while bo w srodku while zmodyfikowalyby sie wartosci w petlach fori
                int l = i;
                int p = j;
                int tymczasowy = 0;

                // najpierw sprawdzane sa warunki do przedzialu tablicy, na koncu czy sa rowne, bo jak dac na poczatek to nie sprawdza innych warunkow
                while (l < nums.length && p >= 0 && nums[l] == nums[p]) {
                    tymczasowy++;
                    l++;
                    p--;
                }

                // pod result podstawia wieksza liczbe
                result = Math.max(tymczasowy, result);

            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] tablica = {1, 2, 1, 4};
        System.out.println(maxMirror(tablica));
    }
}