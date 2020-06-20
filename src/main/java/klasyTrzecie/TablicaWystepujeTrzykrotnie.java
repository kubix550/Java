package klasyTrzecie;

// 5.Sprawdź czy w tablicy jakaś liczba występuje co najmniej trzykrotnie.

import java.util.Map;
import java.util.TreeMap;

public class TablicaWystepujeTrzykrotnie {

    public static boolean czySiePowtarza(Map<Integer, Integer> map, int licznik) {
        // domyslnie falsz jak nie znajdzie
        boolean result = false;

        for (Map.Entry<Integer, Integer> para : map.entrySet()) {
            if (para.getValue() >= licznik) {
                // jak znajdzie to true
                result = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] tablica = {2, 3, 5, 10, 3, 6, 3, 3, 5, 1, 6, 6, 12, 8, 5, 9, 10, 10, 10, 10};

        Map<Integer, Integer> mapa = new TreeMap<>();

        for (int i = 0; i < tablica.length; i++) {
            if (mapa.containsKey(tablica[i])) {
                mapa.replace(tablica[i], mapa.get(tablica[i]) + 1);
            } else mapa.put(tablica[i], 1);
        }


// dokladne wyswietlanie ktore liczby sa co najmniej trzykrotnie
//        for (Map.Entry<Integer, Integer> para : mapa.entrySet()) {
//            if (para.getValue() >= 3) {
//                System.out.println("Liczba " + para.getKey() + " wystepuje " + para.getValue() + "-krotnie");
//            }

        // zgodnie z poleceniem
        System.out.println(czySiePowtarza(mapa, 3));
    }
}