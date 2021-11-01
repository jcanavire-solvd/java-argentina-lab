package ClubDeFutbol;

public class Juventus extends ClubDeFutbol implements Emblem, PressConference, BoardOfDirectors{

    public static void main(String[] args){
        final ConsoleLineClass consoleLineClass = new ConsoleLineClass();

        Juventus teamJuventus = new Juventus();
        teamJuventus.setLeague("Serie A");
        teamJuventus.setCountry("Italy");
        teamJuventus.setAge(123);
        teamJuventus.setHasArgentinianPlayers(true);

        consoleLineClass.printLine();
        System.out.println("Details of this Club:");
        System.out.println(teamJuventus);
        System.out.println("Can play a match?: " + teamJuventus.canPlay());

        consoleLineClass.printLine();
        teamJuventus.createLogo();
        teamJuventus.chooseShield();
        teamJuventus.pickColours(new String[]{"blue,white,black"});
        consoleLineClass.printLine();

        teamJuventus.givePressConference();
        teamJuventus.reviewConferenceWithPR("Before the match we were discussing the tactics with the team's captain, unfortunately our opponent took us for surprise");
        consoleLineClass.printLine();

        teamJuventus.hireStaff();
        teamJuventus.fireStaff();
        consoleLineClass.printLine();
    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }

    @Override
    public void givePressConference() {
        System.out.println("Giving press conference: ");
    }

    @Override
    public void hireStaff() {
        System.out.println("Additional Staff hired.");
    }

    @Override
    public void fireStaff() {
        System.out.println("Additional Staff fired.");
    }
}