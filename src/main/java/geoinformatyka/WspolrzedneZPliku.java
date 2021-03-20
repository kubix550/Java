package geoinformatyka;


// 6. Napisz fragment kodu programu w wybranym środowisku programistycznym,
// który pobiera z pliku tekstowego współrzędne obiektów oraz wykonuję na nich podaną operację matematyczną.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WspolrzedneZPliku {

    public static List<ModelWspolrzednych> wspolrzedneZPliku(Path fileName) {
        List<ModelWspolrzednych> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(fileName);
            for (String element: lista
            ) {
                String[] tablica = element.split(";");
                ModelWspolrzednych wspolrzedne = new ModelWspolrzednych(tablica[0], tablica[1]);
                result.add(wspolrzedne);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        List<ModelWspolrzednych> listaWspolrzednych = wspolrzedneZPliku(Paths.get("wspolrzedne.txt"));

        // przykladowa operacja - pomnozenie szerokosci geograficznej w drugiej linijce przez 5
        double szerokoscDrugiejLinijki = Double.parseDouble(listaWspolrzednych.get(1).szerokoscGeograficzna);
        System.out.println("Pierwotna szerokosc: " + szerokoscDrugiejLinijki);
        System.out.println("Wymnozona przez 5: " + szerokoscDrugiejLinijki*5);
    }
}