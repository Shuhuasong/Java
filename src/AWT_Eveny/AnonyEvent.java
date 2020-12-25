package AWT_Eveny;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonyEvent {

    public static void main(String[] args) {

            Frame frame = new Frame("My Window");
            frame.setSize(300, 300);
            frame.setVisible(true);
            frame.setLocation(300, 300);

            Button btn = new Button("Exit");
            frame.add(btn);

            btn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.exit(0);
                }
            });
    }
}
