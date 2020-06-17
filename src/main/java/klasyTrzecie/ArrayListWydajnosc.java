package klasyTrzecie;

// 10.Napisz program, który doda 100 000 elementów do ArrayList i sprawdzi wydajność wyświetlania jej elementów
// przy użyciu różnych pętli    for (int i=0,...), foreach, Iterator

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWydajnosc {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            lista.add("element");
        }

        // poczatek pomiaru fori
        long foriStart = System.currentTimeMillis();

        // wyswietlanie ArrayListy poprzez fori
        for (int i = 0; i < lista.size() ; i++) {
            System.out.println(lista.get(i));
        }

        // koniec pomiaru fori
        long foriEnd = System.currentTimeMillis();;




        // poczatek pomiaru foreach
        long foreachStart = System.currentTimeMillis();

        // wyswietlanie ArrayListy poprzez foreach
        for (String foreach: lista) {
            System.out.println(foreach);
        }

        // koniec pomiaru foreach
        long foreachEnd = System.currentTimeMillis();



        // poczatek pomiaru iterator
        long iteratorStart = System.currentTimeMillis();

        // wyswietlanie ArrayListy poprzez iterator
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // koniec pomiaru iterator
        long iteratorEnd = System.currentTimeMillis();



        // wyswietlanie czasu dzialania operacji
        System.out.println();
        System.out.println("Czas trwania fori to: " + (foriEnd - foriStart) + " milisekund");
        System.out.println("Czas trwania foreach to: " + (foreachEnd - foreachStart) + " milisekund");
        System.out.println("Czas trwania iterator to: " + (iteratorEnd - iteratorStart) + " milisekund");
    }
}