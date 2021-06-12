package cwiczenia;

// https://codingbat.com/prob/p110222
// We'll say that a value is "everywhere" in an array if for every pair of adjacent elements
// in the array, at least one of the pair is that value.
// Return true if the given value is everywhere in the array.
public class LiczbaJestWszedzie {

    // nie trzeba rozpatrywac ostatniej bo nie ma pary
    public static boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length - 1 ; i++) {
            if (!(nums[i] == val || nums[i+1] == val)) {
                return false;
            }
        }

        // domyslnie jest prawda
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3};
        int[] array2 = {1, 2, 1, 3, 4};

        System.out.println(isEverywhere(array, 1));
        System.out.println(isEverywhere(array2, 1));
    }
}
