package NotificationManager;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Julian
 */
public class TaskBarPoint{

    private TrayIcon trayIcon;

    protected TaskBarPoint(String path) throws TrayNotSupportedException, AWTException{
        if(!SystemTray.isSupported()){
            throw new TrayNotSupportedException("System tray not supportet");
        }
        SystemTray tray = SystemTray.getSystemTray();

        Image trayImage = Toolkit.getDefaultToolkit().createImage(path);

        this.trayIcon = new TrayIcon(trayImage, "Tray Test");

        this.trayIcon.setImageAutoSize(true);
        tray.add(trayIcon);
    }

    protected TaskBarPoint(Image trayIconImage) throws TrayNotSupportedException, AWTException{
        if(!SystemTray.isSupported()){
            throw new TrayNotSupportedException("System tray not supportet");
        }
        SystemTray tray = SystemTray.getSystemTray();

        Image trayImage = trayIconImage;

        this.trayIcon = new TrayIcon(trayImage, "Tray Test");

        this.trayIcon.setImageAutoSize(true);
        tray.add(trayIcon);
    }

    protected TaskBarPoint(String path, String toolTip) throws
            TrayNotSupportedException, AWTException{
        this(path);
        this.trayIcon.setToolTip(toolTip);
    }

    protected TaskBarPoint(Image trayIconImage, String toolTip) throws
            TrayNotSupportedException, AWTException{
        this(trayIconImage);
        this.trayIcon.setToolTip(toolTip);
    }

    protected void addMouseListener(MouseListener ml){
        this.trayIcon.addMouseListener(ml);
    }

    protected void addMouseMotionListener(MouseMotionListener ml){
        this.trayIcon.addMouseMotionListener(ml);
    }

    protected void addActionListener(ActionListener al){
        this.trayIcon.addActionListener(al);
    }
    
    protected void removeMouseListener(MouseListener ml){
        this.trayIcon.removeMouseListener(ml);
    }

    protected void removeMouseMotionListener(MouseMotionListener ml){
        this.trayIcon.removeMouseMotionListener(ml);
    }

    protected void removeActionListener(ActionListener al){
        this.trayIcon.removeActionListener(al);
    }

    protected void setToolTip(String tooltip){
        this.trayIcon.setToolTip(tooltip);
    }

    protected void sendNotification(Notification n){
        this.trayIcon.displayMessage(n.getTitle(), n.getMessage(), n.
                getMessageType().getTrayIconMessageType());
    }
}
