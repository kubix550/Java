package cwiczenia;

// https://codingbat.com/prob/p117019
// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
// Return 0 if they both go over.

public class Blackjack {

    public static int blackjack(int a, int b) {
        // jezeli obie sa za duze, zwraca od razu 0
        if (a > 21 && b > 21) {
            return 0;
        }

        int najwieksza = Math.max(a, b);
        int najmniejsza = Math.min(a, b);

        // jezeli najwieksza z dwoch przekracza 21, to zwraca mniejsza
        if (najwieksza > 21) {
            return najmniejsza;
        }

        // tu zwraca wieksza, bo na pewno jest mniejsza rowna 21
        else return najwieksza;
    }

    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(22, 19));
    }
}