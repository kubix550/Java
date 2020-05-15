package pozostale;

import java.util.Random;

public class LosowaSiodemki {
    //6 liczb 5-7
    public static void main(String[] args) {
        Random rand = new Random();
        int counter = 0;

        for (int i = 0; i < 6; i++) {
            int a = rand.nextInt(3) + 5;
            System.out.println(a);

            if (a == 7) counter = counter + 1;
        }
        System.out.println("jest " + counter + " siodemek");
    }
}

/*
losowa.nextInt(10)	od 0-9
losowa.nextInt(3)	od 0-2
losowa.nextInt(3)+5	od 5-7
 */