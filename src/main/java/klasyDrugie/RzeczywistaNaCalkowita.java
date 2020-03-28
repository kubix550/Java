package klasyDrugie;
// 1.Napisz program, który odczytuje liczbę rzeczywistą i wyświetla wartość całkowitą tej liczby.

import java.util.Scanner;

public class RzeczywistaNaCalkowita {
    public static void main(String[] args) {
        double liczbaRzeczywista;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz liczbe rzeczywista");
            liczbaRzeczywista = input.nextDouble();             //dlaczego wywala jak wpisac np 5.5 ?
                                                                // bo sie wpisuje z przecinkiem

            System.out.println("Liczba rzeczywista " + liczbaRzeczywista + " to " + (int)liczbaRzeczywista + " jako liczba calkowita");
        }
    }
}