package cwiczenia;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://codingbat.com/prob/p115967
// Given a list of strings, return a list where each string has "y" added at its end,
// omitting any resulting strings that contain "yy" as a substring anywhere.
public class ListaBezY {
    public static List<String> noYY(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String item: strings
             ) {
            if (!item.endsWith("y") && !item.contains("yy")) {
                result.add(item + "y");
            }
        }

        return result;
    }


    public static void main(String[] args) {
        List<String> lista = Arrays.asList("xx", "ya", "zz");

        System.out.println(noYY(lista));
    }
}