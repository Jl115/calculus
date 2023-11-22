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
        JButton closeButton = new JButton("Close History") {
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

        // Hover and click effect
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButton.setBackground(new Color(171, 160, 213)); // Change color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButton.setBackground(new Color(80, 64, 153)); // Restore original color
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeButton.setBackground(new Color(41, 28, 98)); // Change color on click
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeButton.setBackground(new Color(171, 160, 213)); // Restore color after click
            }
        });

        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        contentPanel.add(closeButton);

        // Add the content panel to the HistoryPanel
        add(contentPanel, BorderLayout.CENTER);
    }
}
