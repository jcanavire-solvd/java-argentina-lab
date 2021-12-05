package org.example.misClases.Club.Divisiones;

import org.example.misClases.Club.Club;
import org.example.misClases.Humano.Jugador;

import java.util.ArrayList;

public class ClubPrimera extends Club {
    private int qualifyLastTournament;



    public ClubPrimera(int antiquity, int trophys, int levelOfTeam, int qualify, ArrayList<Jugador> arrJug, String nombreDeClub) {
        super(antiquity, trophys, levelOfTeam, arrJug, nombreDeClub);
        this.qualifyLastTournament= qualify;
    }

    public int getQualifyLastTournament() {
        return qualifyLastTournament;
    }

    public void setQualifyLastTournament(int qualifyLastTournament) {
        this.qualifyLastTournament = qualifyLastTournament;
    }
}
