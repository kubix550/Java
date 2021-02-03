package maturaOgolne.najdluzszyPodciag;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// PRÓBNY EGZAMIN MATURALNY Z INFORMATYKI STYCZEŃ 2018, PTI
public class Podciag {

    public static int znajdzPodciag(int[] tablica, List<Integer> wynik) {

        int najdluzszyPodciag = 0;                                                  // na poczatku najdluzszy podciag to 0
        int[] dlugoscPodciagu = new int[tablica.length];
        dlugoscPodciagu[0] = 1;

        for (int i = 1; i < tablica.length; i++) {
            dlugoscPodciagu[i] = 1;

            for (int j = 0; j < i; j++) {
                if (tablica[j] < tablica[i])
                    if (dlugoscPodciagu[i] < dlugoscPodciagu[j] + 1) {
                        dlugoscPodciagu[i] = dlugoscPodciagu[j] + 1;
                    }
            }
        }

//        for (int i = 0; i < dlugoscPodciagu.length ; i++) {
//            System.out.print(dlugoscPodciagu[i] + " ");
//        }

        najdluzszyPodciag = dlugoscPodciagu[0];
        int miejsce = 0;                                        // indeks najwiekszego elementu w drugiej tablicy

        for (int i = 1; i < tablica.length; ++i) {
            if (najdluzszyPodciag < dlugoscPodciagu[i]) {
                najdluzszyPodciag = dlugoscPodciagu[i];
                miejsce = i;
            }
        }

//        System.out.println();
//        System.out.println(najdluzszy);


        wynik.add(0, tablica[miejsce]);

        for (int i = miejsce - 1; i >= 0; i--) {                                    // od najwiekszego indeksu idzie od konca w dol, do poczatku tablicy
            if (dlugoscPodciagu[miejsce] == dlugoscPodciagu[i] + 1) {               // szuka elementu o jeden mniejszego (dlugosc podciagu)
                wynik.add(0, tablica[i]);
                miejsce = i;                                                        // zmieniamy obecny najwiekszy element
            }
        }

        return najdluzszyPodciag;
    }

    public static void main(String[] args) throws IOException {
        List<String> plik = Files.readAllLines(Paths.get("ciagi.txt"));
        for (String string : plik) {                                                // dzieli kazdy wiersz po spacjach
            List<Integer> listaNajdluzszyCiag = new ArrayList<>();

            if (!string.equals("100")) {                                            // jezeli w wierszu nie ma 100, to przetwarza dalej, bo 100 dla zmylki
                int[] tablicaZPliku = Arrays.asList(string.split(" ")).stream().mapToInt(s -> Integer.valueOf(s)).toArray();  // zamienia tablice stringow tablice intow

                System.out.println("Dlugosc podciagu: " + znajdzPodciag(tablicaZPliku, listaNajdluzszyCiag));
                System.out.println(listaNajdluzszyCiag);
            }
        }
    }
}