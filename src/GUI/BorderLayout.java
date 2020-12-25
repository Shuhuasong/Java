package GUI;

//import javafx.scene.layout.Border;

import java.awt.*;

class BorderEx {
    public static void main(String[] args) {
        final Frame f=new Frame("border layout");
        f.setLayout(new java.awt.BorderLayout());
        f.setSize(300,300);
        f.setLocation(300,300);
        f.setVisible(true);
        f.add(new Button("东部"), java.awt.BorderLayout.EAST);
        f.add(new Button("西部"), java.awt.BorderLayout.WEST);
        f.add(new Button("北部"), java.awt.BorderLayout.NORTH);
        f.add(new Button("南部"), java.awt.BorderLayout.SOUTH);
        f.add(new Button("中部"), java.awt.BorderLayout.CENTER);
    }
}




