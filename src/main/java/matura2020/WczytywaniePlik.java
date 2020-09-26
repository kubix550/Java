package matura2020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WczytywaniePlik {
    public static void main(String[] args) throws IOException {

        // zwraca liste stringow
        List<String> lista = Files.readAllLines(Paths.get("C:\\Users\\Kuba\\IdeaProjects\\projekt\\src\\main\\java\\matura2020\\liczby.txt"));

        // wyrazenie lambda do wyswietlania, nie trzeba deklarowac a
        lista.forEach(a-> System.out.println(a));

        // latwiejszy sposob na wyswietlanie
        for (String a: lista
             ) {
            System.out.println(a);
        }
    }
}