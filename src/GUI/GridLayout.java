package GUI;

import java.awt.*;

public class GridLayout {

    public static void main(String[] args) {
        Frame f = new Frame("Gridlayout");
        f.setLayout(new java.awt.GridLayout(3, 3));
        f.setSize(300, 300);
        f.setLocation(300, 300);
        for(int i=0; i<9; i++){
            f.add(new Button("byn"+i));
        }
        f.setVisible(true);
    }
}
