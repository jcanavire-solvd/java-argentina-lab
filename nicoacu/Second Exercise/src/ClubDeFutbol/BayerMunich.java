package ClubDeFutbol;

public class BayerMunich extends ClubDeFutbol {

    public static void main(String[] args) {
        BayerMunich clubBayerMunich = new BayerMunich();
        clubBayerMunich.setLeague("Bundesliga");
        clubBayerMunich.setCountry("Germany");
        clubBayerMunich.setAge(121);
        clubBayerMunich.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubBayerMunich);
        System.out.println("Can play a match?: " + clubBayerMunich.canPlay());

    }

    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }


}