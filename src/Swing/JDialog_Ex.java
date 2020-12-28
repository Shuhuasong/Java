package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialog_Ex {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("jFrame");
        JButton btn1 = new JButton("Model Dialog");
        JButton btn2 = new JButton("Non-Model Dialog");

        jFrame.add(btn1);
        jFrame.add(btn2);
        jFrame.setSize(300, 300);
        jFrame.setLocation(300, 300);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        //
        final JDialog dialog = new JDialog(jFrame, "Dialog");
        final JLabel label = new JLabel();
        final JButton btn3 = new JButton("Comfirm");
        dialog.add(btn3);
        dialog.setSize(150, 150);
        dialog.setLocation(350, 350);
        dialog.setLayout(new FlowLayout());

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setModal(true);
                if(dialog.getComponents().length == 1){
                    dialog.add(label);
                }
                label.setText("Modal Dialog, Please press the close button");
                dialog.setVisible(true);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setModal(false);
                if(dialog.getComponents().length == 1){
                    dialog.add(label);
                }
                label.setText("Non-Modal Dialog, Please press the comfirm button");
                dialog.setVisible(true);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
    }
}
