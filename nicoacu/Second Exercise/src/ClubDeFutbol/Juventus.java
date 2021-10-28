package ClubDeFutbol;

public class Juventus extends ClubDeFutbol {

    public static void main(String[] args) {
        Juventus clubJuventus = new Juventus();
        clubJuventus.setLeague("Serie A");
        clubJuventus.setCountry("Italy");
        clubJuventus.setAge(123);
        clubJuventus.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubJuventus);
        System.out.println("Can play a match?: " + clubJuventus.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}