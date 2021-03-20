package geoinformatyka;



// 5. Napisz fragment kodu programu w wybranym środowisku programistycznym,
// który przelicza współrzędne geograficzne wyrażone w stopniach, minutach
// i sekundach na stopnie dziesiętne lub odwrotnie.

public class PrzeliczanieWspolrzednych {
    public static double geograficzneNaDziesietne(double stopnie, double minuty, double sekundy) {
        double dziesietne = (sekundy/3600) + (minuty/60) + stopnie;

        return dziesietne;
    }

    public static int naPelnaLiczbe(double liczba) {
        int calosc = (int) liczba;

        return calosc;
    }

    public static void dziesietneNaGeograficzne(double dziesietne) {
        double stopnie;
        double minuty;
        double pelneMinuty;
        double sekundy;

        // stopnie to pelna liczba
        stopnie = naPelnaLiczbe(dziesietne);

        // minuty to calosciowa liczba po przecinku pomnozona przez 60
        minuty = (dziesietne-stopnie)*60;
        pelneMinuty = naPelnaLiczbe(minuty);

        // sekundy to reszta pozostala z odjecia od minut z przecinkiem pelnej liczby
        sekundy = (minuty-pelneMinuty)*60;
        sekundy = Math.floor(sekundy * 100) / 100;;

        // castowanie do int zeby wynik lepiej wygladal
        System.out.println((int)stopnie + "° " + (int)pelneMinuty + "' " + sekundy + "''");

    }

    public static void main(String[] args) {
        System.out.println("N 50° 4' 10.77'' | E 19° 47' 57.31''");
        System.out.println("N " + geograficzneNaDziesietne(50,4,10.77) + " | E " + geograficzneNaDziesietne(19,47,57.31));

        System.out.println();
        System.out.println();

        System.out.println("N 50.06965833333334");
        dziesietneNaGeograficzne(50.06965833333334);
        System.out.println();
        System.out.println("E 19.799252777777777");
        dziesietneNaGeograficzne(19.799252777777777);
    }
}