package matura2021;

import org.decimal4j.util.DoubleRounder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Wodociagi {

    /////////////////////
    // ZADANIE 1
    /////////////////////
    public static Map<String, Double> mapaKlienciZuzycie(Map<String, List<String>> dane) {
        Map<String, Double> klienci = new TreeMap<>();

        for (Map.Entry<String, List<String>> item : dane.entrySet()
             ) {

            if (!item.getKey().equals("KodKlienta")) {

                double srednieZuzycie = 0;
                int ileOsob = Integer.parseInt(item.getKey().substring(6, 7));

                for (int i = 0; i < 12 ; i++) {
                    srednieZuzycie = srednieZuzycie + Integer.parseInt(item.getValue().get(i));
                }

                srednieZuzycie = srednieZuzycie/ileOsob;

                klienci.put(item.getKey(), DoubleRounder.round(srednieZuzycie, 2));
            }
        }

        return klienci;
    }


    // TODO: 05.06.2021 zwrocic 10 klientow o najwiekszych zuzyciach
    public static void max10Klientow(Map<String, Double> klienci) {
        Map<Double, String> mapaDouble = new TreeMap<>();

        for (Map.Entry<String, Double> item : klienci.entrySet()
        ) {

        }
    }


    public static void main(String[] args) throws IOException {
        List<String> danePoczatkowe = new ArrayList<>(Files.readAllLines(Path.of("wodociagiDane.txt")));
        Map<String, List<String>> mapaDane = new HashMap<>();

        for (String item: danePoczatkowe
             ) {
            String[] split = item.split(";");
            List<String> list = new LinkedList<>();

            for (int i = 1; i <= 12 ; i++) {
                list.add(split[i]);
            }

            mapaDane.put(split[0], list);
        }

        /////////////////////
        // ZADANIE 1 - WYNIK
        /////////////////////
        max10Klientow(mapaKlienciZuzycie(mapaDane));
//        System.out.println(mapaKlienciZuzycie(mapaDane));
    }
}