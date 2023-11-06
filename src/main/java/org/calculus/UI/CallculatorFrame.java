package org.calculus.UI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

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
