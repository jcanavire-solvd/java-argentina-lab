package ClubDeFutbol;

public class BocaJuniors extends ClubDeFutbol implements TransferMarket {

    public static void main(String[] args) {
        BocaJuniors teamBocaJuniors = new BocaJuniors();
        teamBocaJuniors.setLeague("Super Liga Argentina");
        teamBocaJuniors.setCountry("Argentina");
        teamBocaJuniors.setAge(116);
        teamBocaJuniors.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamBocaJuniors);
        System.out.println("Can play a match?: " +  teamBocaJuniors.canPlay());

        teamBocaJuniors.canBuyPlayers(600,300);

    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }

}