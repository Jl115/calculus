package org.calculus.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseSpezialButton extends JButton implements ActionListener {
    private Double specialValue = 0.0;
    private DisplayTextField displayTextField;

    public BaseSpezialButton(String name, DisplayTextField displayTextField) {
        super(name);
        this.displayTextField = displayTextField;
        addActionListener(this);

        // Setzen des speziellen Werts basierend auf dem Namen des Buttons
        setSpecialValue(null); // Dies wird in setSpecialValue abgefangen
    }

    public void setSpecialValue(Double specialValue) {
        if ("pi".equalsIgnoreCase(getText())) {
            this.specialValue = Math.PI;
        } else if ("e".equalsIgnoreCase(getText())) {
            this.specialValue = Math.E;
        } else if ("G".equalsIgnoreCase(getText())) {
            this.specialValue = 6.6743 ;
        }
         else {
            
        }
    }

    public Double getSpecialValue() {
        return specialValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayTextField.setValue(this.specialValue.toString());
    }
}
