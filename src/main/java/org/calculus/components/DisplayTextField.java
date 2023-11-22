package org.calculus.components;

import javax.swing.JTextField;

public class DisplayTextField extends JTextField {

    private String value = "0.0";

    public DisplayTextField() {
        super(10); 

        this.setEditable(false);
        this.setHorizontalAlignment(JTextField.RIGHT);

        setValue(value);
    }

    public void setValue(String value) {
        if (this.value.equals("0.0")) {
        this.value = value;
        this.setText(value);
        this.repaint();
        this.revalidate();
        } 
        else {
        this.value += value;
        this.setText(this.value );
        this.repaint();
        this.revalidate();
        }
        
    }
    public void clear() {
        System.out.println("Clear method called"); // Zum Debuggen
        this.value = "0.0"; // Setzt den internen Wert
        this.setText("0.0"); // Aktualisiert den Text im Textfeld
        this.repaint();
        this.revalidate();
    }
    

    public String getValue() {
        return value;
    }
}
