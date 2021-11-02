package org.example.misClases.Humano;

public class Dirigente extends Persona{
    private String charge;
    private String politicalAfiliation;


    public Dirigente(String name, int id, String adress, String charg, String polAf){
        super(name, id, adress);
        this.charge=charg;
        this.politicalAfiliation=polAf;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getPoliticalAfiliation() {
        return politicalAfiliation;
    }

    public void setPoliticalAfiliation(String politicalAfiliation) {
        this.politicalAfiliation = politicalAfiliation;
    }
}
