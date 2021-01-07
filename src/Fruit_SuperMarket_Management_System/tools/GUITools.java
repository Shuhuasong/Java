package Fruit_SuperMarket_Management_System.tools;

import java.awt.*;

public class GUITools {

    static Toolkit kit=Toolkit.getDefaultToolkit();

    public static void center(Component component){
        int x=(kit.getScreenSize().width- component.getWidth())/2;
        int y=(kit.getScreenSize().height-component.getHeight())/2;
        component.setLocation(x,y);
    }

}
