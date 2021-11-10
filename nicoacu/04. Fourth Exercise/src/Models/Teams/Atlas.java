package Models.Teams;

import java.util.ArrayList;
import Models.Staff.Players;

public class Atlas extends FootballTeam {
    public int totalAmountPlayers;



    public Atlas(int currentAmountPlayers) {
        this.totalAmountPlayers = currentAmountPlayers;
        this.league = "Primera C";
        this.country = "Argentina";
        this.age = 70;
        this.setHasArgentinianPlayers(true);

    }

    public int getTotalAmountPlayers() {
        return totalAmountPlayers;
    }

    public void setTotalAmountPlayers(int totalAmountPlayers) {
        this.totalAmountPlayers = totalAmountPlayers;
    }

    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0 && totalAmountPlayers > 7);
    }


}