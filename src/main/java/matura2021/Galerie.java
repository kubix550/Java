package matura2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galerie {

    // na podstawie tego robi sie reszte przykladow
    public static void wyswietlGlownaMape(Map<String, Map<String, List<Lokal>>> glownaMapaGalerii) throws IOException {

        for (Map.Entry<String, Map<String, List<Lokal>>> mainEntry : glownaMapaGalerii.entrySet()) {
            Map<String, List<Lokal>> value = mainEntry.getValue();
            System.out.println("Kraj " + mainEntry.getKey() + " ");

            for (Map.Entry<String, List<Lokal>> entry : value.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }


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

        wyswietlGlownaMape(glownaMapaGalerii);
        // todo zadania

    }
}