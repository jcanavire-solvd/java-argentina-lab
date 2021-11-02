package org.example.misClases.Humano;

public class Jugador extends Persona {
    private String position;
    private int yearsInClub;
    private int yearsOfContract;
    private int goals;

    public Jugador(String pos, int yearsinclub, int contract, int goal, String name, int id, String address){
        super (name, id, address);
        this.position=pos;
        this.yearsInClub=yearsinclub;
        this.yearsOfContract=contract;
        this.goals=goal;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearsInClub() {
        return yearsInClub;
    }

    public void setYearsInClub(int yearsInClub) {
        this.yearsInClub = yearsInClub;
    }

    public int getYearsOfContract() {
        return yearsOfContract;
    }

    public void setYearsOfContract(int yearsOfContract) {
        this.yearsOfContract = yearsOfContract;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
