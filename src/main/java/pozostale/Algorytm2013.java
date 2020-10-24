package pozostale;

// matura 2013, analiza algorytmu

public class Algorytm2013 {
    public static void main(String[] args) {
        int n = 3;

        int s = 1;
        int p = 1;

        for (int k = 1; k <= n ; k++) {             // k bylo mniejsze rowne!
            s = s + p;

            for (int i = 1; i <= k ; i++) {
                p = p * k;
            }
        }

        System.out.println("s: " + s);
        System.out.println("p: " + p);
    }
}