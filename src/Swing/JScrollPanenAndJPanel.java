package Swing;

import javax.swing.*;
import java.awt.*;

public class JScrollPanenAndJPanel extends JFrame {

    public JScrollPanenAndJPanel(){
        this.setTitle("pane demo");
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel jPanel = new JPanel();
        jPanel.add(new JButton("Button_1"));
        jPanel.add(new JButton("Button_2"));
        jPanel.add(new JButton("Button_3"));
        jPanel.add(new JButton("Button_4"));

        jScrollPane.setViewportView(jPanel);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
       new JScrollPanenAndJPanel();
    }
}
