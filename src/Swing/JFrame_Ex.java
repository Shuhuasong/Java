package Swing;

import javax.swing.*;
import java.awt.*;

public class JFrame_Ex extends JFrame{

    public JFrame_Ex(){
        this.setTitle("Swing JFrame");
        this.setSize(300, 300);
        JButton button = new JButton("Button");
        this.setLayout(new FlowLayout());
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new JFrame_Ex();
    }
}
