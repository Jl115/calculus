package org.calculus.components;

import javax.swing.JTextField;

public class CallculationTextField extends JTextField{
     private String value = "calculation";

    public CallculationTextField() {
        super(10); 
        this.setHorizontalAlignment(JTextField.RIGHT); // align text to the right
        this.setEditable(false);
        setValue(value);
    }

    public void setValue(String value) {
        if (this.value.equals("calculation")) {
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
        this.value = ""; // Setzt den internen Wert
        this.setText(""); // Aktualisiert den Text im Textfeld
        this.repaint();
        this.revalidate();
    }
    

    public String getValue() {
        return value;
    }
}
