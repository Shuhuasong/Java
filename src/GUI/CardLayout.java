package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CardEx {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setSize(300,300);
        frame.setVisible(true);

        CardLayout cardLayout=new CardLayout();
        Panel cardPanel=new Panel();
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new Label("第一个界面",Label.CENTER));
        cardPanel.add(new Label("第二个界面"),Label.CENTER);
        cardPanel.add(new Label("第三个界面"),Label.CENTER);

        Panel controlPanel=new Panel();
        Button nextButton=new Button("下一张卡片");
        Button preButton=new Button("上一张卡片");
        controlPanel.add(nextButton);
        controlPanel.add(preButton);

        frame.add(cardPanel,BorderLayout.NORTH);
        frame.add(controlPanel,BorderLayout.SOUTH);



        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        preButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });
    }
}