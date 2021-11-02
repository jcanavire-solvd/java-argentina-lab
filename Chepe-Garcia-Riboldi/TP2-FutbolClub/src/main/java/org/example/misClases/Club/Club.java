package org.example.misClases.Club;

import org.example.misClases.Humano.Jugador;

public abstract class Club {
    protected int yearOfAntiquity;
    protected int numberOfTrophys;
    protected int levelOfTeam;
    protected Jugador[] equipo;
    protected String nombreDeClub;



    public Club(int antiquity, int trophys, int levelOfTeam, Jugador[] arrjug, String nomclub){
        this.levelOfTeam=levelOfTeam;
        this.yearOfAntiquity=antiquity;
        this.numberOfTrophys=trophys;
        this.equipo=arrjug;
        this.nombreDeClub=nomclub;




    }



    public String jugarPartido(Club rival){
        String stringi="GANO EL EQUIPO ";
        if (this.levelOfTeam > rival.getLevelOfTeam()) {
            stringi+=this.nombreDeClub;
        }else
        {
            stringi+= rival.getNombreDeClub();

        }



        return stringi;


    }
    public int getLevelOfTeam() {
        return levelOfTeam;
    }

    public void setLevelOfTeam(int levelOfTeam) {
        this.levelOfTeam = levelOfTeam;
    }

    public Jugador[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Jugador[] equipo) {
        this.equipo = equipo;
    }


    public int getYearOfAntiquity() {
        return yearOfAntiquity;
    }

    public void setYearOfAntiquity(int yearOfAntiquity) {
        this.yearOfAntiquity = yearOfAntiquity;
    }

    public int getNumberOfTrophys() {
        return numberOfTrophys;
    }

    public void setNumberOfTrophys(int numberOfTrophys) {
        this.numberOfTrophys = numberOfTrophys;
    }


    public String getNombreDeClub() {
        return nombreDeClub;
    }

    public void setNombreDeClub(String nombreDeClub) {
        this.nombreDeClub = nombreDeClub;
    }
}
