package ClubDeFutbol;

public class ManchesterCity extends ClubDeFutbol {

    public static void main(String[] args) {
        ManchesterCity clubManchesterCity = new ManchesterCity();
        clubManchesterCity.setLeague("Premier League");
        clubManchesterCity.setCountry("England");
        clubManchesterCity.setAge(127);
        clubManchesterCity.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(clubManchesterCity);
        System.out.println("Can play a match?: " + clubManchesterCity.canPlay());

    }


    @Override
    public boolean canPlay() {
            return (this.country != null || this.age >= 0);
    }


}