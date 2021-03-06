package pozostale;

public class CalkowanieNumeryczne {

    // globalne zmienne (a, b - granice, n - ilosc prostokatow)
    static double a = 0;
    static double b = 1;
    static double n = 100000000;

    public static double f(double x) {
        // bo funkcja liniowa
        return x;
    }

    public static double metodaProstokatow() {
        double suma = 0;
        double szerokosc = (b-a)/n;

        for (int i = 0; i < n ; i++) {
            // f(a + i * szerokosc) - to wysokosc kazdego prostokata
            suma = suma + f(a + i * szerokosc) * szerokosc;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(metodaProstokatow());

        // todo
        // dokladnosc - np. 0.001, to policzy az osiagnie to od prawdziwej wartosci
        // dopisac metode z trapezami
    }
}