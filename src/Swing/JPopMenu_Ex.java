package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopMenu_Ex extends JFrame {

    private JPopupMenu popupMenu;

    public JPopMenu_Ex(){
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        popupMenu = new JPopupMenu();
        JMenuItem refreshItemm = new JMenuItem("refresh");
        JMenuItem createItem = new JMenuItem("create");
        JMenuItem exitItem = new JMenuItem("exit");

        popupMenu.add(refreshItemm);
        popupMenu.add(createItem);
        popupMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3){
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    public static void main(String[] args) {
        new JPopMenu_Ex();
    }
}
