package cwiczenia;


// program ma przestawic elementy tablicy o 1 w lewo
public class PrzesuniecieElementow {
    public static void main(String[] args) {
        int[] tablica = {0,1,5,0,0,7,8,9,0,0,0,7,3};
        int[] tablicaKoncowa = new int[tablica.length];


        // wstawia elementy od pierwszego zeby bylo przesuniete w lewo
        for (int i = 1, j = 0; i < tablica.length && j < tablica.length ; i++, j++) {
            tablicaKoncowa[j] = tablica[i];
        }

        // trzeba manualnie dodac pierwszy
        tablicaKoncowa[tablicaKoncowa.length - 1] = tablica[0];


        for (int i = 0; i < tablica.length ; i++) {
            System.out.print(tablicaKoncowa[i] + " ");
        }
    }
}