package Models.Interfaces;

import Models.Exceptions.InvalidBudgetException;

public interface TransferMarket {

    //Applying new method for Polymorphism.
    //Polymorphism applied on Inter and RealMadrid teams, as these teams have another parameter in the method called "canAskForLoan"
    //BocaJuniors teams is using the default method as an example.

    default void canBuyPlayers() throws InvalidBudgetException {

    }

}
