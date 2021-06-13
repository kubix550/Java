package cwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// https://codingbat.com/prob/p194496
// Given a list of strings, return a list of the strings, omitting any string length 4 or more.
public class OmijanieDlugosci {

    public static List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() < 4) {
                result.add(strings.get(i));
            }
        }

        return result;
    }

    public static List<String> noLongStream(List<String> strings) {
        return strings.stream().filter(a -> a.length() < 4).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("this", "not", "too", "long");

        System.out.println(noLong(list));
        System.out.println(noLongStream(list));
    }
}