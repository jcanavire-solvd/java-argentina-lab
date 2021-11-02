package org.example.misClases.Club.Cancha;

public class Gimnasio {
    private int amountOfDumbbell;
    private int amountOfGymMachines;


    public Gimnasio(int dumbbell, int gymmachines){
        this.amountOfDumbbell=dumbbell;
        this.amountOfGymMachines=gymmachines;

    }

    public int getAmountOfDumbbell() {
        return amountOfDumbbell;
    }

    public void setAmountOfDumbbell(int amountOfDumbbell) {
        this.amountOfDumbbell = amountOfDumbbell;
    }

    public int getAmountOfGymMachines() {
        return amountOfGymMachines;
    }

    public void setAmountOfGymMachines(int amountOfGymMachines) {
        this.amountOfGymMachines = amountOfGymMachines;
    }
}
