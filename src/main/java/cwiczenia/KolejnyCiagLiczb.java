package cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// podac dlugosc rosnacego ciagu liczb z pliku gdzie cyfy roznia sie o 1, zaczynamy od jedynki
public class KolejnyCiagLiczb {
    public static int dlugoscCiaguWhile(List<String> listaLiczb) {
        int dlugoscRosnacego = 0;
        int szukana = 1;
        int i = 0;

        while (i < listaLiczb.size()) {
            if (Integer.parseInt(listaLiczb.get(i))  == szukana) {
                dlugoscRosnacego++;
                szukana++;
            }

            i++;
        }

        return dlugoscRosnacego;
    }

    public static int dlugoscCiaguIterator(List<String> listaLiczb) {
        Iterator<String> iterator = listaLiczb.iterator();
        int szukana = 1;
        int dlugoscRosnacego = 0;

        // iterator dziala na elem kolekcji, sprawdza czy istnieje kolejny element wiec uniknie sie i++
        while (iterator.hasNext()) {
            if (Integer.parseInt(iterator.next()) == szukana) {
                dlugoscRosnacego++;
                szukana++;
            }
        }

        return dlugoscRosnacego;
    }

    public static int dlugoscCiaguForeach(List<String> listaLiczb) {
        int szukana = 1;
        int dlugoscRosnacego = 0;

        for (String item: listaLiczb
             ) {
            if (Integer.parseInt(item) == szukana) {
                szukana++;
                dlugoscRosnacego++;
            }
        }

        return dlugoscRosnacego;
    }


    public static void main(String[] args) throws IOException {
        List<String> listaLiczb = Files.readAllLines(Paths.get("kolejneLiczby.txt"));

        System.out.println("Dlugosc ciagu (while): " + dlugoscCiaguWhile(listaLiczb));
        System.out.println("Dlugosc ciagu (iterator): " + dlugoscCiaguIterator(listaLiczb));
        System.out.println("Dlugosc ciagu (foreach): " + dlugoscCiaguForeach(listaLiczb));
    }
}