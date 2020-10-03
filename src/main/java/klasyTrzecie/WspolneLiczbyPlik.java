package klasyTrzecie;

// 14.Napisz program, który wczytuje liczby z pliku.
// Znajduje części wspólne i liczby które znajdują się w pierwszym pliku , a w drugim ich nie ma.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WspolneLiczbyPlik {
    public static void main(String[] args) throws IOException {
        List<String> pierwszyPlik = Files.readAllLines(Paths.get("C:\\Users\\Kuba\\IdeaProjects\\projekt\\src\\main\\java\\klasyTrzecie\\pierwszyPlikLiczby.txt"));
        List<String> drugiPlik = Files.readAllLines(Paths.get("C:\\Users\\Kuba\\IdeaProjects\\projekt\\src\\main\\java\\klasyTrzecie\\drugiPlikLiczby.txt"));

        // funkcje strumieni - mapowanie i filtrowanie
        // operacje posrednie: map i filter
        // operacje terminalne - koncza strumien

        Set<Integer> pierwszyPlikSet = pierwszyPlik.stream()
                .map(a -> Integer.valueOf(a))                   // map zamienia w tym przypadku stringa na inny typ, przyjmuje pewna funkcje - wyrazenie lambda
                // .map(Integer::valueOf)                       // to co u gory, tylko jeszcze szybciej - method reference

                // .filter(a -> a>10)                              // mozna filtrowac elementy (wyrazenie lambda zamiast predykatu)
                // .filter(a -> a%3 == 0)                          // filtruje elementy podzielne przez 3

                .collect(Collectors.toSet()                     // zbieramy elementy do Seta
                );

        Set<Integer> drugiPlikSet = drugiPlik.stream()
            .map(a -> Integer.valueOf(a))
            .collect(Collectors.toSet()
            );

        // wyswietla poczatkowe zawartosci obu plikow
        System.out.println("Pierwszy plik:");
        System.out.println(pierwszyPlikSet);

        System.out.println("Drugi plik:");
        System.out.println(drugiPlikSet);


        // od razu bierzemy pierwszyPlikSet do wspolne liczby, zeby potem moc uzyc go z retainAll
        // wspolneLiczby zawiera elementy wspolne z obu Setow
        Set<Integer> wspolneLiczby = new LinkedHashSet<>(pierwszyPlikSet);
        wspolneLiczby.retainAll(drugiPlikSet);

        // rozneLiczby zawiera elementy z pierwszyPlikSet, z usunietymi liczbami z drugiPlikSet
        Set<Integer> rozneLiczby = new LinkedHashSet<>(pierwszyPlikSet);
        rozneLiczby.removeAll(drugiPlikSet);


        // wyswietla liczby z polecenia
        System.out.println("Wspolne liczby z obu plikow:");
        System.out.println(wspolneLiczby);

        System.out.println("Liczby ktorych nie ma w drugim pliku:");
        System.out.println(rozneLiczby);
    }
}
