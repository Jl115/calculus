package org.calculus.UI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class CallculatorPanel extends JPanel {
    public CallculatorPanel() {
        // setting the layout of the panel
        this.setLayout(new BorderLayout());
        // adding components to the panel

        // adding a panel for the display
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout());

        // adding JTextField to the display panel
        JTextField displayField = new JTextField("Display");
        displayField.setHorizontalAlignment(JTextField.RIGHT); // align text to the right
        displayPanel.add(displayField, BorderLayout.PAGE_START);

        JTextField calculationField = new JTextField("Calculation");
        calculationField.setHorizontalAlignment(JTextField.RIGHT); // align text to the right
        displayPanel.add(calculationField, BorderLayout.PAGE_END);

        // adding the display panel to the main panel
        this.add(displayPanel, BorderLayout.PAGE_START);
        // adding extended buttons to the panel
        this.add(new ExtendedButtonPanel(), BorderLayout.LINE_START);
        // adding the BaseButtonPanel to the panel
        BaseButtonPanel BaseButtonPanel = new BaseButtonPanel();
        this.add(BaseButtonPanel, BorderLayout.EAST);
    }
}
