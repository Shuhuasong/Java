package AWT_Eveny;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_Ex3 {

    public static void main(String[] args) {
        Frame frame = new Frame("My Window");
        frame.setSize(300, 300);
        frame.setLocation(300, 300);
        frame.setVisible(true);

        frame.addWindowListener(
                new WindowListener() {
                    @Override
                    public void windowOpened(WindowEvent e) {
                        System.out.println("Window Opened");
                    }

                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("Window Closing");
                    }

                    @Override
                    public void windowClosed(WindowEvent e) {
                        System.out.println("Window Closed");
                    }

                    @Override
                    public void windowIconified(WindowEvent e) {
                        System.out.println("Window Iconified");
                    }

                    @Override
                    public void windowDeiconified(WindowEvent e) {
                        System.out.println("Deiconified");
                    }

                    @Override
                    public void windowActivated(WindowEvent e) {
                        System.out.println("Window Activated");
                    }

                    @Override
                    public void windowDeactivated(WindowEvent e) {
                        System.out.println("Window Deactived");
                    }
                }
        );
    }

}
