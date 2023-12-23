package org.calculus.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class CommaPanel extends JPanel {



    public CommaPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(19, 22, 27));



        // Custom font file path
         String customFontPath = ".\\SometypeMono-VariableFont_wght.ttf";
        //String customFontPath = "../../../../../../SometypeMono-VariableFont_wght.ttf";

        // Create a panel to hold the text fields and the button
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(19, 22, 27));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create the "OK button
        JPanel okButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        okButton.setBackground(new Color(19, 22, 27));
        JButton closeComma = new JButton("OK") {
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
        closeComma.setPreferredSize(new Dimension(290, 40));
        closeComma.setBackground(new Color(80, 64, 153));
        closeComma.setForeground(Color.WHITE);
        closeComma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window parentWindow = SwingUtilities.windowForComponent(CommaPanel.this);
                if (parentWindow instanceof JFrame) {
                    ((JFrame) parentWindow).dispose();
                }
            }
        });

        okButton.add(closeComma);
        okButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        contentPanel.add(Box.createVerticalGlue());
        contentPanel.add(okButton);

        // Add the content panel and close button panel to the HistoryPanel
        add(contentPanel, BorderLayout.CENTER);
        add(okButton, BorderLayout.SOUTH);
    }
}

