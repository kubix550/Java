package cwiczenia;


// program zwraca tablice z zerami na poczatku a reszta w kolejnosci wystepowania
public class ZeraNaPoczatku {
    public static void main(String[] args) {
        int[] tablica = {0,1,5,0,0,7,8,9,0,0,0,7,3};
        int[] tablicaKoncowa = new int[tablica.length];
        int liczbaZer = 0;

        // liczy zera
        for (int i = 0; i < tablica.length ; i++) {
            if (tablica[i] == 0) {
                liczbaZer++;
            }
        }

        System.out.println("liczba zer: " + liczbaZer);

        for (int i = 0, j = liczbaZer; i < tablica.length && j < tablica.length ; i++) {
            if (tablica[i] != 0) {
                tablicaKoncowa[j] = tablica[i];

                // j zwiekszane dopiero jak bedzie niezerowe
                j++;
            }
        }

        for (int i = 0; i < tablicaKoncowa.length ; i++) {
            System.out.print(tablicaKoncowa[i] + " ");
        }
    }
}
