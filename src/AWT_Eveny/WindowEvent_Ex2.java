package AWT_Eveny;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_Ex2 {

    public static void main(String[] args) {
        Frame frame = new Frame("My Window");
        frame.setSize(300, 300);
        frame.setVisible(true);
        MyWindowListener listener = new MyWindowListener();
        frame.addWindowListener(listener);
    }

    static class MyWindowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e){
            Window window = (Window) e.getComponent();
            window.setVisible(false);
            window.dispose();
        }
    }
}
