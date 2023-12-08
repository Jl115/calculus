package org.calculus.UI;

import org.calculus.components.BaseSpezialButton;
import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExtendedButtonPanel extends JPanel {

    public ExtendedButtonPanel(DisplayTextField displayTextField) {
        setLayout(new GridBagLayout());
        setBackground(new java.awt.Color(19, 22, 27));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 2, 2, 2);
        c.weightx = 1.0;
        c.weighty = 1.0;

        BaseSpezialButton[][] buttons = {
                { new BaseSpezialButton("pi", displayTextField),
                        new BaseSpezialButton("e", displayTextField),
                        new BaseSpezialButton("G", displayTextField),
                        new BaseSpezialButton("(", displayTextField),
                        new BaseSpezialButton(")", displayTextField) },
                { new BaseSpezialButton("Kugel", displayTextField),
                        new BaseSpezialButton("kegel", displayTextField),
                        new BaseSpezialButton("Zylin", displayTextField),
                        new BaseSpezialButton("pyra", displayTextField),
                        new BaseSpezialButton("winkel", displayTextField) }
        };

        // Load the font
        Font sometypeFont = loadFont();
        if (sometypeFont != null) {
            Font sizedFont = sometypeFont.deriveFont(Font.PLAIN, 18);

            Dimension buttonSize = new Dimension(75, 50);

            // Set common preferred size and font for all buttons
            for (int row = 0; row < buttons.length; row++) {
                for (int col = 0; col < buttons[row].length; col++) {
                    BaseSpezialButton button = buttons[row][col];
                    button.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            button.setBackground(new Color(90, 90, 90)); // Default hover color for other buttons
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            button.setBackground(new Color(41, 46, 55)); // Restore original color
                        }

                        public void mousePressed(java.awt.event.MouseEvent evt) {
                            button.setBackground(new Color(30, 30, 30)); // General color for press
                        }

                        public void mouseReleased(java.awt.event.MouseEvent evt) {
                            button.setBackground(new Color(90, 90, 90)); // Restore to hover color
                        }
                    });

                    button.setPreferredSize(buttonSize);
                    button.setFont(sizedFont);
                    c.gridx = col;
                    c.gridy = row;
                    add(button, c);
                }
            }
        }

        setVisible(true);
    }

    // Method to load the font
    private Font loadFont() {
        Font sometypeFont = null;
        try {
            File fontFile = new File(".\\SometypeMono-VariableFont_wght.ttf");
            if (fontFile.exists()) {
                sometypeFont = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            } else {
                System.err.println("Font file not found!");
            }
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        return sometypeFont;
    }
}
