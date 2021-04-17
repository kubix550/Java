package cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// zapisac do pliku sto liczb pierwszych od 2 kazda liczba w innym wierszu
public class LiczbyPierwszeDoPliku {

    public static boolean czyLiczbaPierwsza(int liczba) {
        for (int i = 2; i <= liczba/2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File output = new File("stoLiczbPierwszych.txt");
        PrintWriter printWriter = new PrintWriter(output);

        int licznikLiczbPierwszych = 0;
        int liczba = 2;


        while (licznikLiczbPierwszych < 100) {
            if (czyLiczbaPierwsza(liczba)) {
                printWriter.println(liczba);

                licznikLiczbPierwszych++;
            }
            liczba++;
        }

        printWriter.close();
    }
}