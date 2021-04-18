package cwiczenia;

public class Zawodnik {
    int ID;
    String imie;
    String nazwisko;
    String data;

    public Zawodnik(int ID, String imie, String nazwisko, String data) {
        this.ID = ID;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Zawodnicy{" +
                "ID=" + ID +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}