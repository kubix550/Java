package algorytmy;

public class ZgadywanieLiczby {
    public static void main(String[] args) {
        // do stu
        int szukanaLiczba = 63;

        // poczatek i koniec przedzialu
        int l = 1;
        int p = 100;

        //
        // [ L ] ======================= [ srodek ] ======================== [ P ]
        //

        do {
            int srodek = (l+p)/2;

            if (szukanaLiczba == srodek) {                                  // spoowduje koniec, bo liczba znaleziona rowna sie srodkowi
                l = p;
            }

            else {
                if (szukanaLiczba <= srodek) {                              // jak szukana jest mniejsza lub rowna srodkowi to
                    p = srodek;                                             // zmniejsza przedzial ustawiajac p za obecny srodek
                }
                else l = srodek + 1;                                        // jak szukana jest wieksza od srodka to zmniejsza przedzial
            }                                                               // ustawiajac l za obecny srodek + 1, zeby sie zgadzalo do calosci
        }

        while (l != p);                                                     // leci dalej jak obie wartosci sa rozne
    }                                                                       // jak l bedzie rowny p, to znaczy ze liczba znaleziona
}