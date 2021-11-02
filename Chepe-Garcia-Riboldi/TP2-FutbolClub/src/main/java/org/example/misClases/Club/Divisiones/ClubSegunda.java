package org.example.misClases.Club.Divisiones;

import org.example.misClases.Club.Club;
import org.example.misClases.Humano.Jugador;

public class ClubSegunda extends Club {
    private boolean rise;

    public ClubSegunda(int antiquity, int trophys, int levelOfTeam, boolean rise, Jugador[] arrJug, String nombreDeClub) {
        super(antiquity, trophys, levelOfTeam, arrJug, nombreDeClub);
        this.rise= rise;

    }

    public boolean isRise() {
        return rise;
    }

    public void setRise(boolean rise) {
        this.rise = rise;
    }
}
