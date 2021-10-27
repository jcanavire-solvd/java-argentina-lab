package ClubDeFutbol;

public class BorussiaDortmund extends ClubDeFutbol {

    public static void main(String[] args) {
        BorussiaDortmund clubBorussiaDortmund = new BorussiaDortmund();
        clubBorussiaDortmund.setLeague("Bundesliga");
        clubBorussiaDortmund.setCountry("Germany");
        clubBorussiaDortmund.setAge(111);
        clubBorussiaDortmund.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubBorussiaDortmund);
        System.out.println("Can play a match?: " + clubBorussiaDortmund.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}