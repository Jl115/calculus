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
        setPreferredSize(new Dimension(300, 100));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0); 
        Dimension buttonSize = new Dimension(100, 50);
        c.weightx = 1.0;
        c.weighty = 1.5;


        BaseSpezialButton[][] buttons = {
            { 
                /*new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField),/* */ new BaseSpezialButton("G", displayTextField), new BaseSpezialButton("(", displayTextField), new BaseSpezialButton(")", displayTextField)},

            
            // {new BaseSpezialButton("sin", displayTextField), new BaseSpezialButton("cos", displayTextField), new BaseSpezialButton("tan", displayTextField), new BaseSpezialButton("log", displayTextField)},
            
        };

        for (int row = 0; row < buttons.length; row++) {
            for (int col = 0; col < buttons[row].length; col++) {
                BaseSpezialButton button = buttons[row][col];
                String label = button.getText();

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
                buttons[row][col].setPreferredSize(buttonSize);

                add(buttons[row][col], c);
            }
        }

        setVisible(true);
    }
}
