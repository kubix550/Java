package matura2018;

public class Palindrom {

    public static boolean palindrom(String w) {

        boolean czyPalindrom = true;

        for(int i = 0; i < w.length(); i++) {
            if (! (w.charAt(i) == (w.charAt(w.length()-i-1))) ) {
                czyPalindrom = false;
                break;
            }
        }

        return czyPalindrom;
    }

    public static void main(String[] args) {
        System.out.println(palindrom("atokanapapanakota"));
    }
}