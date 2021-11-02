package ClubDeFutbol;

public class BorussiaDortmund extends ClubDeFutbol {

    public static void main(String[] args) {
        BorussiaDortmund teamBorussiaDortmund = new BorussiaDortmund();
        teamBorussiaDortmund.setLeague("Bundesliga");
        teamBorussiaDortmund.setCountry("Germany");
        teamBorussiaDortmund.setAge(111);
        teamBorussiaDortmund.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamBorussiaDortmund);
        System.out.println("Can play a match?: " + teamBorussiaDortmund.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }

}