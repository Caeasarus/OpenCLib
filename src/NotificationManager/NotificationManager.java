/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationManager;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Julian
 */
public class NotificationManager{

    TaskBarPoint taskBarPoint;

    public NotificationManager(Image trayIconImage) throws
            TrayNotSupportedException, AWTException{
        this.taskBarPoint = new TaskBarPoint(trayIconImage);
    }

    public NotificationManager(String iconPath) throws
            TrayNotSupportedException, AWTException{
        this.taskBarPoint = new TaskBarPoint(iconPath);
    }

    public NotificationManager(Image trayIconImage, String toolTip) throws
            TrayNotSupportedException, AWTException{
        this.taskBarPoint = new TaskBarPoint(trayIconImage, toolTip);
    }

    public NotificationManager(String iconPath, String toolTip) throws
            TrayNotSupportedException, AWTException{
        this.taskBarPoint = new TaskBarPoint(iconPath, toolTip);
    }

    public void setToolTip(String tooltip){
        this.taskBarPoint.setToolTip(tooltip);
    }

    public void displayNotification(Notification n){
        this.taskBarPoint.sendNotification(n);
    }

    public Notification createNotification(String title, String message,
            MessageType mt){
        return new Notification(title, message, mt);
    }
    
    protected void addMouseListener(MouseListener ml){
        this.taskBarPoint.addMouseListener(ml);
    }

    protected void addMouseMotionListener(MouseMotionListener ml){
        this.taskBarPoint.addMouseMotionListener(ml);
    }

    protected void addActionListener(ActionListener al){
        this.taskBarPoint.addActionListener(al);
    }
    
    protected void removeMouseListener(MouseListener ml){
        this.taskBarPoint.removeMouseListener(ml);
    }
    
    protected void removeMouseMotionListener(MouseMotionListener ml){
        this.taskBarPoint.removeMouseMotionListener(ml);
    }

    protected void removeActionListener(ActionListener al){
        this.taskBarPoint.removeActionListener(al);
    }
}
