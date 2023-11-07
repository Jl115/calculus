package org.calculus.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseSpezialButton extends JButton implements ActionListener {
    private Double specialValue = 0.0;

    public BaseSpezialButton(String name) {
        super(name); 
        addActionListener(this);
    }

    public void setSpecialValue(Double specialValue) {
        if ("e".equals(getText())) {
            this.specialValue = Math.E;
        } else if ("pi".equals(getText())) {
            this.specialValue = Math.PI;
        } else {
            this.specialValue = specialValue;
        }
    }

    public Double getSpecialValue() {
        return specialValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(specialValue);
    }
}
