package lk.ijse.gdse63.nexttravel.Exception;

public class NotFoundException extends Exception{

    public NotFoundException(String message){
        super(message);
    }

    public NotFoundException(String message,Throwable cause){
        super(message,cause);
    }
}
