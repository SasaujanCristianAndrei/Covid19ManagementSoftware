package models;

import java.util.List;
import java.util.ArrayList;

public class Aplicatie {

    private String nume;
    private List<Utilizator> utilizatori;

    public Aplicatie(String nume)
    {
        this.nume = nume;
        this.utilizatori = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Utilizator> getUtilizatori() {
        return utilizatori;
    }

    public void setUtilizatori(List<Utilizator> utilizatori) {
        this.utilizatori = utilizatori;
    }

    @Override
    public String toString() {
        return nume;
    }
}
