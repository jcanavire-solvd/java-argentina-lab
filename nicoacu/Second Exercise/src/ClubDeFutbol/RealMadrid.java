package ClubDeFutbol;

public class RealMadrid extends ClubDeFutbol {

    public static void main(String[] args) {
        RealMadrid clubRealMadrid = new RealMadrid();
        clubRealMadrid.setLeague("LaLiga Santander");
        clubRealMadrid.setCountry("Spain");
        clubRealMadrid.setAge(119);
        clubRealMadrid.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubRealMadrid);
        System.out.println("Can play a match?: " + clubRealMadrid.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}