package algorytmy;

public class SzyfrCezara {

    public static void szyfr(String wyraz, int przesuniecie) {
        System.out.println("Przed szyfrowaniem: " + wyraz);

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < wyraz.length(); i++) {
            int roznica;
            // kod ascii danej litery wyrazu (wyraz.charAt to domyslnie int)
            int kodLitery = wyraz.charAt(i);


            // jezeli przesuniecie bedzie wieksze od 122 (litera z), to wyjdzie poza zakres liter
            if (kodLitery + (przesuniecie%26) > 122) {
                roznica = 122 - kodLitery;

                // wiec do 97 (kod litery a) dodajemy odpowiednie przesuniecie
                builder.append((char)(97 + ((przesuniecie%26 - 1) - roznica)));
            }

            else {
                kodLitery = kodLitery + (przesuniecie%26);
                builder.append((char) kodLitery);
            }
        }

        System.out.println("Po szyfrowaniu: " + builder);
    }


    public static void main(String[] args) {
        String wyraz = "xyzab";
        szyfr(wyraz, 505);
    }
}