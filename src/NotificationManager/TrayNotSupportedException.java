package NotificationManager;

/**
 *
 * @author Julian
 */
public class TrayNotSupportedException extends Exception{

    public TrayNotSupportedException(){
    }

    public TrayNotSupportedException(String string){
        super(string);
    }
    
}
