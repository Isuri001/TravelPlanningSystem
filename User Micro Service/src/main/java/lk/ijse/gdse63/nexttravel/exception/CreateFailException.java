package lk.ijse.gdse63.nexttravel.exception;

public class CreateFailException extends Exception{

    public CreateFailException(String message, Throwable cause) {
        super(message + " :( "+ cause.getMessage(),cause);
    }

}
