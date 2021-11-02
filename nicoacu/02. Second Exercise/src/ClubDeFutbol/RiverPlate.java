package ClubDeFutbol;

public class RiverPlate extends ClubDeFutbol {

    public static void main(String[] args) {
        RiverPlate teamRiverPlate = new RiverPlate();
        teamRiverPlate.setLeague("Super Liga Argentina");
        teamRiverPlate.setCountry("Argentina");
        teamRiverPlate.setAge(120);
        teamRiverPlate.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamRiverPlate);
        System.out.println("Can play a match?: " + teamRiverPlate.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}