package cwiczenia;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

// wyswietlic dane o poszczegolnych zawodnikach z pliku
public class WyswietlanieZawodnikow {
    public static void main(String[] args) throws IOException {
        List<String> listaZawodnikowString = Files.readAllLines(Path.of("zawodnicy.txt"));
        List<Zawodnik> listaZawodnikow = new ArrayList<>();

        for (String zawodnikWiersz: listaZawodnikowString
             ) {
            String[] tablicaZawodnik = zawodnikWiersz.split("\t");

            // nie dodaje jezeli w pierwszym wierszu jest id, czyli to pomija
            if (!tablicaZawodnik[0].contains("id_zawodnika")) {
                Zawodnik zawodnik = new Zawodnik(Integer.parseInt(tablicaZawodnik[0]), tablicaZawodnik[1], tablicaZawodnik[2], tablicaZawodnik[3]);
                listaZawodnikow.add(zawodnik);
            }
        }

        for (Zawodnik zawodnik: listaZawodnikow
             ) {
            System.out.println("ID: " + zawodnik.getID());
            System.out.println("Imie: " + zawodnik.getImie());
            System.out.println("Nazwisko: " + zawodnik.getNazwisko());
            System.out.println("Data: " + zawodnik.getData());
            System.out.println();
        }
    }
}

// todo reszta zadan
// zrobic wszystkie pozostale tabele z zadania
// w jakis sposob to polaczyc ze soba
// szukac pod warunkiem ze dane pola np. id sa rowne