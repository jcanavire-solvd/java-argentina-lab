package org.example.misClases.Humano;

public abstract class Hincha extends Persona {
    private String levelOfFanaticism;

    public Hincha(String name, int id, String address, String fanaticism) {
        super(name, id, address);
        this.levelOfFanaticism=fanaticism;
    }

    public String getLevelOfFanaticism() {
        return levelOfFanaticism;
    }

    public void setLevelOfFanaticism(String levelOfFanaticism) {
        this.levelOfFanaticism = levelOfFanaticism;
    }
}
