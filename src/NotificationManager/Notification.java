package NotificationManager;

import javax.swing.event.EventListenerList;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Julian
 */
public class Notification{
    private String title;
    private String message;
    private MessageType messageType;
    
    private EventListenerList listeners = new EventListenerList();

    protected Notification(String title, String message, MessageType messageType){
        this.title = title;
        this.message = message;
        this.messageType = messageType;
    }

    protected String getTitle(){
        return title;
    }

    protected String getMessage(){
        return message;
    }

    protected MessageType getMessageType(){
        return messageType;
    }
    
    public void addMouseListener(MouseListener ml){
        listeners.add(MouseListener.class,ml);
    }

    public void addMouseMotionListener(MouseMotionListener ml){
        listeners.add(MouseMotionListener.class,ml);
    }

    public void addActionListener(ActionListener al){
        listeners.add(ActionListener.class,al);
    }
    
    protected MouseListener[] getMouseListeners(){
        return listeners.getListeners(MouseListener.class);
    }
    
    protected MouseMotionListener[] getMouseMotionListeners(){
        return listeners.getListeners(MouseMotionListener.class);
    }
    
    protected ActionListener[] getActionListeners(){
        return listeners.getListeners(ActionListener.class);
    }
}
