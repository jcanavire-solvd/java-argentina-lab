package ClubDeFutbol;

public class BayerMunich extends ClubDeFutbol {

    public static void main(String[] args) {
        BayerMunich teamBayerMunich = new BayerMunich();
        teamBayerMunich.setLeague("Bundesliga");
        teamBayerMunich.setCountry("Germany");
        teamBayerMunich.setAge(121);
        teamBayerMunich.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamBayerMunich);
        System.out.println("Can play a match?: " + teamBayerMunich.canPlay());

    }

    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }


}