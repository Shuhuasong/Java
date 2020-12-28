package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenu_Ex extends JFrame {

    public JMenu_Ex(){
        //set the size and positon of Window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
        //set the relationship of Component
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu menu = new JMenu("Operation");
        menuBar.add(menu);
        JMenuItem item1 = new JMenuItem("Popup Window");
        JMenuItem item2 = new JMenuItem("Close");
        menu.add(item1);
        menu.add(item2);
        //set the listener
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(JMenu_Ex.this, true);
                dialog.setTitle("Popup Window");
                dialog.setSize(200, 200);
                dialog.setLocation(50, 50);
                dialog.setVisible(true);
            }
        });

        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new JMenu_Ex();
    }
}
