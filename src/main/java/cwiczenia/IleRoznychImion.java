package cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


// ile roznych imion zenskich w pliku
public class IleRoznychImion {
    public static void main(String[] args) throws IOException {
        List<String> listaImion = Files.readAllLines(Path.of("imiona.txt"));
        Set<String> listaImionZenskich = new HashSet<>();

        for (String element: listaImion
             ) {
            String[] tablica = element.split(",");

            for (String elementTablicy: tablica
                 ) {
                if (elementTablicy.endsWith("a")) {
                    listaImionZenskich.add(elementTablicy);
                }
            }
        }

        System.out.println(listaImionZenskich);
    }
}