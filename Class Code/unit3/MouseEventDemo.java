//For every action like clicking button, using mouse etc event is generated.
//For every event, listener is used to listen such event. Listener is an interfcae that contains
// list of method to handle events. If listenr is used then all the method defined by it should be compulaory.
//This is known as delegation event method.
//button -> action event
//radio button -> action event
//checkbox -> action event and item event
//combobox -> action event and itrm event
//list -> action event and item event
//mouse event -> generated when mouse is clicked

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseExample extends JFrame{
    JLabel l1;
    JTextField t1;
    public void setMouse(){
        l1 = new JLabel ("Result");
        t1 = new JTextField(20);
        //when some action is performed in t1
        t1.addMouseListener(new MouseListener() {
            //it contains 5 method and all method should be used
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l1.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // when mouse is clicked insode comp and released outside comp
                l1.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("Mouse Entered in " + e.getX() + " ," + e.getY());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l1.setText("Mouse Exixted");
            }

        });
        add(l1); add(t1);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
}

public class MouseEventDemo{
    public static void main(String[] args) {
        MouseExample m = new MouseExample();
        m.setMouse();
        m.setSize(400,400);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}