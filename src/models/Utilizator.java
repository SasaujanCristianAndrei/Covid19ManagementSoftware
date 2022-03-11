package models;

public class Utilizator {

    private String nume;
    private int varsta;
    private String ocupatie;

    public Utilizator(String nume, int varsta, String ocupatie) {
        this.nume = nume;
        this.varsta = varsta;
        this.ocupatie = ocupatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    @Override
    public String toString() {
        return nume;
    }
}
