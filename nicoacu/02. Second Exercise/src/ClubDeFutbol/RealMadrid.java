package ClubDeFutbol;

public class RealMadrid extends ClubDeFutbol {

    public static void main(String[] args) {
        RealMadrid teamRealMadrid = new RealMadrid();
        teamRealMadrid.setLeague("LaLiga Santander");
        teamRealMadrid.setCountry("Spain");
        teamRealMadrid.setAge(119);
        teamRealMadrid.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamRealMadrid);
        System.out.println("Can play a match?: " + teamRealMadrid.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}