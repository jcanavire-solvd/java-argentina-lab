package ClubDeFutbol;

public class ManchesterUnited extends ClubDeFutbol {

    public static void main(String[] args) {
        ManchesterUnited teamManchesterUnited = new ManchesterUnited();
        teamManchesterUnited.setLeague("Premier League");
        teamManchesterUnited.setCountry("England");
        teamManchesterUnited.setAge(119);
        teamManchesterUnited.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamManchesterUnited);
        System.out.println("Can play a match?: " + teamManchesterUnited.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }

}