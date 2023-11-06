package org.calculus.UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

import org.calculus.components.BaseButton;

public class CallculatorFrame extends JFrame {

    public CallculatorFrame() {
        CallculatorPanel panel = new CallculatorPanel();
        BaseButton button1 = new BaseButton();



        // adding components to the frame and setting the frame's properties
        this.setTitle("Callculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 800));
        this.add(panel, BorderLayout.CENTER);
        this.add(button1, BorderLayout.PAGE_END);
        this.pack();
        this.setVisible(true);
    }
}
