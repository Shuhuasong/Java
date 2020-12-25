package GUI;

import java.awt.*;

public class NoLayout {

    public static void main(String[] args) {
        Frame f = new Frame("Hello World");
        f.setLayout(null);
        f.setSize(300, 300);

        Button btn1 = new Button("Press");
        Button btn2 = new Button("pop");
        f.add(btn1);
        f.add(btn2);
        btn1.setBounds(40, 60, 100, 30);
        btn2.setBounds(140, 90, 100, 30);


        f.setVisible(true);
    }
}
