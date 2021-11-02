package org.example.misClases.Humano.Simpatizante;

import org.example.misClases.Humano.Hincha;

public class Socio extends Hincha {
    private int afilateID;
    private int yearsAfilate;
    private String benefits;


    public Socio(String name, int id, String address, String fanaticism, int afiID, int yearsAfi, String bene) {
        super(name, id, address, fanaticism);
        this.afilateID=afiID;
        this.yearsAfilate=yearsAfi;
        this.benefits=bene;

    }

    public int getAfilateID() {
        return afilateID;
    }

    public void setAfilateID(int afilateID) {
        this.afilateID = afilateID;
    }

    public int getYearsAfilate() {
        return yearsAfilate;
    }

    public void setYearsAfilate(int yearsAfilate) {
        this.yearsAfilate = yearsAfilate;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
