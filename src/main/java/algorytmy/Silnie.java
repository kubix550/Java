package algorytmy;

import java.math.BigInteger;

public class Silnie {

    // SILNIA ITERACYJNA
    public static int silniaIter(int number) {
        int wynik = 1;

        for (int i = 1; i <= number ; i++) {                // zaczynamy od 1, bo mnozac przez 0 wychodzi ciagle to samo
            wynik = wynik*i;                                // wynik jest za kazdym razem mnozony przez i
        }

        return wynik;                                       // zwraca ostateczna silnie
    }


    // SILNIA REKURENCYJNA
    public static int silniaRekur(int number) {

        if (number == 0 || number == 1) {                   // dla 0 i 1, silnia jest zawsze rowna jeden
            return 1;
        }

        return number*silniaRekur(number-1);        // jezeli 2 albo wiecej to zwraca obecny numer * poprzednia silnia
    }                                                      // bo np. silnia(3) = 3 * silnia(2)


    // SILNIA ITERACYJNA BIGINT
    public static BigInteger silniaIterBigInt(int number) {
        BigInteger wynik = new BigInteger("1");

        for (int i = 1; i <= number ; i++) {
            wynik = wynik.multiply(BigInteger.valueOf(i));
        }

        return wynik;
    }


    // SILNIA REKURENCYJNA BIGINT
    public static BigInteger silniaRekurBigInt(int number) {

        if (number == 0 || number == 1) {
            return new BigInteger("1");
        }

        return silniaRekurBigInt(number-1).multiply(BigInteger.valueOf(number));
    }


    public static void main(String[] args) {
        // 10! = 1 * 2 * 3 .. * 10

        System.out.println("Silnia iteracyjna z 10 to: " + silniaIter(10));
        System.out.println("Silnia rekurencyjna z 10 to: " + silniaRekur(10));
        System.out.println();
        System.out.println("Silnia iteracyjna (BigInt) z 30 to: " + silniaIterBigInt(30));
        System.out.println("Silnia rekurencyjna (BigInt) z 30 to: " + silniaRekurBigInt(30));
    }
}