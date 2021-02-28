package algorytmy;

public class ZamianaSystemowLiczb {
    public static String zamienNaOsemkowa (int liczba) {
        StringBuilder builder = new StringBuilder();

        while (liczba > 0) {
            int reszta = liczba%8;
            liczba = liczba/8;

            builder.append(reszta);
        }

        return builder.reverse().toString();
    }

    public static String zamienNaSzesnastkowa (int liczba) {
        StringBuilder builder = new StringBuilder();

        while (liczba > 0) {
            int reszta = liczba%16;
            liczba = liczba/16;

            switch (reszta) {
                case 10: {
                    builder.append("A");
                    break;
                }
                case 11: {
                    builder.append("B");
                    break;
                }
                case 12: {
                    builder.append("C");
                    break;
                }
                case 13: {
                    builder.append("D");
                    break;
                }
                case 14: {
                    builder.append("E");
                    break;
                }
                case 15: {
                    builder.append("F");
                    break;
                }
                default: {
                    builder.append(reszta);
                }
            }
        }

        return builder.reverse().toString();
    }

    public static int czworkowaNaDzisietna(String czworkowa) {
        int dzisietna = 0;

        for (int i = 0; i < czworkowa.length(); i++) {
            int cyfra = Integer.parseInt(czworkowa.charAt(i) + "");
            dzisietna = dzisietna + (int)(cyfra*Math.pow(4, czworkowa.length() - 1 - i));
        }

        return dzisietna;
    }

    public static void main(String[] args) {

        System.out.println(zamienNaOsemkowa(555));
        System.out.println(zamienNaSzesnastkowa(555));
        System.out.println(czworkowaNaDzisietna("2120"));
    }
}