package org.calculus.UI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CallculatorPanel extends JPanel {
    public CallculatorPanel() {
        JLabel label = new JLabel("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        this.add(label, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
