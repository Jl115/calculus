package org.calculus.UI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import org.calculus.components.BaseSpezialButton;
import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;

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
                        new BaseSpezialButton("Zylinder", displayTextField),
                        new BaseSpezialButton("pyramide", displayTextField),
                        new BaseSpezialButton("winkel", displayTextField) }
        };

        Dimension buttonSize = new Dimension(80, 50);

        // Set common preferred size for all buttons
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
                c.gridx = col;
                c.gridy = row;
                add(button, c);
            }
        }

        setVisible(true);
    }
}

