package cwiczenia;


// https://codingbat.com/prob/p199612
// Given an array of ints, return true if the sum of all the 2's in the array is exactly 8
public class SumaDwojekArray {
    public static boolean sum28(int[] nums) {
        int sumaDwojek = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 2) {
                sumaDwojek = sumaDwojek + 2;
            }
        }

        if (sumaDwojek == 8) {
            return true;
        }

        else return false;
    }


    public static void main(String[] args) {
        int[] tablica = {2, 3, 2, 2, 4, 2};

        System.out.println(sum28(tablica));
    }
}
