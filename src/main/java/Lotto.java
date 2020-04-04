// 20.Napisz program TOTOLOTEK, który losuje 6 liczb z przedziału <1,49> Liczby nie mogą sie powtarzać.

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Random losowo = new Random();
        Set zbior = new TreeSet();                      //nie beda sie powtarzac bo set, sa posortowane bo jest treeset !

        while (zbior.size() != 6) {                     // poki zbior nie jest rowny 6 to wpisuj liczby
            int a = losowo.nextInt(49)+1;       // losuje od 1-49 bo normalnie by bylo 0-48 a jak sie doda 1 to bedzie 1-49
            zbior.add(a);
            System.out.println(a);
        }
        System.out.println(zbior);
    }
}