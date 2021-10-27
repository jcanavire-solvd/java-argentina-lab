package ClubDeFutbol;

public class Inter extends ClubDeFutbol {

    public static void main(String[] args) {
        Inter clubInter = new Inter();
        clubInter.setLeague("Serie A");
        clubInter.setCountry("Italy");
        clubInter.setAge(113);
        clubInter.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubInter);
        System.out.println("Can play a match?: " + clubInter.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }


}