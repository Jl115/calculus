package org.calculus.UI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.calculus.components.DisplayTextField;



public class CallculatorPanel extends JPanel {
    private DisplayTextField displayTextField = new DisplayTextField(); // Diese Referenz wird an ExtendedButtonPanel übergeben
    private ExtendedButtonPanel extendedButtonPanel;
    public CallculatorPanel() {
        //instantiating the components
         
        extendedButtonPanel = new ExtendedButtonPanel(displayTextField);
    
        // setting the layout of the panel
        this.setLayout(new BorderLayout());
        // adding components to the panel

        // adding a panel for the display
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout());

       displayPanel.add(displayTextField, BorderLayout.PAGE_START);

        JTextField calculationField = new JTextField("Calculation");
        calculationField.setHorizontalAlignment(JTextField.RIGHT); // align text to the right
        calculationField.setEditable(false);
        displayPanel.add(calculationField, BorderLayout.PAGE_END);

        // adding the display panel to the main panel
        this.add(displayPanel, BorderLayout.PAGE_START);
        // adding extended buttons to the panel
        this.add(extendedButtonPanel, BorderLayout.LINE_START);
        // adding the BaseButtonPanel to the panel
        BaseButtonPanel BaseButtonPanel = new BaseButtonPanel(displayTextField);
        this.add(BaseButtonPanel, BorderLayout.EAST);
    }
}
