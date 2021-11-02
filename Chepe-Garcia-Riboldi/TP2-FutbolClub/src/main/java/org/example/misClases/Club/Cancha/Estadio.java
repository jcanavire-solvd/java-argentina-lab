package org.example.misClases.Club.Cancha;

public class Estadio {
    private int capacity;
    private String typeOfGrass;
    private int actualViewers;


    public Estadio(int cap, String grass, int viewers){
        this.capacity=cap;
        this.typeOfGrass=grass;
        this.actualViewers=viewers;

    }

    public void setCapacity(int newCap){
        this.capacity = newCap;
    }
    public int getcapacity(){
        return this.capacity;

    }
    public String getTypeOfGrass(){
        return this.typeOfGrass;

    }
    public int getActualViewers(){
        return  this.actualViewers;

    }
    public String ToString(){
        return "The capacity of the stadium is " + this.capacity + "The type of grass is " + this.typeOfGrass + "The averege of viewers is" + this.actualViewers;

    }

}
