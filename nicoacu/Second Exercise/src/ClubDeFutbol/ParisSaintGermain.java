package ClubDeFutbol;

public class ParisSaintGermain extends ClubDeFutbol {

    public static void main(String[] args) {
        ParisSaintGermain clubParisSaintGermain = new ParisSaintGermain();
        clubParisSaintGermain.setLeague("Ligue 1");
        clubParisSaintGermain.setCountry("France");
        clubParisSaintGermain.setAge(51);
        clubParisSaintGermain.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubParisSaintGermain);
        System.out.println("Can play a match?: " + clubParisSaintGermain.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}