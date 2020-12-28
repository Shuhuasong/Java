package AWT_Eveny;

import java.awt.*;
import java.util.Random;

public class AwtDrawing_VerificationCode {

    public static void main(String[] args) {
        final Frame frame = new Frame("Verification Code");
        final Panel panel = new MyPanel();
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class MyPanel extends Panel{
    //Java will call this  method automatically
    @Override
    public void paint(Graphics g){ // the object is created from AWT structure
        int width = 160;
        int height = 40;
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width-1, height-1);
        Random random = new Random();
        for(int i=0; i<100; i++){
            int x = random.nextInt(width)-2;
            int y = random.nextInt(height)-2;
            g.drawOval(x, y, 2, 2);
        }
        g.setFont(new Font("Bold", Font.BOLD, 30));
        g.setColor(Color.BLUE);
        char[] chars = ("1234566789abcdefghijklmnopqrstuvwxyz").toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<4; i++){
            int pos = random.nextInt(chars.length);
            char c = chars[pos];
            sb.append(c+"  ");
        }
        g.drawString(sb.toString(), 20, 30);
    }
}
