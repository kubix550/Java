package klasyDrugie;
// 13.Napisz metodę, która wyznacza sumę cyfr zadanej liczby całkowitej.
// !

public class SumaCyfrLiczby {
    public static int sumaCyfr(int a) {
        int suma = 0;

        while (a != 0) {
            suma=suma+a%10;
            a = a/10;                               //dzielenie calkowite bo a jest calkowite
            System.out.println("Suma = " + suma);
            System.out.println("A = " + a);
        }
        return suma;
    }


    public static void main(String[] args) {
        sumaCyfr(352);
    }
}