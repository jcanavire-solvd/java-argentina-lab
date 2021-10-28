package ClubDeFutbol;

public class ManchesterUnited extends ClubDeFutbol {

    public static void main(String[] args) {
        ManchesterUnited clubManchesterUnited = new ManchesterUnited();
        clubManchesterUnited.setLeague("Premier League");
        clubManchesterUnited.setCountry("England");
        clubManchesterUnited.setAge(119);
        clubManchesterUnited.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubManchesterUnited);
        System.out.println("Can play a match?: " + clubManchesterUnited.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }

}