package org.calculus.components;

import javax.swing.*;
import java.awt.*;

import org.calculus.bracketsAndChainBills.MathExpressionEvaluator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

public class BaseButton extends JButton implements ActionListener {
    private DisplayTextField displayTextField;
    private CallculationTextField callculationTextField;

    private String value = "0.0";

    public BaseButton(String name, DisplayTextField displayTextField, CallculationTextField callculationTextField) {
        this.displayTextField = displayTextField;
        this.callculationTextField = callculationTextField;
        this.setText(name);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
        this.addActionListener(this);
        setValue(null); // Dies wird in setSpecialValue
    }

    public String setValue(String value) {
        if ("1".equalsIgnoreCase(getText())) {
            this.value = "1";
        } else if ("2".equalsIgnoreCase(getText())) {
            this.value = "2";
        } else if ("3".equalsIgnoreCase(getText())) {
            this.value = "3";
        } else if ("4".equalsIgnoreCase(getText())) {
            this.value = "4";
        } else if ("5".equalsIgnoreCase(getText())) {
            this.value = "5";
        } else if ("6".equalsIgnoreCase(getText())) {
            this.value = "6";
        } else if ("7".equalsIgnoreCase(getText())) {
            this.value = "7";
        } else if ("8".equalsIgnoreCase(getText())) {
            this.value = "8";
        } else if ("9".equalsIgnoreCase(getText())) {
            this.value = "9";
        } else if ("0".equalsIgnoreCase(getText())) {
            this.value = "0";
        } else if ("/".equalsIgnoreCase(getText())) {
            this.value = "/";
        } else if ("AC".equalsIgnoreCase(getText())) {
            this.value = "AC";
        } else if ("+/-".equalsIgnoreCase(getText())) {
            displayTextField.clear();
        } else if ("mod".equalsIgnoreCase(getText())) {
            this.value = "mod";
        } else if ("*".equalsIgnoreCase(getText())) {
            this.value = "*";
        } else if ("-".equalsIgnoreCase(getText())) {
            this.value = "-";
        } else if ("+".equalsIgnoreCase(getText())) {
            this.value = "+";
        } else if ("=".equals(getText())) {
            this.value = "=";
        } else if (".".equalsIgnoreCase(getText())) {
            this.value = ".";
        } else if ("pi".equalsIgnoreCase(getText())) {
            this.value = "3.14159265358979323846";
        } else if ("e".equalsIgnoreCase(getText())) {
            this.value = "2.7182818284590452354";
        } else {
            this.value = "0.0";
        }
        return value;

    }

    @Override
    protected void paintComponent(Graphics g) {
        try {
            //File fontFile = new File(".\\SometypeMono-VariableFont_wght.ttf");

            File fontFile = new File("../../../../../../SometypeMono-VariableFont_wght.ttf");
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(Font.PLAIN, 18);

            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, 15, 15));

            g2.setColor(getForeground());
            g2.setFont(customFont); // Set the custom font
            FontMetrics metrics = g2.getFontMetrics();
            int x = (getWidth() - metrics.stringWidth(getText())) / 2;
            int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
            g2.drawString(getText(), x, y);

            g2.dispose();
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            super.paintComponent(g); // If there's an error, fallback to default paintComponent
        }
    }

    @Override
    protected void paintBorder(Graphics g) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.value.equals("AC")) {
            displayTextField.clear();
            callculationTextField.clear();
        } else if (this.value.equals("=")) {
            Double result = MathExpressionEvaluator.calculate(displayTextField.getValue());
            System.out.println(result);
            if (!callculationTextField.getValue().isEmpty()) {
                callculationTextField.clear();
            }
            callculationTextField.setValue(result.toString());
        } else {
            displayTextField.setValue(this.value.toString());
        }
    }
}
