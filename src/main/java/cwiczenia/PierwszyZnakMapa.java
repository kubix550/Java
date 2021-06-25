package cwiczenia;

// https://codingbat.com/prob/p168493
// Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
// with the value of all the strings starting with that character appended together in the order they appear in the array.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PierwszyZnakMapa {

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        Set<String> resultKlucze = new HashSet<>();


        // tu sa zapisane pojedyncze klucze do mapy
        for (int i = 0; i < strings.length ; i++) {
            resultKlucze.add(String.valueOf(strings[i].charAt(0)));
        }

        for (String klucz: resultKlucze
             ) {

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < strings.length ; i++) {
                if (String.valueOf(strings[i].charAt(0)).equals(klucz)) {
                    builder.append(strings[i]);
                }
            }

            result.put(klucz, String.valueOf(builder));
        }

        return result;
    }


    public static void main(String[] args) {
        String[] tablica = {"salt", "tea", "soda", "toast"};

        System.out.println(firstChar(tablica));
    }
}
