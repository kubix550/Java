package algorytmy;

// suma liczb 1-100
public class ZlozonoscAlgorytmu {
    public static void main(String[] args) {
        int sumaLiczb = 0;
        double sumaCiagu;

        // zlozonosc "n"
        for (int i = 1; i <= 100 ; i++) {
            sumaLiczb = sumaLiczb + i;
        }

        // zlozonosc "n^0", czyli 1 (stala liczba operacji dominujacych)
        // jak obok cyfry postawic "d", to liczba jest brana jako double
        sumaCiagu = ((1+100)/2d)*100;

        System.out.println(sumaLiczb);
        System.out.println(sumaCiagu);
    }
}