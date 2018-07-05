package NotificationManager;

import java.awt.*;

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
