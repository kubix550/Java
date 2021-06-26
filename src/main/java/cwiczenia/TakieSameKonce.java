package cwiczenia;

import java.util.LinkedList;
import java.util.List;


// https://codingbat.com/prob/p134300
// Return true if the group of N numbers at the start and end of the array are the same

public class TakieSameKonce {
    public static boolean sameEnds(int[] nums, int len) {
        List<Integer> listaPoczatek = new LinkedList<>();
        List<Integer> listaKoniec = new LinkedList<>();

        for (int i = 0; i < len ; i++) {
            listaPoczatek.add(nums[i]);
        }

        for (int i = nums.length-len; i < nums.length ; i++) {
            listaKoniec.add(nums[i]);
        }

        return listaPoczatek.equals(listaKoniec);
    }



    public static void main(String[] args) {
        int[] tablica = {5, 6, 45, 99, 13, 5, 6};

        System.out.println(sameEnds(tablica, 2));
    }
}
