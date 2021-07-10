package cwiczenia;

// https://codingbat.com/prob/p198700
// Given three ints, a b c, one of them is small, one is medium and one is large.
// Return true if the three values are evenly spaced, so the difference between small
// and medium is the same as the difference between medium and large.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RowneOdstepy {
    public static boolean evenlySpaced(int a, int b, int c) {
        List<Integer> liczby = Arrays.asList(a, b, c);
        Collections.sort(liczby);

        return (liczby.get(1) - liczby.get(0) == liczby.get(2) - liczby.get(1));
    }


    public static void main(String[] args) {
        System.out.println(evenlySpaced(4,6,2));
        System.out.println(evenlySpaced(4,6,3));
    }
}
