import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alien {

    private String name;                     //private jest tylko dostep dla tego co jest w konkretnej klasie
    private String weapon;                   //poprzez setter i getter dostep, nie mozna bezposrednio
    private int hp;                          //public means you can access it anywhere while private means you can only access it inside its own class
    private int power;

    public Alien(String name, String weapon, int hp, int power) {           //ustalenie charakterystyki obiektu Alien
        this.name = name;
        this.weapon = weapon;
        setHp(hp);                                                          //sprawdza
        setPower(power);
    }

    @Override
    public String toString() {                                      //constructor
        return "Alien{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                '}';
    }

    public String getName() {                                       //setter i getter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp>0) this.hp = hp;                    //nie pozwoli wpisac hp mniejszego od 0, a jak sie wpisze to zastapi wartoscia domyslna
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power>0) this.power = power;
    }

    //main

    public static void main(String[] args) {
        Alien alien = new Alien("Bob","gun",100,50);            //konkretny Alien o ustalonych parametrach

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj imie");                     //proces ustalania parametrow aliena 2
        String imie=input.nextLine();

        System.out.println("Podaj bron");
        String bron=input.nextLine();

        System.out.println("Podaj hp");
        int hp=Integer.parseInt(input.nextLine());            //input nextLine aby obslugiwalo tekst i liczby, Integrer.parseInt zmienia to w int

        System.out.println("Podaj power");
        int power=Integer.parseInt(input.nextLine());

        Alien alien2 = new Alien(imie, bron, hp, power);    //konkretny Alien2 o ustalonych parametrach poprzez Scanner: imie, bron, hp, power są przez nas wpisywane
        System.out.println(alien2);


        //  ZACZYNA SIE TABLICA

        Alien[] armia = new Alien[2];                   //tablica Alienow o nazwie armia ma dwie wartosci
        armia[0]=alien;                                 //podstawiamy za elementy tablicy konkretnych alienow
        armia[1]=alien2;

        for (int i = 0; i < armia.length ; i++) {       //length bo jest wygodniej. okresla ilosc alienow w armii
            armia[i].setWeapon("Heavy plasma");         // "i" bierze kazdego aliena z kolei, podstawia mu bron na heavy plasma
        }

        for (int i = 0; i < armia.length ; i++) {
            System.out.println(armia[i]);               //wyswietla kazdego z osobna (bo i)
        }


        // ZACZYNA SIE LISTA, lepsza od tablicy

        List<Alien> lista = new ArrayList<>();         //polimorfizm, wielopostaciowosc, jakby byl list albo arraylist
        lista.add(alien);                              //eleganckie dodanie do listy alienow, nie przejmujemy sie dlugoscia
        lista.add(alien2);

        for (Alien element:lista                       //element to nazwa ogolna dla alienow w tej liscie
             ) {
            element.setWeapon("Crossbow");             //dla kazdego ustawia bron jako crossbow (bo element)
            System.out.println(element);
        }
    }
}

//to wszystko idzie po kolei wiec wynik koncowy nie wyglada za ładnie
// zadanie z lista ksiazek
//odc java 021
// odc n01 nauk javy