package matura2020;

public class PojedynczaPara implements Comparable<PojedynczaPara> {
    int liczba;
    String wyraz;


    public PojedynczaPara(int liczba, String wyraz) {
        this.liczba = liczba;
        this.wyraz = wyraz;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public String getWyraz() {
        return wyraz;
    }

    public void setWyraz(String wyraz) {
        this.wyraz = wyraz;
    }

    @Override
    public String toString() {
        return "PojedynczaPara{" +
                "liczba=" + liczba +
                ", wyraz='" + wyraz + '\'' +
                '}';
    }

    @Override
    public int compareTo(PojedynczaPara o) {
        if (this.liczba < o.liczba) {
            return (this.liczba - o.liczba);
        }
        else if (this.liczba == o.liczba) {
            return (this.wyraz.compareTo(o.wyraz));
        }
        else return (o.liczba - this.liczba);
    }
}