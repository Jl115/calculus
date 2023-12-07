package org.calculus.components;

import javax.swing.*;

import org.calculus.calculate.ExtendedOperations;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class BaseSpezialButton extends JButton implements ActionListener {
    private String specialValue = "";
    private DisplayTextField displayTextField;
    private CallculationTextField callculationTextField;
    private final String eulisch = "2.7182818284590452354";
    private final String pi = "3.14159265358979323846";
    private final String G = "6.6743";
    ExtendedOperations extendedOperations = new ExtendedOperations();

    public BaseSpezialButton(String name, DisplayTextField displayTextField,
            CallculationTextField callculationTextField) {
        super(name);
        this.displayTextField = displayTextField;
        this.callculationTextField = callculationTextField;
        addActionListener(this);
        setButtonProperties();

        // Setzen des speziellen Werts basierend auf dem Namen des Buttons
        setSpecialValue(null); // Dies wird in setSpecialValue abgefangen
    }

    private void setButtonProperties() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setPreferredSize(new Dimension(50, 50));
        setFont(new Font("Arial", Font.PLAIN, 16));
        setForeground(Color.WHITE);
        setBackground(new java.awt.Color(41, 46, 55));
    }

    public void setSpecialValue(String specialValue) {
        if ("pi".equalsIgnoreCase(getText())) {
            this.specialValue = pi;
        } else if ("e".equalsIgnoreCase(getText())) {
            this.specialValue = eulisch;
        } else if ("G".equalsIgnoreCase(getText())) {
            this.specialValue = G;
        } else if ("(".equalsIgnoreCase(getText())) {
            this.specialValue = "(";
        } else if (")".equalsIgnoreCase(getText())) {
            this.specialValue = ")";
        } else if ("√".equalsIgnoreCase(getText())) {
            try {
                double value = Double.valueOf(displayTextField.getText());
                String result = extendedOperations.squareRoot(value);
                System.out.println("Berechnete Wurzel von " + value + " ist " + result);
                this.specialValue = result;
            } catch (NumberFormatException ex) {
                System.out.println("Fehler bei der Konvertierung: " + ex.getMessage());
                this.specialValue = "Ungültige Eingabe";
            }
        } else if ("sin".equalsIgnoreCase(getText())) {
            this.specialValue = "sin";
        } else if ("cos".equalsIgnoreCase(getText())) {
            this.specialValue = "cos";
        } else if ("tan".equalsIgnoreCase(getText())) {
            this.specialValue = "tan";
        } else if ("log".equalsIgnoreCase(getText())) {
            this.specialValue = "log";
        } else if ("ln".equalsIgnoreCase(getText())) {
            this.specialValue = "ln";
        } else if ("^".equalsIgnoreCase(getText())) {
            this.specialValue = "^";
        } else if ("!".equalsIgnoreCase(getText())) {
            this.specialValue = "!";
        } else if ("x".equalsIgnoreCase(getText())) {
            this.specialValue = "x";
        } else if ("y".equalsIgnoreCase(getText())) {
            this.specialValue = "y";
        } else {

        }
    }

    public String getSpecialValue() {
        return specialValue;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, 15, 15));

        g2.setColor(getForeground());
        g2.setFont(getFont());
        FontMetrics metrics = g2.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth(getText())) / 2;
        int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Do not paint a border
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == this && "√".equalsIgnoreCase(getText())) {
        try {
            double value = Double.valueOf(displayTextField.getText());
            String result = extendedOperations.squareRoot(value);
            // Leeren des callculationTextField vor dem Setzen des neuen Wertes
            this.callculationTextField.setText("");
            this.callculationTextField.setText(result);
        } catch (NumberFormatException ex) {
            displayTextField.setText("Ungültige Eingabe");
            // Optional: Leeren des callculationTextField, wenn ein Fehler auftritt
            this.callculationTextField.setText("");
        }
    }
}

}
