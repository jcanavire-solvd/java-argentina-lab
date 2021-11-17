package Models.Interfaces;

import Models.Exceptions.InvalidBudgetException;

public interface TransferMarket {

    default void canBuyPlayers(int playerCost) throws InvalidBudgetException {

    }

}
