package cwiczenia;


// We'll say that a "triple" in a string is a char appearing three times in a row.
// Return the number of triples in the given string. The triples may overlap.
// https://codingbat.com/prob/p195714
public class LiteryPodRzad {
    public static int countTriple(String str) {
        int result = 0;
        int i = 2; // mozna zaczac od pozniejszego elementu i wskazywac wstecz zeby nie wyszlo poza

        while (i < str.length()) {
            if (str.charAt(i-2) == str.charAt(i-1) && str.charAt(i-1) == str.charAt(i)) {
                result++;
            }

            i++;
        }


        return result;
    }

    public static void main(String[] args) {
        String text = "abcXXXabc";

        System.out.println(countTriple(text));
    }
}