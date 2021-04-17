package cwiczenia;


import geoinformatyka.ModelWspolrzednych;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// zsumowac liczby z pliku stoLiczbPierwszych
public class SumowaniePlik {

    public static void main(String[] args) throws IOException {
        List<String> listaLiczbPierwszych = Files.readAllLines(Path.of("stoLiczbPierwszych.txt"));


        /////////////////////
        // FORI
        ////////////////////
        int sumaPierwszychFORI = 0;
        for (int i = 0; i < listaLiczbPierwszych.size() ; i++) {
             sumaPierwszychFORI = sumaPierwszychFORI + Integer.parseInt(listaLiczbPierwszych.get(i));
        }
        System.out.println(sumaPierwszychFORI);


        /////////////////////
        // STREAM
        ////////////////////
        int sumaPierszychSTREAM = listaLiczbPierwszych.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sumaPierszychSTREAM);


        /////////////////////
        // STREAM INNY
        ////////////////////
        int sumaPierszychSTREAMINNY = listaLiczbPierwszych.stream().map(Integer::parseInt).reduce((a, b) -> a + b).get();
        System.out.println(sumaPierszychSTREAMINNY);
    }
}