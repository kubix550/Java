package klasyDrugie;
// 17.Napisz metodę, którą wczytuje n liczb do tablicy, a następnie wypisuje je w odwrotnej kolejności.
// n = wielkosc zbioru danych, mozna zadeklarowac albo wziac od uzytkownika

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public class TablicaOdwrotnaKolejnosc {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        tablica[0] = 0;
        tablica[1] = 1;
        tablica[2] = 2;
        tablica[3] = 3;
        tablica[4] = 4;
        tablica[5] = 5;
        tablica[6] = 6;
        tablica[7] = 7;
        tablica[8] = 8;
        tablica[9] = 9;

        for (int i = 9; i >= 0 ; i--) {    // petla tzw downto
            System.out.println(tablica[i]);
        }

        // ALBO

        System.out.println("przed odwroceniem: " + Arrays.toString(tablica));
        ArrayUtils.reverse(tablica);        // trzeba bylo dodac dependency w pom.xml zeby to uzyc
        System.out.println("po odwroceniu: " + Arrays.toString(tablica));
    }
}