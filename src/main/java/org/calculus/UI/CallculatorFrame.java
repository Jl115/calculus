package org.calculus.UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class CallculatorFrame extends JFrame {

    public CallculatorFrame() {
        CallculatorPanel panel = new CallculatorPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 800));
        this.add(panel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }
}
