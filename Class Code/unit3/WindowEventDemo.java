// Window event is genrated when window is opened,
// running, closing, iconified, deiconified, activated, deactivated

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowEg{
    JFrame f;
    public void setWindow(){
        f = new JFrame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(3);
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //when window is closed using tab bar
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //when window is minimized
                System.out.println("Window Minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //when window is maximized
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //when window is selected
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //when window is deselected
                System.out.println("Window Deactivated");
            }
        });
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        WindowEg w = new WindowEg();
        w.setWindow();
    }
    
}
