package org.calculus.UI;

import org.calculus.components.BaseSpezialButton;
import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;

public class ExtendedButtonPanel extends JPanel {
    
    // Konstruktor akzeptiert nun eine DisplayTextField-Instanz
    public ExtendedButtonPanel(DisplayTextField displayTextField) {
        setLayout(new GridBagLayout());
        setBackground(new java.awt.Color(19, 22, 27));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 2, 2, 2);
        c.weightx = 1.0;
        c.weighty = 1.0;

        // Array der speziellen Buttons, die zu diesem Panel hinzugefügt werden
        BaseSpezialButton[][] buttons = {
            { new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("sqrroot", displayTextField) },
            { new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("log", displayTextField), new BaseSpezialButton("tan", displayTextField) },
            { new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("N!", displayTextField), new BaseSpezialButton("1/x", displayTextField) },
            { new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("X^2", displayTextField), new BaseSpezialButton("X^y", displayTextField) },
            { new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField) }
        };

        // Hinzufügen der Buttons zum Panel
        for (int row = 0; row < buttons.length; row++) {
            for (int col = 0; col < buttons[row].length; col++) {
                BaseSpezialButton button = buttons[row][col];
                String label = button.getLabel();

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

                // Set specific size for buttons in the specified rows and columns
                if (row == 4 || col == 3) {
                    buttons[row][col].setPreferredSize(new Dimension(100, 50)); // Set desired size
                } else {
                    buttons[row][col].setPreferredSize(new Dimension(50, 50)); // Set default size
                }

                // Customize font
                buttons[row][col].setFont(new Font("Arial", Font.PLAIN, 16));
                c.gridx = col;
                c.gridy = row;
                add(buttons[row][col], c);
            }
        }

        setVisible(true);
    }
}
