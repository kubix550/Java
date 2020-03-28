package klasyPierwsze;
// 8. Napisać program, który wyświetli co czwartą liczbę dwucyfrową.

public class CoCzwartaDwucyfrowa {
    public static void main(String[] args) {

        for (int i = 10; i <=99  ; i=i+4) {                         //zaczynamy od 10 bo to pierwsza dwucyfrowa
            System.out.println(i);                                  //ostatnia dwucyfrowa to 99
        }                                                           //ostatni fragment for powoduje ze liczy co 4
    }
}