package klasyTrzecie;

// 13.Napisz program, w którym będzie zadeklarowana lista elementów typu String, następnie napisz metodę, która
// będzie zliczać liczbę wystąpień poszczególnych elementów.

import java.util.*;

public class StringLiczbaPowtorzenObiektowo {

    private List<String> lista;

    public StringLiczbaPowtorzenObiektowo(List<String> lista) {
        this.lista = lista;
    }

    public Map<String,Integer> mapa() {
        Map<String,Integer> result = new HashMap<>();

        for (String element: lista) {
            if (result.containsKey(element)) {
                result.replace(element, result.get(element) + 1);
            }
            else result.put(element, 1);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("maslo");
        lista.add("mleko");
        lista.add("herbata");
        lista.add("maslo");
        lista.add("chleb");
        lista.add("herbata");
        lista.add("herbata");

        // bez obiektow
//        StringLiczbaPowtorzen.lista = lista;

        StringLiczbaPowtorzenObiektowo stringLiczbaPowtorzen = new StringLiczbaPowtorzenObiektowo(lista);

        Map<String, Integer> mapa = stringLiczbaPowtorzen.mapa();   // malymi literami to obiekt

        for (Map.Entry<String, Integer> para: mapa.entrySet()){
            System.out.println(para.getKey());
            System.out.println(para.getValue());
        }
    }
}