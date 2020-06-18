package klasyTrzecie;

// 9.Napisz program, który doda 100 000 elementów "a" do Stringa i tyle samo do StringBuildera i sprawdzi czas działania obu operacji

public class StringWydajnosc {
    public static void main(String[] args) {
        String string = new String();
        StringBuilder stringBuilder = new StringBuilder();

        // poczatek pomiaru string
        long stringStart = System.currentTimeMillis();

        // dodawanie elementow do stringa
        for (int i = 0; i < 100000 ; i++) {
            string = string + "a";
        }

        // koniec pomiaru string
        long stringEnd = System.currentTimeMillis();



        // poczatek pomiaru stringBuilder
        long stringBuilderStart = System.currentTimeMillis();

        // dodawanie elementow do stringBuildera
        for (int i = 0; i < 100000 ; i++) {
            stringBuilder.append("a");
        }

        // koniec pomiaru stringBuilder
        long stringBuilderEnd = System.currentTimeMillis();


        // porownanie czasu dzialania
        System.out.println("Czas trwania string to: " + (stringEnd - stringStart) + " milisekund");
        System.out.println("Czas trwania stringBuilder to: " + (stringBuilderEnd - stringBuilderStart) + " milisekund");
    }
}
