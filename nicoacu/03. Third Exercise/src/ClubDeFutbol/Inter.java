package ClubDeFutbol;

public class Inter extends ClubDeFutbol implements TransferMarket, Training {

    {
        String trainingMsg = "(This team has a training scheduled for today!)";

            System.out.println("(---------------------------------------------)");
            System.out.println(trainingMsg);
            System.out.println("(---------------------------------------------)");
    }

    public static void main(String[] args) throws InterruptedException {
        Inter teamInter = new Inter();
        teamInter.setLeague("Serie A");
        teamInter.setCountry("Italy");
        teamInter.setAge(113);
        teamInter.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamInter);
        System.out.println("Can play a match?: " + teamInter.canPlay());
        teamInter.canBuyPlayers(1000,500,true);

        teamInter.startTraining(); // Using interface method.
    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }
}