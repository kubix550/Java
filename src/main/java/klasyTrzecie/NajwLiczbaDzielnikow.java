package klasyTrzecie;

// 7.Znajdz liczbę z przedziału 2 do 10000, która ma największą liczbę dzielników

public class NajwLiczbaDzielnikow {
    public static int ileDzielnikow (int a) {
        int licznik = 2;

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                licznik++;
            }
        }
        return licznik;
    }

    public static void main(String[] args) {
        int max = ileDzielnikow(2);     // max poczatkowa ilosc dzielnikow
        int liczba = 2;     // pierwsza liczba ktora ma max ilosc dzielnikow

        for (int i = 2; i < 10001 ; i++) {
            if (ileDzielnikow(i) > max) {
                max = ileDzielnikow(i);     // nowa maksymalna ilosc dzielnikow
                liczba = i;     // nowa max liczba ktora ma tyle dzielnikow
            }
        }

        System.out.println("Najwieksza liczbe dzielnikow: " + max + " ma liczba: " + liczba);
    }
}