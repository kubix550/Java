package klasyTrzecie;

// 2.Napisz program, który sprawdza czy podany wyraz jest poprawnym kodem pocztowym

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KodPocztowy {
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz kod pocztowy:");
        text = input.nextLine();

        // okreslenie obiektu typu pattern, na jego podstawie jest podobienstwo
        // wyrazenie \\d oznacza cyfre, nawias typu {liczba} okresla ile razy poprzedzajace wyrazenie ma wystapic
        // trzeba uzywac podwojnych znakow \\ jezeli pattern jest w quotation mark
        // zamiast \\d mozna zrobic [0-9]
        Pattern pattern = Pattern.compile("\\d{2}-\\d{3}");

        // okreslenie obiektu typu matcher, szuka podobenstwa we wpisanym tekscie
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Kod pocztowy jest poprawny");
        } else {
            System.out.println("Niepoprawny kod pocztowy");
        }

        // mozna krocej
        System.out.println(Pattern.matches("\\d{2}-\\d{3}", text));
    }
}