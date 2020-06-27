package matura2020;

// 1. Podaj, ile liczb nieparzystych zapisano w pliku liczby.txt
// 2. Spośród liczb występujących w pliku liczby.txt podaj te, których suma cyfr jest równa 11
// 3. Spośród liczb zapisanych w pliku liczby.txt podaj wszystkie te, które są liczbami pierwszymi z przedziału 〈4000, 5000〉

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class zadanieCzwarte {

    public static int ileNieparzystych(List<String> lista) {
        int licznikNieparzystych = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (Integer.parseInt(lista.get(i)) % 2 != 0) {
                licznikNieparzystych++;
            }
        }
        return licznikNieparzystych;
    }

    public static List<String> sumaJedenascie(List<String> lista) {
        int licznikSumaCyfr = 0;
        List<String> listaSumaJedenascie = new ArrayList<>();

        // leci po kazdym elemencie listy
        for (int i = 0; i < lista.size() ; i++) {

            // zerujemy licznik
            licznikSumaCyfr = 0;

            // leci po kazdej literze z wyrazu i dodaje po kolei wszystkie
            for (int j = 0; j < lista.get(i).length() ; j++) {
                licznikSumaCyfr = licznikSumaCyfr + Integer.parseInt(String.valueOf(lista.get(i).charAt(j)));
            }

            // jezeli element z listy ma sume 11 to dodaje go do nowej listy
            if (licznikSumaCyfr == 11) {
                listaSumaJedenascie.add(lista.get(i));
            }
        }
        return listaSumaJedenascie;
    }

    // metoda tylko sprawdza czy liczba jest pierwsza
    public static boolean czyLiczbaPierwsza(int liczba) {
        boolean result = true;

        for (int i = 2; i < liczba - 1 ; i++) {
            if (liczba%i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    // metoda tylko sprawdza czy jest w jakims przedziale
    public static boolean przedzialCzyLiczbaPierwsza(int poczatek, int koniec, int liczba) {
        return (poczatek <= liczba && koniec >= liczba) && (czyLiczbaPierwsza(liczba));

        // ? jest podobne do excelowego "jezeli"
//        return (poczatek <= liczba && koniec >= liczba) && (czyLiczbaPierwsza(liczba))?true:false;
    }

    // metoda zwraca liste liczb pierwszych z przedzialu
    public static List<String> liczbyPierwszePrzedzial(List<String> lista) {
        List<String> liczbyPierwsze = new ArrayList<>();

        for (String element: lista
             ) {
            if (przedzialCzyLiczbaPierwsza(4000, 5000, Integer.parseInt(element))) {
                liczbyPierwsze.add(element);
            }
        }

        return liczbyPierwsze;
    }

    public static void main(String[] args) throws Exception {
        // zwraca od razu liste stringow
        List<String> lista = Files.readAllLines(Paths.get("C:\\Users\\Kuba\\IdeaProjects\\projekt\\src\\main\\java\\matura2020\\liczby.txt"));

        System.out.println("Liczb nieparzystych jest: " + ileNieparzystych(lista));
        System.out.println();

        System.out.println("Lista, gdzie suma cyfr liczb jest rowna 11 to:");
        System.out.println(sumaJedenascie(lista));
        System.out.println();

        System.out.println("Lista, w ktorej sa liczby sa pierwsze z przedzialu 4000-5000 to:");
        System.out.println(liczbyPierwszePrzedzial(lista));
    }
}