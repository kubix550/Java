package matura2018;

public class PrzesunieciePalindromuInne {
    public static boolean przesun(String w, int k) {

        // latwiejszy sposob na palindromTXT, stringbuildera mozna odwrocic
        String slowoOdwrotne;
        StringBuilder stringBuilder = new StringBuilder();

        // petla przesuwa tyle liter z konca, ile wynosi "liczba"
        for (int i = 0; i < k ; i++) {

            // do obecnego slowa dodaje litere z konca na poczatek
            w = w.charAt(w.length() - 1) + w;

            // ostatnia litera slowa jest usuwana
            w = w.substring(0, w.length() - 1);
        }

        // dodaje w do stringbuildera i odwraca go, szybki palindromTXT
        stringBuilder.append(w);
        slowoOdwrotne = stringBuilder.reverse().toString();

        // sprawdza czy wyrazy sa sobie rowne, zwraca true/false
        return (slowoOdwrotne.equals(w));
    }


    public static void main(String[] args) {
        System.out.println(przesun("oowocow", 6));
    }
}