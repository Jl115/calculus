package org.calculus.UI;

import javax.swing.*;
import java.awt.*;

public class HistoryPanel extends JPanel {

    public HistoryPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(19, 22, 27));

        // Create a panel to hold the text fields and the button
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(19, 22, 27));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create and add 10 text fields with preferred size
        for (int i = 0; i < 10; i++) {
            JTextField textField = new JTextField();
            textField.setPreferredSize(new Dimension(200, 30));
            contentPanel.add(textField);
            contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        // Create the "Close History" button
        JButton closeButton = new JButton("Close History");
        closeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        closeButton.setMaximumSize(new Dimension(500, 40));
        closeButton.setPreferredSize(new Dimension(500, 40));
        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        contentPanel.add(closeButton);

        // Add the content panel to the HistoryPanel
        add(contentPanel, BorderLayout.CENTER);
    }
}
