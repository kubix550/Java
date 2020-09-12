package algorytmy;

import java.util.Scanner;

public class WydawanieReszty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz reszte");
        int reszta = input.nextInt();
        System.out.println();

        int[] nominal = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] iloscNominalow = {2, 0, 1, 0, 5, 7, 0, 8};   // 2 dwusetki, 0 setek itd

        int miejsceTablica = 0;
        int calkowitaLiczba = 0;

        do {
            calkowitaLiczba = reszta/nominal[miejsceTablica];                                                   // dzieli wprowadzona liczbe na dany nominal z tablicy, output to calkowita ilosc jakiegos nominalu

            if (iloscNominalow[miejsceTablica] >= calkowitaLiczba) {                                            // jezeli ilosc nominalow jest wieksza albo rowna calkowitej liczbie potrzebnej do wydania, to mozna wydac,  w innym przypadku wraca do poczatku

                reszta = reszta - calkowitaLiczba*nominal[miejsceTablica];                                      // nowa reszta to stara liczba minus ilosc calkowitych nominalow z wczesniej

                System.out.println("Nominal: " + nominal[miejsceTablica] + " wydano: " + calkowitaLiczba);
            }

            miejsceTablica++;                                                                                   // ustawia kolejny nominal z tablicy do wyprobowania
        }
        while (reszta != 0 && miejsceTablica != nominal.length);                                                // jak nie ma reszty to pieniadze zostaly wydane

        if (reszta > 0) {
            System.out.println("Nie mozna wydac dalej");
        }
    }
}