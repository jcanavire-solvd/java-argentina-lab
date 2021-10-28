package ClubDeFutbol;

public class BocaJuniors extends ClubDeFutbol {

    public static void main(String[] args) {
        BocaJuniors clubBocaJuniors = new BocaJuniors();
        clubBocaJuniors.setLeague("Super Liga Argentina");
        clubBocaJuniors.setCountry("Argentina");
        clubBocaJuniors.setAge(116);
        clubBocaJuniors.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubBocaJuniors);
        System.out.println("Can play a match?: " +  clubBocaJuniors.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}