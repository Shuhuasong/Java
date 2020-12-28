package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFiledAndJTextArea extends JFrame{
    private JButton sendBtn;
    private JTextField inputField;
    private JTextArea charContent;

    public JTextFiledAndJTextArea(){
        this.setLayout(new BorderLayout());
        inputField = new JTextField(20);
        sendBtn = new JButton("Send");
        charContent = new JTextArea(12, 34);
        sendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = inputField.getText();
                if(content != null && !content.trim().equals("")){
                    charContent.append("Me: " + content + "\n");
                }else{
                    charContent.append("The char information can not be empty");
                }
                inputField.setText("");
            }
        });

        Label label = new Label("Chat Information");
        JScrollPane showPanel = new JScrollPane(charContent);
        JPanel inputPanel = new JPanel();
        inputPanel.add(label);
        inputPanel.add(inputField);
        inputPanel.add(sendBtn);

        this.add(showPanel, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.SOUTH);
        this.setTitle("Chat Window");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
       new JTextFiledAndJTextArea();
    }
}
