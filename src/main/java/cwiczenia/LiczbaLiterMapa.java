package cwiczenia;


import java.util.HashMap;
import java.util.Map;

// https://codingbat.com/prob/p117630
// The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string,
// with the value the number of times that string appears in the array.
public class LiczbaLiterMapa {
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < strings.length ; i++) {
            if (result.containsKey(strings[i])) {
                result.replace(strings[i], result.get(strings[i]) + 1);
            }
            else result.put(strings[i], 1);
        }

        return result;
    }


    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(strings));
    }
}