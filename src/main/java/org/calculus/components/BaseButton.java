package org.calculus.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseButton extends JButton implements ActionListener {
    public BaseButton(String name) {
        this.setText(name);
        this.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.getText());
    }
}
