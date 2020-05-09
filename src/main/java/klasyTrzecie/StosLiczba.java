package klasyTrzecie;

import java.util.Scanner;
import java.util.Stack;

// 11.Korzystając ze Stosu, napisz funkcję, która odczytuje daną liczbę i zwraca liczbę zapisaną w systemie dwójkowym.
// Argumentem funkcji jest liczba całkowita(int), zwróconym wynikiem ciąg znaków (String).

public class StosLiczba {
    public static void main(String[] args) {
        Stack<Integer> stos = new Stack<>();
        StringBuilder builder = new StringBuilder();
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadz liczbe");
        int a = input.nextInt();

        // szybszy sposob (ale w zadaniu trzeba stos)
        System.out.println("liczba " + a + " w systemie dwojkowym to: " + Integer.toBinaryString(a));
        System.out.println("liczba " + a + " w systemie szesnastkowym to: " + Integer.toHexString(a));
        System.out.println("liczba " + a + " w systemie osemkowym to: " + Integer.toOctalString(a));

        //dluzszy sposob, zgodny z zadaniem (dwojkowy)
        while (a != 0) {
            stos.push(a%2);
            a = a/2;
        }

        while (!stos.empty()) {
            builder.append(stos.pop());     // dodaje sie to co jest zdjete ze stosu a nie "a" bo a wychodzi na koncu 0
        }                                   // peek wyswietla liczbe na wierzcholku stosu a pop zdejmuje

        System.out.println();
        System.out.println("[ZGODNIE Z ZADANIEM] Wprowadzona liczba dwojkowo to " + builder);
    }
}


//np 102
//0   1   1   0   0   1   1
//1   2   4   8   16  32  64            to musi byc odwrocone aby powstala liczba binarna