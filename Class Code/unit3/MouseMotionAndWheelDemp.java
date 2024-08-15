//Mouse motion is generated when mouse is dragged and moved
//Mouse whell event is generated when wheel of mouse is moved

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseExtra extends JFrame{
    JLabel l1;
    JTextArea t1;
    public void setMouseExtra(){
        l1 = new JLabel();
        t1 = new JTextArea(20, 20);
        add(l1); add(t1);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);
        t1.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                l1.setText("Mouse Dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                l1.setText("Mouse Moved");
            }
        });
    }
}


public class MouseMotionAndWheelDemp {
    public static void main(String[] args) {
        MouseExtra m1 = new MouseExtra();
        m1.setMouseExtra();
    }
    
}
