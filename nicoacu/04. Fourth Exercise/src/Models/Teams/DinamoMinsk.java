package Models.Teams;

public class DinamoMinsk  extends FootballTeam {
    public int totalAmountPlayers;



    public DinamoMinsk(int currentAmountPlayers) {
        this.totalAmountPlayers = currentAmountPlayers;
        this.league = "Vysheyshaya Liga";
        this.country = "Belarús";
        this.age = 94;
        this.setHasArgentinianPlayers(false);

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
