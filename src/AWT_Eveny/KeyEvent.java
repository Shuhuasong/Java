package AWT_Eveny;

import java.awt.*;
import java.awt.event.KeyAdapter;

public class KeyEvent {

    public static void main(String[] args) {
        Frame frame = new Frame("Key Event");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocation(300, 300);

        TextField tf = new TextField(30);
        frame.add(tf);

        tf.addKeyListener(
                new KeyAdapter() {
                    @Override
                    public void keyPressed(java.awt.event.KeyEvent e) {
                       int keyCode = e.getKeyCode();
                       String s = java.awt.event.KeyEvent.getKeyText(keyCode);
                        System.out.println("The input content is: " + s + ", ");
                        System.out.println("The correspond keyCode is: " + keyCode);
                    }
                }
        );
    }

}
