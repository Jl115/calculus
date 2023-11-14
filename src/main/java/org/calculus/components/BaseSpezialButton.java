package org.calculus.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseSpezialButton extends JButton implements ActionListener {
    private String specialValue = "";
    private DisplayTextField displayTextField;
    private final String eulisch = "2.7182818284590452354";
    private final String pi = "3.14159265358979323846";
    private final String G = "6.6743";

    public BaseSpezialButton(String name, DisplayTextField displayTextField) {
        super(name);
        this.displayTextField = displayTextField;
        addActionListener(this);

        // Setzen des speziellen Werts basierend auf dem Namen des Buttons
        setSpecialValue(null); // Dies wird in setSpecialValue abgefangen
    }

    public void setSpecialValue(String specialValue) {
        if ("pi".equalsIgnoreCase(getText())) {
            this.specialValue = pi;
        } else if ("e".equalsIgnoreCase(getText())) {
            this.specialValue = eulisch;
        } else if ("G".equalsIgnoreCase(getText())) {
            this.specialValue = G ;
        } else if ("(".equalsIgnoreCase(getText())) {
            this.specialValue = "(";
        } else if (")".equalsIgnoreCase(getText())) {
            this.specialValue = ")";
        } 
        else {
            
        }
    }

    public String getSpecialValue() {
        return specialValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayTextField.setValue(this.specialValue.toString());
    }
}
