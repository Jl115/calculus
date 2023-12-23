package org.calculus.components;

import javax.swing.JTextField;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CallculationTextField extends JTextField{
     private String value = "calculation";

    public CallculationTextField() {
        super(10); 
        this.setHorizontalAlignment(JTextField.RIGHT);
        this.setEditable(false);
        setValue(value);
    }

    public void setValue(String value) {
        try {
            // File fontFile = new File("../../../../../../SometypeMono-VariableFont_wght.ttf");
            File fontFile = new File(".\\SometypeMono-VariableFont_wght.ttf");
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(Font.PLAIN, 18);

            if (this.value.equals("calculation")) {
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

    public void clear() {
        System.out.println("Clear method called"); // Zum Debuggen
        this.value = ""; // Setzt den internen Wert
        this.setText(""); // Aktualisiert den Text im Textfeld
        this.repaint();
        this.revalidate();
    }
    

    public String getValue() {
        System.out.println("getValue method called"); // Zum Debuggen
        return value;
    }
}
