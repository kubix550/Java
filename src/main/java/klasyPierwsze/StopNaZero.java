package klasyPierwsze;
// 9. Napisać program, który będzie wczytywał od użytkownika liczby całkowite. Jeśli zostanie wprowadzona liczba zero,
// program ma wyświetlić sumę wprowadzonych liczb i się zakończyć.

import java.util.Scanner;

public class StopNaZero {
    public static void main(String[] args) {
        int numer;                                          //odpowiada za wpisane liczby
        int suma = 0;                                       //suma musi byc okreslona
        Scanner input = new Scanner(System.in);

        System.out.println("Aby zsumowac liczby wpisz 0");

        do {
            System.out.println("Wpisz liczbe");
            numer = input.nextInt();
            suma = suma+numer;                              // nowa wartosc sumy to suma+numer !
        }

        while (numer!=0);                                    //kazda liczba inna niz zero nie spowoduje konca programu
        System.out.println("Suma liczb to " + suma);        //po wpisaniu 0 podaje sume
    }
}