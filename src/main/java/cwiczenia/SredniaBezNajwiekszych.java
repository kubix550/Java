package cwiczenia;


// https://codingbat.com/prob/p136585
// Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
// except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest
// value, ignore just one copy, and likewise for the largest value.
// Use int division to produce the final average. You may assume that the array is length 3 or more.
public class SredniaBezNajwiekszych {
    public static int centeredAverage(int[] nums) {

        int najmnElement = najmniejszaWartosc(nums);
        int najwElement = najwiekszaWartosc(nums);
        int sumaDoSredniej = 0;
        boolean znalezionoMinimalny = false;
        boolean znalezionoMaksymalny = false;


        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == najmnElement && znalezionoMinimalny == false) {
                znalezionoMinimalny = true;

                // przerywa kolejne instrukcje w petli i przechodzi do nowego obrotu
                continue;
            }

            if (nums[i] == najwElement && znalezionoMaksymalny == false) {
                znalezionoMaksymalny = true;
                continue;
            }

            sumaDoSredniej = sumaDoSredniej + nums[i];
        }

        return sumaDoSredniej/(nums.length - 2);
    }

    public static int najwiekszaWartosc(int[] tablica) {
        int najwieksza = tablica[0];

        for (int i = 0; i < tablica.length ; i++) {
            if (tablica[i] > najwieksza) {
                najwieksza = tablica[i];
            }
        }

        return najwieksza;
    }

    public static int najmniejszaWartosc(int[] tablica) {
        int najmniejsza = tablica[0];

        for (int i = 0; i < tablica.length ; i++) {
            if (tablica[i] < najmniejsza) {
                najmniejsza = tablica[i];
            }
        }

        return najmniejsza;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 100};

        System.out.println(centeredAverage(array));
    }
}
