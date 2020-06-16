package klasyTrzecie;

// 16.Napisz program, kóry pokaże różnicę w sposobie zapisu elementów do HashMapy, LinkedHashMapy i TreeMapy.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapyRoznice {
    public static void main(String[] args) {

        // ustalenie HashMapy
        Map<Integer, Integer> hashMapa = new HashMap<>();
        hashMapa.put(1, 100);
        hashMapa.put(2, 1);
        hashMapa.put(3, -10);
        hashMapa.put(4, 10);
        hashMapa.put(5, 100);
        hashMapa.put(6, 1);
        hashMapa.put(7, -10);
        hashMapa.put(8, 10);
        hashMapa.put(9, 5);

        //ustalenie LinkedHashMapy
        Map<Integer, Integer> linkedHashMapa = new LinkedHashMap<>();
        linkedHashMapa.put(1, 100);
        linkedHashMapa.put(2, 1);
        linkedHashMapa.put(3, -10);
        linkedHashMapa.put(4, 10);
        linkedHashMapa.put(5, 100);
        linkedHashMapa.put(6, 1);
        linkedHashMapa.put(7, -10);
        linkedHashMapa.put(8, 10);
        linkedHashMapa.put(9, 5);

        //ustalenie TreeMapy
        Map<Integer, Integer> treeMapa = new TreeMap<>();
        treeMapa.put(1, 100);
        treeMapa.put(-5, 1);
        treeMapa.put(5, -10);
        treeMapa.put(-10, 10);


        System.out.println("HashMapa: " + hashMapa);
        System.out.println("elementy w kolejnosci wprowadzenia, ale nie ma pewnosci");
        System.out.println();
        System.out.println("LinkedHashMapa: " + linkedHashMapa);
        System.out.println("elementy w kolejnosci wprowadzenia");
        System.out.println();
        System.out.println("TreeMapa: " + treeMapa);
        System.out.println("sortuje po kluczach w kolejnosci rosnacej");
    }
}