package org.calculus.UI;

import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CallculatorPanel extends JPanel {

    // This will be references in ExtendedButtonPanel
    private DisplayTextField displayTextField;

    public CallculatorPanel() {
        displayTextField = new DisplayTextField();
        this.setBackground(new Color(0x13161B)); // Hex color #13161B

        // setting the layout of the panel
        this.setLayout(new BorderLayout());

        // Create a panel for the additional button and the display with a vertical BoxLayout
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBackground(new Color(19, 22, 27));

        // Adding some vertical spacing between 
        topPanel.add(Box.createVerticalStrut(5));

        // Create a panel for centering the "History" button
        JPanel centeringPanel = new JPanel();
        centeringPanel.setLayout(new BoxLayout(centeringPanel, BoxLayout.X_AXIS));
        Component verticalGlue = Box.createVerticalGlue();
        centeringPanel.add(verticalGlue);

        // Add the "History" button to the centering panel
        JButton historyButton = new JButton("History");
        centeringPanel.add(historyButton);

        // ActionListener for the historyButton
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create and display the HistoryFrame when the historyButton is clicked
                HistoryFrame historyFrame = new HistoryFrame();
                historyFrame.setVisible(true);
            }
        });

        // Add the centering panel to the top panel
        topPanel.add(centeringPanel);

        // Adding a panel for the display
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
        displayPanel.setBackground(new Color(19, 22, 27));
        displayTextField.setPreferredSize(new Dimension(400, 90));
        displayPanel.add(displayTextField);

        // Add some vertical spacing between DisplayTextField and CalculationField
        displayPanel.add(Box.createVerticalStrut(2));

        // Create a textfield for the calculation
        JTextField calculationField = new JTextField("Calculation");
        calculationField.setHorizontalAlignment(JTextField.RIGHT);
        calculationField.setPreferredSize(new Dimension(400, 50));
        displayPanel.add(calculationField);

        // Create a panel for the Delete button
        JPanel deleteButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        deleteButtonPanel.setBackground(new Color(19, 22, 27));
        JButton deleteButton = new JButton("Delete");
        deleteButton.setPreferredSize(new Dimension(80, 30));
        deleteButton.addActionListener(e -> {
            String currentText = displayTextField.getText();
            if (!currentText.isEmpty()) {
                String updatedText = currentText.substring(0, currentText.length() - 1);
                displayTextField.setText(updatedText);
            }
        });
        deleteButtonPanel.add(deleteButton);

        // Adding some vertical spacing between CalculationField and DeleteButton
        displayPanel.add(Box.createVerticalStrut(5));

        // Adding the Delete button panel to the main display panel
        displayPanel.add(deleteButtonPanel);

        // Adding the display panel to the top panel
        topPanel.add(displayPanel);

        // Adding some vertical spacing between the Delete button and the BaseButtonPanel
        displayPanel.add(Box.createVerticalStrut(5));

        // Adding the top panel to the main panel
        this.add(topPanel, BorderLayout.PAGE_START);

        // adding extended buttons to the panel
        this.add(new ExtendedButtonPanel(displayTextField), BorderLayout.LINE_START);
        // adding the BaseButtonPanel to the panel
        BaseButtonPanel BaseButtonPanel = new BaseButtonPanel();
        this.add(BaseButtonPanel, BorderLayout.EAST);
    }
}
