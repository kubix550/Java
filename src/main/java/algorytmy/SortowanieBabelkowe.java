package algorytmy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SortowanieBabelkowe {
    public static int[] posortowane (int[] tablica) {
        int licznikObrotowPetli = -1;

        // domyslnie jest przestawienie
        boolean byloPrzestawienie = true;

        // uruchamia iles razy wewnatrz
        for (int i = 0; i < tablica.length; i++) {
            licznikObrotowPetli++;

            // sprawdza czy bylo przestawienie
            if (byloPrzestawienie) {

                // domyslnie jest false, jakby drugi for sie nie uruchomil
                byloPrzestawienie = false;

                // tu dopiero sortowanie
                for (int j = 0; j < tablica.length - 1; j++) {

                    int tymczasowyElement;
                    if (tablica[j+1] < tablica[j]) {
                        tymczasowyElement = tablica[j];
                        tablica[j] = tablica[j+1];
                        tablica[j+1] = tymczasowyElement;
                        // liczby przestawione wiec ustawia warunek na true
                        byloPrzestawienie = true;
                    }
                }
            }

            else break;
        }

        System.out.println("Liczba obrotow zewnetrznej petli: " + licznikObrotowPetli);
        for (int i = 0; i < tablica.length ; i++) {
            System.out.print(tablica[i] + " ");
        }

        System.out.println();
        System.out.println();

        return tablica;
    }

    public static void plik(String sciezka) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(sciezka));
        strings.forEach(wiersz -> {
            int[] numbers = Arrays.stream(wiersz.split(",")).mapToInt(Integer::parseInt).toArray();
            posortowane(numbers);
        });
    }

    public static void main(String[] args) throws IOException {
        plik("daneAlgorytmBabelkowy.txt");
    }
}