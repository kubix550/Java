package maturaOgolne.zadanieCzwarte;

public class Trojkat {
    private Punkt a;
    private Punkt b;
    private Punkt c;

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Punkt getA() {
        return a;
    }

    public void setA(Punkt a) {
        this.a = a;
    }

    public Punkt getB() {
        return b;
    }

    public void setB(Punkt b) {
        this.b = b;
    }

    public Punkt getC() {
        return c;
    }

    public void setC(Punkt c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    //  P = 1/2 * |xA*yB + xB*yC + xC*yA - xC*yB - xA*yC - xB*yA|
    public double poleTrojkata() {
        double pole = 0;

        pole = 0.5 * Math.abs(a.getX()*b.getY() + b.getX()*c.getY() + c.getX()*a.getY() - c.getX()*b.getY() - a.getX()*c.getY() - b.getX()*a.getY());

        return pole;
    }
}
