package Models.Exceptions;

public class InvalidPlayerAmountException extends Exception{
    public InvalidPlayerAmountException(String message){
        super(message);
    }
}