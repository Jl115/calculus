package org.calculus.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class HistoryPanel extends JPanel {

    public HistoryPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(19, 22, 27));

        // Custom font file path
        String customFontPath = ".\\SometypeMono-VariableFont_wght.ttf";

        // Create a panel to hold the text fields and the button
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(19, 22, 27));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Color for the text fields
        Color textFieldColor = new Color(162, 148, 225, 96);

        // Create the text fields
        for (int i = 0; i < 10; i++) {
            JTextField textField = new JTextField() {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(textFieldColor);
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    g2.dispose();

                    try {
                        Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(customFontPath)).deriveFont(Font.BOLD, 14);

                        g2.setColor(getForeground());
                        g2.setFont(customFont);
                        super.paintComponent(g);
                    } catch (IOException | FontFormatException e) {
                        e.printStackTrace();
                        g2.setColor(getForeground());
                        super.paintComponent(g);
                    }
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

                // Change font settings here
                try {
                    Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(customFontPath)).deriveFont(Font.BOLD, 14);

                    g2.setColor(getForeground());
                    g2.setFont(customFont);
                    FontMetrics metrics = g2.getFontMetrics();
                    int x = (getWidth() - metrics.stringWidth(getText())) / 2;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g2.drawString(getText(), x, y);
                } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
                    g2.setColor(getForeground());
                    super.paintComponent(g);
                }

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
        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        contentPanel.add(closeButton);

        // Add the content panel to the HistoryPanel
        add(contentPanel, BorderLayout.CENTER);
    }
}
