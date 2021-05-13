package cwiczenia;

import java.util.HashMap;
import java.util.Map;

// Given an array of non-empty strings, create and return a Map<String, String> as follows:
// for each string add its first character as a key with its last character as the value.
// https://codingbat.com/prob/p126332
public class PierwszaOstatniaLitera {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (int i = 0; i < strings.length ; i++) {
            result.put(strings[i].substring(0,1), strings[i].substring(strings[i].length() - 1));
        }

        return result;
    }


    public static void main(String[] args) {
        String[] tablica = {"code", "bug"};
        System.out.println(pairs(tablica));
    }
}