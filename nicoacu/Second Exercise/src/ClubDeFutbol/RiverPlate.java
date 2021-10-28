package ClubDeFutbol;

public class RiverPlate extends ClubDeFutbol {

    public static void main(String[] args) {
        RiverPlate clubRiverPlate = new RiverPlate();
        clubRiverPlate.setLeague("Super Liga Argentina");
        clubRiverPlate.setCountry("Argentina");
        clubRiverPlate.setAge(120);
        clubRiverPlate.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubRiverPlate);
        System.out.println("Can play a match?: " + clubRiverPlate.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}