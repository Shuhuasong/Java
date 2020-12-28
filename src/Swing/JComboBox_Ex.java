package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_Ex extends JFrame {

    private JComboBox comboBox;
    private JTextField field;

    public JComboBox_Ex(){
        JPanel panel = new JPanel();
        comboBox = new JComboBox();
        comboBox.addItem("Please Select a City");
        comboBox.addItem("New York");
        comboBox.addItem("Beijing");
        comboBox.addItem("Paris");
        comboBox.addItem("Sydney");
        comboBox.addItem("HongKong");
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = (String) comboBox.getSelectedItem();
                if(item.equals("Please Select a City")){
                    field.setText("");
                }else{
                    field.setText("Your Selected City is: " + item);
                }
            }
        });

        field = new JTextField(20);
        panel.add(comboBox);
        panel.add(field);
        this.add(panel, BorderLayout.NORTH);
        this.setSize(350, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBox_Ex();
    }
}
