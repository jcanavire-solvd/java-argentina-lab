package Models.Teams;

public class RealMadrid  extends FootballTeam {
    public int totalAmountPlayers;



    public RealMadrid(int currentAmountPlayers) {
        this.totalAmountPlayers = currentAmountPlayers;
        this.league = "LaLiga Santander";
        this.country = "Spain";
        this.age = 119;
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
