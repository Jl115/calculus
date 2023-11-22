package org.calculus.components;

import javax.swing.*;
import java.awt.*;

import org.calculus.UI.CallculatorPanel;
import org.calculus.bracketsAndChainBills.MathExpressionEvaluator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class BaseButton extends JButton implements ActionListener {
    private DisplayTextField displayTextField;
    private CallculationTextField callculationTextField;

    private String value = "0.0";

    public BaseButton(String name, DisplayTextField displayTextField , CallculationTextField callculationTextField) {
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
        } else {
            this.value = "0.0";
        }
        return value;

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, 15, 15));

        g2.setColor(getForeground());
        g2.setFont(new Font("Arial", Font.PLAIN, 16));
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
        if (this.value.equals("AC")) {
            displayTextField.clear();
        } else if (this.value.equals("=")) {
            double result = MathExpressionEvaluator.calculate(displayTextField.getValue());
            System.out.println(result);
            if (!callculationTextField.getValue().isEmpty()) {
                callculationTextField.clear();
                
            }
            callculationTextField.setValue(Double.toString(result));
        } else {
            displayTextField.setValue(this.value.toString());
        }
    }

}
