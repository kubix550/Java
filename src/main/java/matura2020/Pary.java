package matura2020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Pary {

    /////////////////////
    // ZADANIE 1
    /////////////////////
    public static boolean czyPierwsza(int liczba) {

        for (int i = 2; i < liczba/2  ; i++) {
            if (liczba%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void paraPierwszych(int liczba) {

        int temp1 = 0;
        int temp2 = 0;

        for (int i = 3; i < liczba ; i++) {
            int roznica = liczba - i;
            if (czyPierwsza(i) && czyPierwsza(roznica) && roznica-i >= temp2-temp1) {
                temp1 = i;
                temp2 = roznica;
            }
        }

        System.out.println(liczba + " " + temp1 + " " + temp2);
    }


    /////////////////////
    // ZADANIE 2
    /////////////////////

    public static void najdluzszyFragment(String wyraz) {
        int aktualnaDlugosc = 1;
        int maksymalnaDlugosc = 1;
        StringBuilder aktualnyBuilder = new StringBuilder();
        StringBuilder maksymalnyBuilder = new StringBuilder();

        for (int i = 1; i < wyraz.length() ; i++) {
            if (wyraz.charAt(i) == wyraz.charAt(i-1)) {
                aktualnaDlugosc++;
                aktualnyBuilder.append(wyraz.charAt(i));
            }
            else {
                maksymalnaDlugosc = Math.max(aktualnaDlugosc, maksymalnaDlugosc);
                aktualnaDlugosc = 1;

                // ustala najdluszy ciag stringbuildera
                if (aktualnyBuilder.length() > maksymalnyBuilder.length()) {
                    maksymalnyBuilder = aktualnyBuilder;
                }

                // czysci aktualny stringbuilder do nastepnego przejscia
                aktualnyBuilder = new StringBuilder("");
            }
        }

        // dlugosc ciagu jest krotsza o jeden numer i litere, wiec jest dodawana tutaj
        maksymalnyBuilder = maksymalnyBuilder.append(maksymalnyBuilder, 0, 1);
        maksymalnaDlugosc = Math.max(aktualnaDlugosc, maksymalnaDlugosc);

        System.out.println(maksymalnyBuilder + " " + maksymalnaDlugosc);
    }

    /////////////////////
    // ZADANIE 3
    /////////////////////
    // TODO: 19.05.2021 zadanie trzecie



    /////////////////////
    // MAIN
    /////////////////////

    public static void main(String[] args) throws IOException {
        List<String> dane = new ArrayList<>(Files.readAllLines(Path.of("przykladPary.txt")));
        List<String> liczbyParzyste = new ArrayList<>();
        List<String> slowa = new ArrayList<>();

        for (String string: dane
             ) {
            String[] s = string.split(" ");

            if (Integer.parseInt(s[0])%2 == 0 && Integer.parseInt(s[0]) > 4) {
                liczbyParzyste.add(s[0]);
            }
        }

        for (String string: dane
        ) {
            String[] s = string.split(" ");

            slowa.add(s[1]);
        }


        /////////////////////
        // ZADANIE 1 - WYNIK
        /////////////////////

        System.out.println("ZADANIE 1");
        for (int i = 0; i < liczbyParzyste.size() ; i++) {
            paraPierwszych(Integer.parseInt(liczbyParzyste.get(i)));
        }
        System.out.println();


        /////////////////////
        // ZADANIE 2 - WYNIK
        /////////////////////

        System.out.println("ZADANIE 2");
        for (int i = 0; i < slowa.size() ; i++) {
            najdluzszyFragment(slowa.get(i));
        }
    }
}