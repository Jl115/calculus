package org.calculus.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistoryPanel extends JPanel {

    public HistoryPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(19, 22, 27));

        // Create a panel to hold the text fields and the button
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(19, 22, 27));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Color for the textfields
        Color textFieldColor = new Color(162, 148, 225, 96);

        // Create the textfields
        for (int i = 0; i < 10; i++) {
            JTextField textField = new JTextField() {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(textFieldColor);
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    g2.dispose();

                    super.paintComponent(g);
                }
            };
            textField.setPreferredSize(new Dimension(200, 30));
            textField.setEditable(false);
            textField.setOpaque(false);
            textField.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
            contentPanel.add(textField);
            contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        // Create the "Close History" button
        JButton closeButton = new JButton("Close History");
        closeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        closeButton.setMaximumSize(new Dimension(500, 40));
        closeButton.setPreferredSize(new Dimension(500, 40));
        closeButton.setBackground(new Color(80, 64, 153));
        closeButton.setForeground(Color.WHITE);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window parentWindow = SwingUtilities.windowForComponent(HistoryPanel.this);
                if (parentWindow instanceof JFrame) {
                    ((JFrame) parentWindow).dispose();
                }
            }
        });
        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        contentPanel.add(closeButton);

        // Add the content panel to the HistoryPanel
        add(contentPanel, BorderLayout.CENTER);
    }
}
