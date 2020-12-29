package Fruit_SuperMarket_Management_System.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractMap;

public abstract  class AbstractMainFrame extends JFrame {

    public AbstractMainFrame(){
        this.init();
        this.addComponent();
        this.addListener();
    }


    private JLabel titleLabel = new JLabel("fruitstore.jpg");
    private JButton btn = new JButton("Get Into System");

    private void init(){
        this.setTitle("Welcome to Luck Fruit Supermarket");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent(){
        this.add(this.titleLabel, BorderLayout.NORTH);
        JPanel btnPanel = new JPanel();
        btnPanel.add(btn);
        this.add(btnPanel, BorderLayout.CENTER);
        btnPanel.setLayout(null);
        btn.setBounds(200, 20, 200, 50);
    }

    private void addListener(){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdminDialog();
            }
        });
    }

    public abstract void showAdminDialog();
}
