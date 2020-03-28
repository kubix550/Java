import java.io.File;
import java.util.Scanner;

public class WejscieKlawiatura {
    public static void main(String[] args) {
        //File plik=new File("sciezka pliku");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        System.out.println("witaj " + imie);
    }
}
