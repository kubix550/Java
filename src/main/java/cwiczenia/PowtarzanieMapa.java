package cwiczenia;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

// Given an array of strings, return a Map<String, Boolean> where each different string is a key
// and its value is true if that string appears 2 or more times in the array.
// https://codingbat.com/prob/p190862
public class PowtarzanieMapa {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String,Boolean> result = new HashMap<>();

        for (int i = 0; i < strings.length ; i++) {
            if (result.containsKey(strings[i])) {
                result.put(strings[i], true);
            }
            else {
                result.put(strings[i], false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] tablica = {"a", "b", "a", "c", "b"};

        System.out.println(wordMultiple(tablica));
    }
}