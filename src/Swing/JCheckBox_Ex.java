package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBox_Ex extends JFrame{

    private JCheckBox italic;
    private JCheckBox bold;
    private JLabel label;

    public JCheckBox_Ex(){
        label = new JLabel("Welcome Come Here", JLabel.CENTER);
        label.setFont(new Font("New Times", Font.PLAIN, 20));
        italic = new JCheckBox("Italic");
        bold = new JCheckBox("Bold");
        this.add(label);

        JPanel panel = new JPanel();
        panel.add(italic);
        panel.add(bold);
        this.add(panel, BorderLayout.SOUTH);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = 0;
                if(bold.isSelected()){
                    mode += Font.BOLD;
                }
                if(italic.isSelected()){
                    mode += Font.ITALIC;
                }
                label.setFont(new Font("New Times", mode, 20));
            }
        };

        italic.addActionListener(actionListener);
        bold.addActionListener(actionListener);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JCheckBox_Ex();
    }
}
