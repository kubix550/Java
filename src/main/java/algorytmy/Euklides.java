package algorytmy;

public class Euklides {

    // NWD ITERACYJNE - ODEJMOWANIE
    public static int OdejmowanieIterNWD(int a, int b) {

        // odejmuje wieksze od mniejszego dopoki nie sa rowne
        while (a != b) {

            if (a > b) {
                a = a - b;
            }
            else if (b > a){
                b = b - a;
            }
        }

        // wyswietla jedna z nich, nie ma znaczenia ktora bo sa rowne
        return a;
    }


    // NWD REKURENCYJNE - ODEJMOWANIE
    public static int OdejmowanieRekurNWD(int a, int b) {

        if (a > b) {
            return OdejmowanieRekurNWD(a - b, b);
        }
        else if (b > a) {
            return OdejmowanieRekurNWD(a, b - a);
        }

        return a;
    }


    // NWD ITERACYJNE - DZIELENIE
    public static int DzielenieIterNWD(int a, int b) {

        while (b != 0) {                                    // jak "b" rozne od zera
            int reszta = a%b;
            a = b;                                          // podstawia "b" pod "a"
            b = reszta;                                     // reszta to nowe "b"
        }

        return a;
    }


    // NWD REKURENCYJNE - DZIELENIE
    public static int DzielenieRekurNWD(int a, int b) {
        if (b != 0) {
            return DzielenieRekurNWD(b, a%b);
        }

        return a;
    }


    public static void main(String[] args) {

        System.out.println("NWD iteracyjne liczb 36 i 24");
        System.out.println("Metoda odejmowania: " + OdejmowanieIterNWD(36,24));
        System.out.println();

        System.out.println("NWD rekurencyjne liczb 36 i 24");
        System.out.println("Metoda odejmowania: " + OdejmowanieRekurNWD(36,24));
        System.out.println();

        System.out.println("NWD iteracyjne liczb 36 i 24");
        System.out.println("Metoda dzielenia: " + DzielenieIterNWD(36,24));
        System.out.println();

        System.out.println("NWD rekurencyjne liczb 36 i 24");
        System.out.println("Metoda dzielenia: " + DzielenieRekurNWD(36,24));
    }
}