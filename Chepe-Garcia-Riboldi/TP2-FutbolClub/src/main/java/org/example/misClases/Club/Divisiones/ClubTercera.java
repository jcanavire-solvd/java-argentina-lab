package org.example.misClases.Club.Divisiones;

import org.example.misClases.Club.Club;
import org.example.misClases.Humano.Jugador;

public class ClubTercera extends Club {
    private int promotion;

    public ClubTercera(int antiquity, int trophys, int levelOfTeam, int prom, Jugador[] arrJug, String nombreDeClub) {
        super(antiquity, trophys,levelOfTeam, arrJug,nombreDeClub);
        this.promotion=prom;

    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }
}
