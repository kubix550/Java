package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
// https://codingbat.com/prob/p137274
public class ListaBezPrzedzialu {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(a -> a < 13 || a > 19).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 13, 19, 20);

        System.out.println(noTeen(list));
    }
}
