package pozostale;

public class Regex {

    // sprawdza czy w ktorymkolwiek miejscu stringa sa litery
    public static void checkForLetters(String wyraz) {
        if (wyraz.matches(".*[A-Za-z].*")){
            System.out.println("check");
        }
    }

    public static void main(String[] args) {
        String string1 = "25a74";
        String string2 = "25774";

        System.out.println("String 1:");
        checkForLetters(string1);

        System.out.println("String 2:");
        checkForLetters(string2);
    }
}