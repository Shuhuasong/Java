package GUI;

import java.awt.*;

public class FlowLayout_Ex {

    public static void main(String[] args) {
        final Frame f = new Frame("flowlayout");
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        f.setSize(220, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        f.add(new Button("1st buttom"));
        f.add(new Button("2nd buttom"));
        f.add(new Button("3rc buttom"));
        f.add(new Button("4th buttom"));
        f.add(new Button("5th buttom"));
        f.add(new Button("6th buttom"));
    }
}
