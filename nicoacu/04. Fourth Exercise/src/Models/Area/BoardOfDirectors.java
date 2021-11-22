package Models.Area;

import Models.Exceptions.InvalidPlayerNameException;
import Models.Exceptions.InvalidTeamNameException;
import Models.Interfaces.ArrangeMatch;
import Models.Interfaces.StrategicDecision;

import java.util.ArrayList;
import java.util.Arrays;

public class BoardOfDirectors implements ArrangeMatch, StrategicDecision {

    String players[] = {};

    public void arrangeMatch(String localTeam, String visitorTeam) throws InvalidTeamNameException {

        if (localTeam.equals(visitorTeam)){
            throw new InvalidTeamNameException("Exception: localTeam and visitorTeam can't be the same");
        } else {
            System.out.println("Arranging friendly match: " + localTeam + " vs. " + visitorTeam);
        }

    }

    public void hirePlayers(String playerName) throws InvalidPlayerNameException {

        if (playerName == ""){
            throw new InvalidPlayerNameException("Exception: Player name is empty.");
        } else {
    ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(players));
    arrayList.add(playerName);
    players = arrayList.toArray(players);
    System.out.println("Players hired: " + Arrays.toString(players));
        }
    }

    public void sellPlayers(String playerName) {
        try{
             for (int i = 0; i < players.length; i++){
             if (playerName != players[i]){
                   throw new InvalidPlayerNameException();
             } else {
                ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(players));
                arrayList.remove(playerName);
                players = arrayList.toArray(new String[]{playerName});
             }
             System.out.println("Player " + playerName + " was sold. Players remaining: " + Arrays.toString(players));
             }
        } catch (InvalidPlayerNameException ex){
            System.out.println("Exception: " + playerName + " wasn't hired before.");
        }
    }

}
