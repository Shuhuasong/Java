package AWT_Eveny;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_Ex1 {

    public static void main(String[] args) {
        Frame frame = new Frame("My Window");
        frame.setSize(300, 300);
        frame.setVisible(true);
        MyWindowListener listener = new MyWindowListener();
        frame.addWindowListener(listener);
    }

    static class MyWindowListener implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            Window window = e.getWindow();
            window.setVisible(false);
            window.dispose();
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }


}
