package org.calculus.UI;

import javax.swing.*;
import java.awt.*;



public class CallculatorFrame extends JFrame {

    public CallculatorFrame() {
        CallculatorPanel panel = new CallculatorPanel();

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setPreferredSize(new Dimension(950, 600 ));
        this.setMinimumSize(new Dimension(600, 300 ));
        this.setMaximumSize(new Dimension(1000, 700 ));

        this.add(panel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }
}
