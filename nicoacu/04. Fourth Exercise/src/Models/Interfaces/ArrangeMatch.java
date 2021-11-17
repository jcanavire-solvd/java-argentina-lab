package Models.Interfaces;

import Models.Exceptions.InvalidTeamNameException;

public interface ArrangeMatch {

    default void arrangeMatch(String localTeam, String visitorTeam) throws InvalidTeamNameException {

    }

}
