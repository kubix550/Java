package klasyTrzecie;

// 12.Napisz program, w którym będzie zadeklarowana lista elementów typu String, następnie napisz metodę która
// będzie sprawdzać czy występują w niej powtarzające się elementy.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPowtarzajace {

    // metoda
    public static boolean czySiePowtarza(Set<String> a, List<String> b) {
        return (a.size() != b.size());                                          // to boolean wiec zwraca true albo false i jest szybciej
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Kuba");
        lista.add("Bartek");
        lista.add("Ania");
        lista.add("Kuba");
        lista.add("Michal");
        lista.add("Ania");

        // set przechowuje elementy nie powtarzajace sie
        Set<String> set = new HashSet<>(lista);

        // wiec jezeli bedzie zawieral inna ilosc elementow niz lista, to znaczy ze cos sie w niej powtarza
        if (czySiePowtarza(set, lista)) {
            System.out.println("Wystepuja powtarzajace sie elementy");
        }
        else System.out.println("Nie wystepuja powtarzajace sie elementy");
    }
}