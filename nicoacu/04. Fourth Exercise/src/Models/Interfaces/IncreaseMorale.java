package Models.Interfaces;

import Models.Exceptions.InvalidReviewException;

public interface IncreaseMorale {

    default void rallyPlayers(String msg) throws InvalidReviewException {
    }

}
