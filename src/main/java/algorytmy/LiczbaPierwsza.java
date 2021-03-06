package algorytmy;

public class LiczbaPierwsza {
    public static boolean czyLiczbaPierwsza(int liczba) {
        boolean pierwsza = true;

        // Math.sqrt bo tak korzystniej sprawdza sie dzielniki
        for (int i = 2; i < (int)Math.sqrt(liczba) ; i++) {
            if (liczba%i == 0) {
                pierwsza = false;

                // break bo nie sprawdza dalej
                break;
            }
        }
        return pierwsza;
    }

    public static void main(String[] args) {
        System.out.println(czyLiczbaPierwsza(5));
    }
}