/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
