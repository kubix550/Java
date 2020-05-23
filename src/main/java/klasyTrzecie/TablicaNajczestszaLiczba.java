package klasyTrzecie;

// 4.W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TablicaNajczestszaLiczba {
    public static void main(String[] args) {
        int[] tablica = {1, 5, 25, -10, 15, 2, 2, 1, 7, 6, 6, 7, 2, 2, 2, 2, 6, 9, 4, 2, 0};
        int maxKlucz = tablica[0];
        int maxValue = 1;

        // mapa przechowuje pary (klucz, wartosc) np (25,1)
        Map<Integer,Integer> mapa = new TreeMap<>();                    // TreeMap sortuje po kluczach od razu podczas wstawiania

        for (int i = 0; i < tablica.length ; i++) {
            if (mapa.containsKey(tablica[i]))  {                        // sprawdza czy istnieje juz taki klucz
                mapa.replace(tablica[i], mapa.get(tablica[i]) + 1);     // mapa.replace jezeli znajdzie drugi raz wartosc, a mapa.get pobiera nowa wartosc
            }
            else mapa.put(tablica[i], 1);                            // podstawia 1 jezeli element z tablicy wystapi pierwszy raz
        }

        // dokladne wyswietlanie elementow mapy
        // entryset wyswietla jednoczesnie klucz i wartosc

//        for (Map.Entry<Integer, Integer> para: mapa.entrySet()) {
//            System.out.println();
//            System.out.println(para.getKey() + " - klucz");
//            System.out.println(para.getValue() + " - wartosc");
//        }

        // szybsze wyswietlanie
        System.out.println(mapa);

        for (Map.Entry<Integer, Integer> para: mapa.entrySet()){
            if (para.getValue() > maxValue) {
                maxKlucz = para.getKey();
                maxValue = para.getValue();
            }
        }

        System.out.println("Liczba " + maxKlucz + " wystepuje najczesciej: " + maxValue + " razy");


        // todo przerobic drugi sposob tylko na tablicy
//        int[] tablica = {1, 5, 25, -10, 15, 2, 2, 1, 7, 6, 6, 7, 2, 2, 2, 2, 6, 9, 4, 2, 0};
//        int najczestszaLiczba = 0;
//
//        Arrays.sort(tablica);
//
//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i] == tablica[i + 1]) {
//                System.out.println(tablica[i]);
//            }
//        }

    }
}