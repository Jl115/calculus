package org.calculus.UI;

import org.calculus.history.History;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class HistoryPanel extends JPanel {

    private ArrayList<JTextField> historyFields;

    public HistoryPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(19, 22, 27));

        historyFields = new ArrayList<>();

        // Custom font file path
        String customFontPath = ".\\SometypeMono-VariableFont_wght.ttf";

        // Create a panel to hold the text fields and the button
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(19, 22, 27));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create and add text fields
        for (int i = 0; i < History.getHistory().size(); i++) {
            // Create a new JTextField and set its initial text to the historical value at index 'i'
            JTextField textField = new JTextField(History.getHistory().get(i), 10);
            textField.setEditable(false);
            textField.setHorizontalAlignment(JTextField.CENTER);

            historyFields.add(textField);
            contentPanel.add(textField);

            // Add vertical spacing between textfields
            if (i < History.getHistory().size() - 1) {
                contentPanel.add(Box.createVerticalStrut(5));
            }
        }

        // Create the "Close History" button
        JPanel closeButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        closeButtonPanel.setBackground(new Color(19, 22, 27));
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
        closeButton.setPreferredSize(new Dimension(290, 40));
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

        closeButtonPanel.add(closeButton);
        closeButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        contentPanel.add(Box.createVerticalGlue());
        contentPanel.add(closeButtonPanel);

        // Add the content panel and close button panel to the HistoryPanel
        add(contentPanel, BorderLayout.CENTER);
        add(closeButtonPanel, BorderLayout.SOUTH);
    }
}

