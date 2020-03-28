package klasyPierwsze;
// 7. Napisać program, który wyświetli liczby podzielne przez 3 z przedziału od 1 do 100.

public class PodzielnePrzezTrzy {
    public static void main(String[] args) {
        for (int i = 3; i <=100  ; i=i+3) {
            System.out.println(i);
        }

        //albo

        for (int i = 3; i <=100  ; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }
}
