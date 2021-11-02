package ClubDeFutbol;

public class RealMadrid extends ClubDeFutbol {

    public void canBuyPlayers(int playerCost, int moneyAvailable, boolean canAskForLoan){ // polymorphism, adding a new parameter in the default method.
        System.out.println("----------------Football Transfer Market Report---------------");
        System.out.println("This team is looking to buy a player who cost: USD " + playerCost);

        if (moneyAvailable < playerCost && !canAskForLoan){
            System.out.println("This player is too expensive.");
        } else if (moneyAvailable < playerCost && canAskForLoan) {
            System.out.println("This team can buy the player, but will need to ask for a loan.");
        } else {
            System.out.println("This team can buy the player.");
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        RealMadrid teamRealMadrid = new RealMadrid();
        teamRealMadrid.setLeague("LaLiga Santander");
        teamRealMadrid.setCountry("Spain");
        teamRealMadrid.setAge(119);
        teamRealMadrid.setHasArgentinianPlayers(true);
        System.out.println("Details of this Club:");
        System.out.println(teamRealMadrid);
        System.out.println("Can play a match?: " + teamRealMadrid.canPlay());

        teamRealMadrid.canBuyPlayers(1000,1500,true);

    }


    @Override
    public boolean canPlay() {
            return (this.country != null && this.age >= 0);
    }

}