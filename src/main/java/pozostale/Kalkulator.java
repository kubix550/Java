package pozostale;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalkulator {
    public static int add(int a, int b) {                               //okreslenie metod dla kalkulatora aby bylo czytelniej i wygodniej potem
        return a+b;                                                     //potem int a, int b, beda zamienione na numer1 i numer2
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int mult(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        int c = 0;                                                      //musi byc wczesniej napisane, z okreslona wartoscia
        try {                                                           //try powoduje wyjatek
            c = a/b;
        }
        catch (ArithmeticException obiekt) {                            //obsluguje wyjatek jesli bedzie taki przypadek
            System.out.println("Dzielenie przez 0");                    //ArithmeticException to konkretny wyjatek, wziety z konsoli
        }
        return c;
    }

    public static void main(String[] args) {
        int numer1;
        int numer2;
        String operacja;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Wprowadz pierwsza liczbe");
            numer1 = Integer.parseInt(input.nextLine());                //input nextLine aby obslugiwalo tekst i liczby, Integrer.parseInt zmienia to w int

            System.out.println("Wprowadz druga liczbe");
            numer2 = Integer.parseInt(input.nextLine());

            System.out.println("Wybierz operacje: + , - , * , / ");
            operacja = input.nextLine();

            if (operacja.equals("+")) {                                 //w string jest equals, w int ==
                System.out.println(add(numer1, numer2));
            }
            else if (operacja.equals("-")) {
                System.out.println(sub(numer1, numer2));
            }
            else if (operacja.equals("*")) {
                System.out.println(mult(numer1, numer2));
            }
            else if (operacja.equals("/")) {
                System.out.println(div(numer1, numer2));
            }
            else {
                System.out.println("Nieznana operacja");
            }
        }
    }
}