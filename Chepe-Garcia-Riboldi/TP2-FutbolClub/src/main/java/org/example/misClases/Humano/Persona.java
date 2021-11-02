package org.example.misClases.Humano;

public abstract class Persona {
    protected String name;
    protected int id;
    protected String adress;


    public Persona(String name, int id, String adress){
    this.name=name;
    this.id=id;
    this.adress=adress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
