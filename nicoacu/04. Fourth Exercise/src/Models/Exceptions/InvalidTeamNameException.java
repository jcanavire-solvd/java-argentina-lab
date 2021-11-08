package Models.Exceptions;

public class InvalidTeamNameException extends Exception{
    public InvalidTeamNameException(String message){
        super(message);
    }
}
