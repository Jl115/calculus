package org.calculus.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseButton extends JButton implements ActionListener {
    private DisplayTextField displayTextField;
    private Double value = 0.0;

    public BaseButton(String name, DisplayTextField displayTextField) {
        this.displayTextField = displayTextField;
        this.setText(name);
        this.addActionListener(this);
        // setValue(null); // Dies wird in setSpecialValue 
    }
    

    // private void setValue(String value) {
    //     if ("1".equalsIgnoreCase(getText())) {
    //         this.value = 1.0;
    //     } else if ("2".equalsIgnoreCase(getText())) {
    //         this.value = 2.0;
    //     } else if ("3".equalsIgnoreCase(getText())) {
    //         this.value = 3.0;
    //     } else if ("4".equalsIgnoreCase(getText())) {
    //         this.value = 4.0;
    //     } else if ("5".equalsIgnoreCase(getText())) {
    //         this.value = 5.0;
    //     } else if ("6".equalsIgnoreCase(getText())) {
    //         this.value = 6.0;
    //     } else if ("7".equalsIgnoreCase(getText())) {
    //         this.value = 7.0;
    //     } else if ("8".equalsIgnoreCase(getText())) {
    //         this.value = 8.0;
    //     } else if ("9".equalsIgnoreCase(getText())) {
    //         this.value = 9.0;
    //     }
    //     // } else if ("0".equalsIgnoreCase(getText())) {
    //     //     this.value = 0.0;
    //     // } else if (".".equalsIgnoreCase(getText())) {
    //     //     this.value = 0.0;
    //     // } else if ("AC".equalsIgnoreCase(getText())) {
    //     //     this.value = 0.0;
    //     // } else if ("+/-".equalsIgnoreCase(getText())) {
    //     //     this.value = 0.0;
    //     // } else if ("%".equalsIgnoreCase(getText())) {
    //     //     this.value = 0.0;
    //     // }
            
    //     }



    @Override
    public void actionPerformed(ActionEvent e) {
        displayTextField.setValue(this.getText().toString());
    }

}
