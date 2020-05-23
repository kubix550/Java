package pozostale;

import java.util.*;

public class Zbiory {
    public static void main(String[] args) {
        // Set przechowuje elementy niepowtarzajace sie
        // Hashset przechowuje elementy nie po kolei
        // LinkedHashSet przechowuje elementy w kolejnosci wprowadzania
        // TreeSet przechowuje elementy w sposob posortowany

        Set<Integer> set = new TreeSet<>(Arrays.asList(1, 5, -2, 1));
        // tak sie dodaje manualnie do zbioru
//        set.add(1);
//        set.add(5);
//        set.add(-2);
//        set.add(1);

        System.out.println(set);
    }
}