package org.calculus.UI;

import javax.swing.*;
import java.awt.*;



public class CallculatorFrame extends JFrame {

    public CallculatorFrame() {
        CallculatorPanel panel = new CallculatorPanel();

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setPreferredSize(new Dimension(950, 600 ));
        this.setMinimumSize(new Dimension(  850, 600));
        this.setMaximumSize(new Dimension(1200, 800 ));

        this.add(panel, BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
