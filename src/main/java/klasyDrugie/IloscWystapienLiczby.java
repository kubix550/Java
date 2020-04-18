package klasyDrugie;
// 19.Napisz program, który wyznaczy ilość wystąpień liczby k w podanym ciągu liczb.

public class IloscWystapienLiczby {
    public static void main(String[] args) {
        String ciagLiczb = "164512481";
        char k = '1';   // szuka znaku 1
        int licznikString = 0;

        for (int i = 0; i < ciagLiczb.length() ; i++) {
            if (ciagLiczb.charAt(i) == k) {
                licznikString++;
            }
        }

        System.out.println("Liczba wystapila " + licznikString + " razy.");


        // ALBO

        int[] tablica = {-4, 2, 5, 9, 40, -45, 0, 19, 2};
        int l = 2;  // szuka liczby 2
        int licznikTablicy = 0;

        for (int i = 0; i < tablica.length ; i++) {
            if (tablica[i] == l) {
                licznikTablicy++;
            }
        }

        System.out.println("Liczba wystapila " + licznikTablicy + " razy.");
    }
}