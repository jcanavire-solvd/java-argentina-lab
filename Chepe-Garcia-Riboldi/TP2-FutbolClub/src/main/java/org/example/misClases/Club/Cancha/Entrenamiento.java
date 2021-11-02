package org.example.misClases.Club.Cancha;

public class Entrenamiento {
    private int numberOfCourts;
    private float supliesCost;

    public Entrenamiento(int numsofcourts,float supcost){
        this.numberOfCourts=numsofcourts;
        this.supliesCost=supcost;

    }


    public int getNumberOfCourts() {
        return numberOfCourts;
    }

    public void setNumberOfCourts(int numberOfCourts) {
        this.numberOfCourts = numberOfCourts;
    }

    public float getSupliesCost() {
        return supliesCost;
    }

    public void setSupliesCost(float supliesCost) {
        this.supliesCost = supliesCost;
    }
}
