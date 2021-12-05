package Models.Interfaces;

import Models.Exceptions.InvalidPlayerNameException;

public interface StrategicDecision {

    default void hirePlayers(String playerName) throws InvalidPlayerNameException {

    }

    default void sellPlayers(String playerName) {

    }

}
