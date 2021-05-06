package cwiczenia;


import com.sun.source.tree.NewArrayTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// bierze dwie kolejne liczby z pliku, liczy nwd i znajduje najmniejsze
public class NajmniejszeNWD {

    public static int NWD(int a, int b) {
        while (a != b) {

            if (a > b) {
                a = a - b;
            }
            else if (b > a){
                b = b - a;
            }
        }

        return a;
    }

    public static void main(String[] args) throws IOException {
        List<String> listaLiczb = Files.readAllLines(Paths.get("kolejneLiczby.txt"));

        int najmniejszeNWD = Integer.MAX_VALUE;
        int najmnLiczbaPierwsza = Integer.MAX_VALUE;
        int najmnLiczbaDruga = Integer.MAX_VALUE;

        for (int i = 1; i < listaLiczb.size() ; i++) {
            if (najmniejszeNWD > NWD(Integer.parseInt(listaLiczb.get(i-1)), Integer.parseInt(listaLiczb.get(i)))) {
                najmniejszeNWD = NWD(Integer.parseInt(listaLiczb.get(i-1)), Integer.parseInt(listaLiczb.get(i)));
                najmnLiczbaPierwsza = Integer.parseInt(listaLiczb.get(i-1));
                najmnLiczbaDruga = Integer.parseInt(listaLiczb.get(i));
            }
        }

        System.out.println("Najmniejsze NWD: " + najmniejszeNWD + " miedzy liczbami: " + najmnLiczbaPierwsza + " i " + najmnLiczbaDruga);
    }
}
