//Window listener contains 7 method and all should be compulory used as listener is interfcae
//Using window adapter, we can use any method out of 7

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowAdapt {
    public void setWin(){
        JFrame f1 = new JFrame();
        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(3);
        f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window minimized");
            }
        });
    }
}

public class WindowAdapterDemo {
    public static void main(String[] args) {
        WindowAdapt w1 = new WindowAdapt();
        w1.setWin();
    }
    
}
