package GUI;

import java.awt.*;

public class Frame_Ex1{

    public static void main(String[] args) {
        Frame frame = new Frame("My Window");
        frame.setSize(800, 300);
        frame.setLocation(600, 200); // relative to the top left side of the screen
        frame.setVisible(true);
    }
}
