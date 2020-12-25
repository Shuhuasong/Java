package AWT_Eveny;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MouseEvent_Ex {

    public static void main(String[] args) {
        final Frame frame = new Frame("Window Event");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocation(300, 300);

        Button btn = new Button("button");
        frame.add(btn);
        btn.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("Mouse Click");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        System.out.println("Mouse Press");
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        System.out.println("Mouse Release");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        System.out.println("Mouse Enter");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        System.out.println("Mouse Exit");
                    }

                    @Override
                    public void mouseWheelMoved(MouseWheelEvent e) {
                        System.out.println("Mouse Move");
                    }

                    @Override
                    public void mouseDragged(MouseEvent e) {
                        System.out.println("Mouse Dragged");
                    }

                    @Override
                    public void mouseMoved(MouseEvent e) {
                        System.out.println("Mouse Move");
                    }
                }
        );
    }
}
