package org.calculus.components;

import javax.swing.JTextField;

public class DisplayTextField extends JTextField {

    private String value = "0.0";

    public DisplayTextField() {
        super(10); 
        this.setHorizontalAlignment(JTextField.RIGHT); // align text to the right
        this.setEditable(false);
        setValue(value);
    }

    public void setValue(String value) {
        if (value.equals("0.0")) {
            this.value = value;
        this.setText(value);
        this.repaint();
        this.revalidate();
        } else if (this.value.contains("AC")) {
            this.value = "0.0";
            this.setText(value);
            this.repaint();
            this.revalidate();
        }
        else {
        this.value += value;
        this.setText(this.value + value);
        this.repaint();
        this.revalidate();
        }
        
    }

    public String getValue() {
        return value;
    }
}
