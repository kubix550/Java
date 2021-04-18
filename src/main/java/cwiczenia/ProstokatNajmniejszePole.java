package cwiczenia;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// znalezc najmniejsze pole z pliku
public class ProstokatNajmniejszePole {
    public static void main(String[] args) throws IOException {
        List<String> listaProstokatow = Files.readAllLines(Path.of("prostokaty.txt"));
        int pierwszyBok;
        int drugiBok;
        int pole;
        int najmniejszePole = Integer.MAX_VALUE;

        for (String element: listaProstokatow
             ) {
            String[] tablica =  element.split(",");
            pierwszyBok = Integer.parseInt(tablica[0]);
            drugiBok = Integer.parseInt(tablica[1]);
            pole = pierwszyBok*drugiBok;

            if (pole < najmniejszePole && pole > 0) {
                najmniejszePole = pole;
            }
        }

        System.out.println(najmniejszePole);
    }
}