package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton_Ex extends JFrame {

    private ButtonGroup group;
    private JPanel panel;
    private JPanel pallet;

    public JRadioButton_Ex(){
        pallet = new JPanel();
        this.add(pallet, BorderLayout.CENTER);

        panel = new JPanel();
        group = new ButtonGroup();
        addJRadioButton("Gray");
        addJRadioButton("Pink");
        addJRadioButton("Yellow");

        this.add(panel, BorderLayout.SOUTH);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void addJRadioButton(final String text){
        JRadioButton radioButton = new JRadioButton(text);
        group.add(radioButton); //ensure only one button can be selected
        panel.add(radioButton); //ensure the button can be showed on the panel
        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = null;
                if("Gray".equals(text)){
                    color = Color.GRAY;
                }else if("Pink".equals(text)){
                    color = Color.PINK;
                }else if("Yellow".equals(text)){
                    color = Color.YELLOW;
                }else{
                    color = Color.WHITE;
                }
                pallet.setBackground(color);
            }
        });
    }

    public static void main(String[] args) {
        new JRadioButton_Ex();
    }
}
