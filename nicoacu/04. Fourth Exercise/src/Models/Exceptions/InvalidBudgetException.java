package Models.Exceptions;

public class InvalidBudgetException extends Exception{
    public InvalidBudgetException(String message){
        super(message);
    }
}