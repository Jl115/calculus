package org.calculus.UI;

import org.calculus.components.CallculationTextField;
import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallculatorPanel extends JPanel {
    private DisplayTextField displayTextField = new DisplayTextField();
    private CallculationTextField callculationTextField = new CallculationTextField();
    private ExtendedButtonPanel extendedButtonPanel ;

    public CallculatorPanel() {
        extendedButtonPanel = new ExtendedButtonPanel(displayTextField, callculationTextField);
        this.setBackground(new Color(0x13161B));

        this.setBorder(BorderFactory.createEmptyBorder(7, 7, 7, 7));
        
        // setting the layout of the panel
        this.setLayout(new BorderLayout());

        // Create a panel for the additional button and the display with a vertical
        // BoxLayout
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBackground(new Color(19, 22, 27));

        // Create a panel for centering the "History" button
        JPanel centeringPanel = new JPanel();
        centeringPanel.setLayout(new BoxLayout(centeringPanel, BoxLayout.X_AXIS));
        centeringPanel.setBackground(new Color(19, 22, 27));
        Component verticalGlue = Box.createVerticalGlue();
        centeringPanel.add(verticalGlue);
        centeringPanel.add(Box.createVerticalStrut(50));

        JButton historyButton = new JButton("History") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);

                g2.setColor(getForeground());
                g2.setFont(new Font("Arial", Font.BOLD, 14));
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
        };
        historyButton.setPreferredSize(new Dimension(100, 30));
        historyButton.setBackground(new Color(63, 140, 255));
        historyButton.setForeground(Color.WHITE);
        historyButton.setFont(new Font("Arial", Font.BOLD, 14));

        // ActionListener for the historyButton
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HistoryFrame historyFrame = new HistoryFrame();
                historyFrame.setVisible(true);
            }
        });
        // Hover and click effect
        historyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historyButton.setBackground(new Color(169, 212, 245)); // Change color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                historyButton.setBackground(new Color(63, 140, 255)); // Restore original color
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                historyButton.setBackground(new Color(40, 100, 200)); // Change color on click
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                historyButton.setBackground(new Color(169, 212, 245)); // Restore color after click
            }
        });

        historyButton.setFocusPainted(false);
        historyButton.setBorderPainted(false);
        historyButton.setContentAreaFilled(false);

        //centeringPanel.add(historyButton);

        // Add more horizontal glue to keep the button centered
        centeringPanel.add(Box.createHorizontalGlue());

        // Add the centering panel to the top panel
        topPanel.add(centeringPanel);

        // Adding a panel for the display
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
        displayPanel.setBackground(new Color(19, 22, 27));
        displayPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        displayTextField.setPreferredSize(new Dimension(400, 90));
        displayTextField.setEditable(false);
        displayPanel.add(displayTextField);

        // Add some vertical spacing between DisplayTextField and CalculationField
        displayPanel.add(Box.createVerticalStrut(4));

        // Create a textfield for the calculation
        callculationTextField.setPreferredSize(new Dimension(400, 50));
displayPanel.add(callculationTextField);

        // Create a panel for the Delete button
        JPanel deleteButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        deleteButtonPanel.setBackground(new Color(19, 22, 27));

        // Create the rounded Delete Button
        JButton deleteButton = new JButton("Delete") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);

                g2.setColor(getForeground());
                g2.setFont(new Font("Arial", Font.PLAIN, 14));
                FontMetrics metrics = g2.getFontMetrics();
                int x = (getWidth() - metrics.stringWidth(getText())) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g2.drawString(getText(), x, y);

                g2.dispose();
            }

            @Override
            protected void paintBorder(Graphics g) {
            }
        };
        deleteButton.setPreferredSize(new Dimension(80, 30));
        deleteButton.setBackground(new Color(151, 78, 195));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFont(new Font("Arial", Font.PLAIN, 14));

        deleteButton.addActionListener(e -> {
            String currentText = displayTextField.getText();
            if (!currentText.isEmpty()) {
                String updatedText = currentText.substring(0, currentText.length() - 1);
                displayTextField.setUpdatedValue(updatedText);
            }
        });

        // Hover and click effect
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButton.setBackground(new Color(191, 159, 205)); // Change color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButton.setBackground(new Color(151, 78, 195)); // Restore original color
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteButton.setBackground(new Color(120, 50, 150)); // Change color on click
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteButton.setBackground(new Color(191, 159, 205)); // Restore color after click
            }
        });
        deleteButton.setFocusPainted(false);
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);

        deleteButtonPanel.add(deleteButton);

        // Adding some vertical spacing between CalculationField and DeleteButton
        displayPanel.add(Box.createVerticalStrut(5));

        // Adding the Delete button panel to the main display panel
        displayPanel.add(deleteButtonPanel);

        // Adding the display panel to the top panel
        topPanel.add(displayPanel);

        // Adding some vertical spacing between the Delete button and the
        // BaseButtonPanel
        displayPanel.add(Box.createVerticalStrut(5));

        // Adding the top panel to the main panel
        this.add(topPanel, BorderLayout.PAGE_START);

        // adding extended buttons to the panel
        this.add(new ExtendedButtonPanel(displayTextField, callculationTextField), BorderLayout.LINE_START);

        // adding the BaseButtonPanel to the panel
        BaseButtonPanel BaseButtonPanel = new BaseButtonPanel(displayTextField, callculationTextField);
        this.add(BaseButtonPanel, BorderLayout.EAST);

        this.add(extendedButtonPanel, BorderLayout.LINE_START);

    }

}
