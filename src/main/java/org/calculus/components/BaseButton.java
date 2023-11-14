package org.calculus.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseButton extends JButton implements ActionListener {
    private DisplayTextField displayTextField;
    private String value = "0.0";

    public BaseButton(String name, DisplayTextField displayTextField) {
        this.displayTextField = displayTextField;
        this.setText(name);
        this.addActionListener(this);
        setValue(null); // Dies wird in setSpecialValue
    }

    public void setValue(String value) {
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
        } else if ("%".equalsIgnoreCase(getText())) {
            this.value = "%";
        } else if ("x".equalsIgnoreCase(getText())) {
            this.value = "x";
        } else if ("-".equalsIgnoreCase(getText())) {
            this.value = "-";
        } else if ("+".equalsIgnoreCase(getText())) {
            this.value = "+";
        } else if ("=".equalsIgnoreCase(getText())) {
            this.value = "=";
        } else {
            this.value = "0.0";
        }

    }

    //TODO implementing methods for calculating results
    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.value.equals("AC")) {
            displayTextField.clear();
        }else if (this.value.equals(equals("="))) {

        }
        else {
            displayTextField.setValue(this.value.toString());
        }
    }

}
