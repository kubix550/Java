package geoinformatyka;

public class ModelWspolrzednych {
    String szerokoscGeograficzna;
    String dlugoscGeograficzna;

    public ModelWspolrzednych(String szerokoscGeograficzna, String dlugoscGeograficzna) {
        this.szerokoscGeograficzna = szerokoscGeograficzna;
        this.dlugoscGeograficzna = dlugoscGeograficzna;
    }

    public String getSzerokoscGeograficzna() {
        return szerokoscGeograficzna;
    }

    public void setSzerokoscGeograficzna(String szerokoscGeograficzna) {
        this.szerokoscGeograficzna = szerokoscGeograficzna;
    }

    public String getDlugoscGeograficzna() {
        return dlugoscGeograficzna;
    }

    public void setDlugoscGeograficzna(String dlugoscGeograficzna) {
        this.dlugoscGeograficzna = dlugoscGeograficzna;
    }

    @Override
    public String toString() {
        return "ModelWspolrzednych{" +
                "szerokoscGeograficzna='" + szerokoscGeograficzna + '\'' +
                ", dlugoscGeograficzna='" + dlugoscGeograficzna + '\'' +
                '}';
    }
}
