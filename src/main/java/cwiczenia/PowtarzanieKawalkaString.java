package cwiczenia;

// https://codingbat.com/prob/p152339
// Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
// You may assume that n is between 0 and the length of the string, inclusive.
public class PowtarzanieKawalkaString {
    public static String repeatEnd(String str, int n) {
        int ileOdjac = str.length() - n;
        String fragmentTekstu = str.substring(ileOdjac);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n ; i++) {
            builder.append(fragmentTekstu);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
}