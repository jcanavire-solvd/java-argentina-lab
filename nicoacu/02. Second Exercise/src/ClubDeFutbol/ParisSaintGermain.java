package ClubDeFutbol;

public class ParisSaintGermain extends ClubDeFutbol {

    public static void main(String[] args) {
        ParisSaintGermain teamParisSaintGermain = new ParisSaintGermain();
        teamParisSaintGermain.setLeague("Ligue 1");
        teamParisSaintGermain.setCountry("France");
        teamParisSaintGermain.setAge(51);
        teamParisSaintGermain.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamParisSaintGermain);
        System.out.println("Can play a match?: " + teamParisSaintGermain.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}