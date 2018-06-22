/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationManager;

import java.awt.TrayIcon;

/**
 *
 * @author Julian
 */
public enum MessageType{
    ERROR(TrayIcon.MessageType.ERROR), INFO(TrayIcon.MessageType.INFO), NONE(
            TrayIcon.MessageType.NONE), WARNING(TrayIcon.MessageType.WARNING);

    TrayIcon.MessageType mt;

    MessageType(TrayIcon.MessageType mt){
        this.mt = mt;
    }

    public TrayIcon.MessageType getTrayIconMessageType(){
        return mt;
    }
}
