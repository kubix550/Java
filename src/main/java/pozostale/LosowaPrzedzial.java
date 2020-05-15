package pozostale;

import java.util.Random;

public class LosowaPrzedzial {
    //losowa przedzial 1-100

    public static void main(String[] args) {
        Random losowa = new Random();
        for (int i = 0; i < 10 ; i++) {
            int a = losowa.nextInt(3);
            if(a==2) System.out.println(a);
        }
    }
}