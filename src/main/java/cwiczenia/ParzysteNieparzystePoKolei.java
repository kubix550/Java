package cwiczenia;


// https://codingbat.com/prob/p159979
// Given an array of ints, return true if the array contains either
// 3 even or 3 odd values all next to each other.
public class ParzysteNieparzystePoKolei {

    public static boolean czyParzysta(int numer) {
        return numer%2 == 0;
    }

    public static boolean modThree(int[] nums) {

        for (int i = 0; i <= nums.length - 3 ; i++) {

            // jak trzy po kolei sa parzyste zwraca true
            if (czyParzysta(nums[i]) && czyParzysta(nums[i+1]) && czyParzysta(nums[i+2])) {
                return true;
            }

            // jak trzy po kolei sa nieparzyste zwraca true
            if (!czyParzysta(nums[i]) && !czyParzysta(nums[i+1]) && !czyParzysta(nums[i+2])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 5};
        int[] array2 = {2, 1, 2, 5};

        System.out.println(modThree(array));

        System.out.println(modThree(array2));
    }
}
