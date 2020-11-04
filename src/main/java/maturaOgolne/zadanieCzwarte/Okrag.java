package maturaOgolne.zadanieCzwarte;

public class Okrag implements Comparable<Okrag>{
    private int x;
    private int y;
    private int r;


    public Okrag(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Okrag{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }


    // ma zwrocic trzy wartosci - jezeli okrag this jest mniejszy od okregu o, to liczbe ujemna
    // jezeli this wiekse od okregu o to liczbe dodatnia
    @Override
    public int compareTo(Okrag o) {

        // jak sie roznia, to nie sprawdza Y, tylko zwraca tak jak u dolu
        if (this.getX() != o.getX()) {
            return this.getX() - o.getX();
        }

        // tu X musza byc rowne
        // jezeli this jest wieksze od o, to zwroci liczbe dodatnia
        // jezeli this jest mniejsze od o, to liczbe ujemna
        // jezeli takie same, to zwroci 0
        return (this.getY() - o.getY());
    }
}