package matura2021;

public class Lokal {
    int dlugosc;
    int szerokosc;

    public Lokal(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    @Override
    public String toString() {
        return "Lokal{" +
                "dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc +
                '}';
    }

    public boolean czyZerowy() {
        return (szerokosc + dlugosc == 0);
    }

    public int poleLokalu() {
        return (szerokosc * dlugosc);
    }
}