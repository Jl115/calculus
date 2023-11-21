package org.calculus.components;

import javax.swing.JTextField;

public class DisplayTextField extends JTextField {

    private String value = "0.0";

    public DisplayTextField() {
        super(10); 
        this.setHorizontalAlignment(JTextField.RIGHT);

        setValue(value);
    }

    public void setValue(String value) {
        this.value = value;
        this.setText(value);
        this.repaint();
        this.revalidate();
    }

    public String getValue() {
        return value;
    }
}
