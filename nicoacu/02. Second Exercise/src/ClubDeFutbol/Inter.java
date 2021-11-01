package ClubDeFutbol;

public class Inter extends ClubDeFutbol {

    public static void main(String[] args) {
        Inter teamInter = new Inter();
        teamInter.setLeague("Serie A");
        teamInter.setCountry("Italy");
        teamInter.setAge(113);
        teamInter.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamInter);
        System.out.println("Can play a match?: " + teamInter.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }


}