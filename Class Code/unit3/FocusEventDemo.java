//generated when any componet gain focus of key, mouse or any other input device

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Focuses extends JFrame{
    JLabel l1;
    JButton b1,b2;
    public void setFocus(){
        l1 = new JLabel("Focus Event");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        add(l1);
        add(b1);
        add(b2);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(3);
        b1.addFocusListener(new FocusListener() {
            //contains two method
            @Override
            public void focusGained(FocusEvent e) {
                l1.setText("Button 1 is focused");
            }

            @Override
            public void focusLost(FocusEvent e) {
                l1.setText("Button 1 is not focused");
            }
        });
       
    }
}

public class FocusEventDemo {
    public static void main(String[] args) {
        Focuses f1 = new Focuses();
        f1.setFocus();
        
    }
}
