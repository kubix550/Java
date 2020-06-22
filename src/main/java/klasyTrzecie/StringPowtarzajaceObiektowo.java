package klasyTrzecie;

// 12.Napisz program, w którym będzie zadeklarowana lista elementów typu String, następnie napisz metodę która
// będzie sprawdzać czy występują w niej powtarzające się elementy.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPowtarzajaceObiektowo {

    private List<String> elementy;

    public StringPowtarzajaceObiektowo(List<String> elementy) {                          // constructor
        this.elementy = elementy;
    }

    public boolean czySiePowtarza() {
        Set<String> set = new HashSet<>(elementy);
        return (set.size() != elementy.size());                                          // to boolean wiec zwraca true albo false i jest szybciej
    }


    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Kuba");
        lista.add("Bartek");
        lista.add("Ania");
        lista.add("Kuba");
        lista.add("Michal");
        lista.add("Ania");


        // wiec jezeli bedzie zawieral inna ilosc elementow niz lista, to znaczy ze cos sie w niej powtarza
        // metoda niestatyczna, konstruktor istnieje domyslny - tworzymy obiekt
        StringPowtarzajaceObiektowo powtarzajace = new StringPowtarzajaceObiektowo(lista);

        System.out.println(powtarzajace.czySiePowtarza());
    }
}