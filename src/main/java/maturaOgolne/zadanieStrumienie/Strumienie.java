package maturaOgolne.zadanieStrumienie;

//        1.	Utworzyc klase Person (name, surname, age, pesel)
//        2.	Utworzyc arrayliste 10 obiektéw klasy Person.
//        3.	Uzywajac strumieni:
//        a)	Wyswietlic najmlodsza i najstarsza osobe
//        b)	Obliczyc sredni wiek wszystkich osob
//        c)	Obliczyc sredni wiek osob o imieniu Katarzyna
//        Obliczyc ile osob urodzilo sie w maju (na podstawie pesel)


import maturaOgolne.zadanieStrumienie.Person;

import java.util.*;

public class Strumienie {

    public static void main(String[] args) {

        List<Person> osoby = Arrays.asList(
        new Person("Alexander", "Boone", 19, "01240848676"),
        new Person("Chester", "Monroe", 25, "76021949499"),
        new Person("Corey", "Roberts", 36, "53041811559"),
        new Person("Riley", "Richardson", 15, "84071926155"),
        new Person("Neville", "Campbell", 42, "89042173251"),
        new Person("Katarzyna", "Mccarthy", 21, "90050877482"),
        new Person("Katarzyna", "Ross", 68, "90051453384"),
        new Person("Katarzyna", "Brown", 45, "56072741981"),
        new Person("Kim", "Owen", 31, "87062913387"),
        new Person("Walter", "White", 50, "97091017817")
                );



        // A) NAJMLODSZA I NAJSTARSZA OSOBA
        Optional<Person> minAge = osoby.stream()                     // optional moze opakowac kazda klase, dba o to zeby nie wystapil null
                .min(Comparator.comparingInt(a -> a.getAge()));      // zwraca najmlodsza osobe, nie tracimy reszty danych wiec wiadomo kto to

        Optional<Person> maxAge = osoby.stream()
                .max(Comparator.comparingInt(a -> a.getAge()));

        // wyswietla najmlodsza i najstarsza osobe
        if (minAge.isPresent()) {                               // sprawdza czy minAge nie jest null
            System.out.println("Najmlodsza osoba");
            System.out.println(minAge.get());                   // minAge.get pobiera element z Optional
        }

        System.out.println();

        if (maxAge.isPresent()) {
            System.out.println("Najstarsza osoba");
            System.out.println(maxAge.get());
        }

        System.out.println();


        // B) SREDNI WIEK WSZYSTKICH OSOB

        OptionalDouble avgAge = osoby.stream()
                .mapToInt(person -> person.getAge())
                .average();

        if (avgAge.isPresent()) {
            System.out.println("Sredni wiek osob to:");
            System.out.println(avgAge.getAsDouble());
        }

        // ALBO
        // od razu jest tutaj get, jezeli nie ma wartosci to wstawia domyslnie poprzez orElse
        System.out.println("Sredni wiek z uzyciem orElse");
        System.out.println(avgAge.orElse(0.0));


        System.out.println();


        // C) SREDNI WIEK OSOB O IMIENIU KATARZYNA
        OptionalDouble avgAgeKatarzyna = osoby.stream()
                .filter(a -> a.getName().equals("Katarzyna"))       // to filtruje osoby o imieniu Katarzyna
                .mapToInt(a -> a.getAge())                          // to mapuje wiek osob
                .average();                                         // tu mamy sredni wiek

        System.out.println("Sredni wiek osob o imieniu Katarzyna to");
        System.out.println(avgAgeKatarzyna.orElse(0.0));


        System.out.println();


        // ILE OSOB URODZONYCH W MAJU NA PODSTAWIE PESEL (3 i 4 element to 05)
        long liczbaOsobMaj = osoby.stream()
                .filter(a -> a.getPesel().charAt(2) == '0' && a.getPesel().charAt(3) == '5')        // zwraca osoby ktore w peselu na trzecim i czwartym elemencie maja 05 - maj
                .count();                                                                           // liczy ilosc elementow

        System.out.println("Ilosc osob urodzonych w maju");
        System.out.println(liczbaOsobMaj);
    }
}