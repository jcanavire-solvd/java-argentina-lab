package Models.Area;

import Models.Exceptions.InvalidTeamNameException;
import Models.Interfaces.ArrangeMatch;

public class BoardOfDirectors implements ArrangeMatch {

    public void arrangeMatch(String localTeam, String visitorTeam) throws InvalidTeamNameException {

        if (localTeam.equals(visitorTeam)){
            throw new InvalidTeamNameException("Exception: localTeam and visitorTeam can't be the same");
        } else {
            System.out.println("Arranging friendly match: " + localTeam + " vs. " + visitorTeam);
        }

    }


}
