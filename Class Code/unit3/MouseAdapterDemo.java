// Using listener we have to use all the method defined by it but using adapter class we can use
// any method as per our need. FOr example: mouse listener contains 5 method and we have used all of that now using adapter 
//class we can use any of thrm

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MAdapter extends JFrame{
    JLabel l1;
    JTextArea t1;
    public void setMAdapter(){
        l1 = new JLabel("Result");
        t1 = new JTextArea(20, 20);
        t1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Mouse Clicked");
            }
        });
        add(l1); add(t1);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
}

public class MouseAdapterDemo {
    public static void main(String[] args) {
        MAdapter m = new MAdapter();
        m.setMAdapter();
    }
    
}
