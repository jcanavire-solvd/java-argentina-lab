package ClubDeFutbol;

public class Juventus extends ClubDeFutbol {

    public static void main(String[] args) {
        Juventus teamJuventus = new Juventus();
        teamJuventus.setLeague("Serie A");
        teamJuventus.setCountry("Italy");
        teamJuventus.setAge(123);
        teamJuventus.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamJuventus);
        System.out.println("Can play a match?: " + teamJuventus.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}