package ClubDeFutbol;

public interface TransferMarket {

    //Applying new method for Polymorphism.
    //Polymorphism applied on Inter and RealMadrid teams, as these teams have another parameter in the method called "canAskForLoan"
    //BocaJuniors teams is using the default method as an example.

    default void canBuyPlayers(int playerCost, int moneyAvailable){
        System.out.println("----------------Football Transfer Market Report---------------");
        System.out.println("This team is looking to buy a player who cost: USD " + playerCost);
        if (moneyAvailable > playerCost){
            System.out.println("This team can buy the player.");
        } else {
            System.out.println("This player is too expensive.");
        }
        System.out.println("--------------------------------------------------------------");
    }

}
