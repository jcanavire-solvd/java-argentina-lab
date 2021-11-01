package ClubDeFutbol;

public class ManchesterCity extends ClubDeFutbol {

    public static void main(String[] args) {
        ManchesterCity teamManchesterCity = new ManchesterCity();
        teamManchesterCity.setLeague("Premier League");
        teamManchesterCity.setCountry("England");
        teamManchesterCity.setAge(127);
        teamManchesterCity.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamManchesterCity);
        System.out.println("Can play a match?: " + teamManchesterCity.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }


}