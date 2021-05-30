package maturaprobna2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Galerie {

    public static void wyswietlGlownaMape(Map<String, Map<String, List<Lokal>>> glownaMapaGalerii) throws IOException {

        for (Map.Entry<String, Map<String, List<Lokal>>> mainEntry : glownaMapaGalerii.entrySet()) {
            Map<String, List<Lokal>> value = mainEntry.getValue();
            System.out.println("Kraj " + mainEntry.getKey() + " ");

            for (Map.Entry<String, List<Lokal>> entry : value.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }



    /////////////////////////
    // ZADANIE 4.1
    /////////////////////////

    public static Map<String, Integer> liczbaMiast(Map<String, Map<String, List<Lokal>>> mapa) {
        Map<String, Integer> result = new TreeMap<>();

        for (Map.Entry<String, Map<String, List<Lokal>>> mainEntry : mapa.entrySet()
             ) {

            String panstwo = mainEntry.getKey();
            int liczbaMiast = mainEntry.getValue().size();

            result.put(panstwo, liczbaMiast);
        }

        return result;
    }



    /////////////////////////
    // ZADANIE 4.2 a
    /////////////////////////

    public static void powierzchniaGalerii(Map<String, Map<String, List<Lokal>>> mapa) {

        for (Map.Entry<String, Map<String, List<Lokal>>> mainEntry : mapa.entrySet()
             ) {

            for (Map.Entry<String, List<Lokal>> galeria: mainEntry.getValue().entrySet()
                 ) {
                String nazwaMiasta = galeria.getKey();
                int liczbaLokali = listaLokali(galeria.getValue());
                int sumaPowierzchni = sumaPowierzchni(galeria.getValue());

                System.out.println(nazwaMiasta + " " + sumaPowierzchni + " " + liczbaLokali);
            }
        }
    }

    public static int listaLokali(List<Lokal> lokale) {
        int result = 0;

        for (Lokal lokal: lokale
             ) {

            if (!lokal.czyZerowy()) {
                result++;
            }
        }

        return result;
    }

    public static int sumaPowierzchni(List<Lokal> lokale) {
        int result = 0;

        for (Lokal lokal: lokale
             ) {
            result = result + lokal.poleLokalu();
        }

        return result;
    }



    /////////////////////////
    // ZADANIE 4.2 b
    /////////////////////////

    public static void minMaxGalerie(Map<String, Map<String, List<Lokal>>> mapa) {
        int najmniejszaPowierzchniaGalerii = Integer.MAX_VALUE;
        String najmniejszeMiasto = "";

        int najwiekszaPowierzchniaGalerii = 0;
        String najwiekszeMiasto = "";

        for (Map.Entry<String, Map<String, List<Lokal>>> mainEntry : mapa.entrySet()
        ) {

            for (Map.Entry<String, List<Lokal>> galeria: mainEntry.getValue().entrySet()
            ) {
                String nazwaMiasta = galeria.getKey();
                int sumaPowierzchni = sumaPowierzchni(galeria.getValue());

                if (najmniejszaPowierzchniaGalerii > sumaPowierzchni) {
                    najmniejszaPowierzchniaGalerii = sumaPowierzchni;
                    najmniejszeMiasto = nazwaMiasta;
                }

                if (najwiekszaPowierzchniaGalerii < sumaPowierzchni) {
                    najwiekszaPowierzchniaGalerii = sumaPowierzchni;
                    najwiekszeMiasto = nazwaMiasta;
                }
            }
        }

        System.out.println("Najmniejsze: " + najmniejszeMiasto + " " + najmniejszaPowierzchniaGalerii);
        System.out.println("Najwieksze: " + najwiekszeMiasto + " " + najwiekszaPowierzchniaGalerii);
    }



    /////////////////////////
    // ZADANIE 4.3
    /////////////////////////

    public static int roznaLiczbaLokali(List<Lokal> lokale) {
        int result;

        Set<Integer> roznelokale = new TreeSet<>();

        for (Lokal lokal: lokale
             ) {
            // sprawdza czy pole nie jest zerem bo wtedy nie istnieje
            if (lokal.poleLokalu() != 0) {
                roznelokale.add(lokal.poleLokalu());
            }
        }

        result = roznelokale.size();

        return result;
    }

    public static void rozneRodzajeLokali(Map<String, Map<String, List<Lokal>>> mapa) {

        String galeriaNajwiekszaLiczbaRoznych = "";
        int najmniejszaIlosc = Integer.MAX_VALUE;

        String galeriaNajmniejszaLiczbaRoznych = "";
        int najwiekszaIlosc = 0;

        for (Map.Entry<String, Map<String, List<Lokal>>> mainEntry : mapa.entrySet()
        ) {

            for (Map.Entry<String, List<Lokal>> galeria: mainEntry.getValue().entrySet()
            ) {
                String nazwaMiasta = galeria.getKey();
                int roznaLiczbaLokali = roznaLiczbaLokali(galeria.getValue());

                // max
                if (roznaLiczbaLokali > najwiekszaIlosc) {
                    najwiekszaIlosc = roznaLiczbaLokali;
                    galeriaNajwiekszaLiczbaRoznych = nazwaMiasta;
                }

                // min
                if (roznaLiczbaLokali < najmniejszaIlosc) {
                    najmniejszaIlosc = roznaLiczbaLokali;
                    galeriaNajmniejszaLiczbaRoznych = nazwaMiasta;
                }
            }
        }

        System.out.println("Najwieksza liczba roznych galerii: " + najwiekszaIlosc + " w " + galeriaNajwiekszaLiczbaRoznych);
        System.out.println("Najmniejsza liczba roznych galerii: " + najmniejszaIlosc + " w " + galeriaNajmniejszaLiczbaRoznych);
    }



    /////////////////////////
    // MAIN
    /////////////////////////

    public static void main(String[] args) throws IOException {
        List<String> galeriaZPliku = Files.readAllLines(Paths.get("galerie_przyklad.txt"));

        // glowna struktura
        Map<String, Map<String, List<Lokal>>> glownaMapaGalerii = new HashMap<>();


        for (String element : galeriaZPliku
        ) {
            String[] s = element.split(" ");
            String panstwo = s[0];
            String miasto = s[1];

            List<Lokal> listaLokali = new ArrayList<>();

            for (int i = 2; i < s.length - 1; i = i + 2) {
                Lokal lokal = new Lokal(Integer.parseInt(s[i]), Integer.parseInt(s[i + 1]));
                listaLokali.add(lokal);
            }

            Map<String, List<Lokal>> mapaMiastaLokale = new HashMap<>();
            mapaMiastaLokale.put(miasto, listaLokali);

            // jak klucz juz istnieje to pobiera sie galerie w miastach ktore juz sa i dodaje nowe
            if (glownaMapaGalerii.containsKey(panstwo)) {
                Map<String, List<Lokal>> stringListMap = glownaMapaGalerii.get(panstwo);
                stringListMap.put(miasto, listaLokali);

                glownaMapaGalerii.put(panstwo, stringListMap);
            }

            // jak nie ma klucza, to dodaje panstwo, miasto i lokale
            else {
                glownaMapaGalerii.put(panstwo, mapaMiastaLokale);
            }
        }

        // wyswietlGlownaMape(glownaMapaGalerii);


        System.out.println("Zadanie 4.1");
        System.out.println(liczbaMiast(glownaMapaGalerii));
        System.out.println();

        System.out.println("Zadanie 4.2a");
        powierzchniaGalerii(glownaMapaGalerii);
        System.out.println();

        System.out.println("Zadanie 4.2b");
        minMaxGalerie(glownaMapaGalerii);
        System.out.println();

        System.out.println("Zadanie 4.3");
        rozneRodzajeLokali(glownaMapaGalerii);
    }
}