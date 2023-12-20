package org.calculus.components;

import javax.swing.JTextField;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DisplayTextField extends JTextField {

    private String value = "0.0";

    public DisplayTextField() {
        super(10);
        this.setEditable(false);
        this.setHorizontalAlignment(JTextField.RIGHT);
        setValue(value);
    }

    public void setValue(String value) {
        try {
            File fontFile = new File(".\\SometypeMono-VariableFont_wght.ttf");
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(Font.PLAIN, 24);

            if (this.value.equals("0.0")) {
                this.value = value;
                this.setText(value);
                this.setFont(customFont);
            } else {
                this.value += value;
                this.setText(this.value);
                this.setFont(customFont);
            }

            this.repaint();
            this.revalidate();
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            super.setName(value);
        }
    }

    public void setUpdatedValue(String value) {
        this.value = String.valueOf(value);
        this.setText(this.value);
        this.repaint();
        this.revalidate();
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
