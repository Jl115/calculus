package org.calculus.UI;

import org.calculus.components.BaseButton;
import org.calculus.components.CallculationTextField;
import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;


public class BaseButtonPanel extends JPanel {
    private DisplayTextField displayTextField;
    private CallculationTextField callculationTextField;
    private BaseButton[] buttons = new BaseButton[10];

    public BaseButtonPanel(DisplayTextField displayTextField, CallculationTextField callculationTextField2) {
        this.displayTextField = displayTextField;

        setLayout(new GridBagLayout());
        setBackground(new java.awt.Color(19, 22, 27));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 2, 2, 2);
        c.weightx = 1.0;
        c.weighty = 1.0;

        String[][] buttonLabels = {
            {"AC", "+/-", "%", "/"},
            {"7", "8", "9", "*"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "+"},
            {"+/-", "0", ".", "="}
        };

        for (int row = 0; row < buttonLabels.length; row++) {
            for (int col = 0; col < buttonLabels[row].length; col++) {
                String label = buttonLabels[row][col];

                BaseButton button = new BaseButton(label, displayTextField, callculationTextField);
                button.setBackground(new java.awt.Color(41, 46, 55));
                button.setForeground(Color.WHITE);

                // Hover and click effect
                button.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        if (label.equals("x") || label.equals("÷") || label.equals("-") || label.equals("+") || label.equals("=")) {
                            button.setBackground(new Color(191, 159, 205)); // Change color on hover for specific buttons
                        } else if (label.equals("AC")) {
                            button.setBackground(new Color(137, 114, 229)); // Different hover color for "AC" button
                        } else {
                            button.setBackground(new Color(90, 90, 90)); // Default hover color for other buttons
                        }
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        if (label.equals("x") || label.equals("÷") || label.equals("-") || label.equals("+") || label.equals("=")) {
                            button.setBackground(new Color(151, 78, 195)); // Specific color for certain buttons
                        } else if (label.equals("AC")) {
                            button.setBackground(new Color(80, 64, 153)); // Specific color for "AC" button
                        } else {
                            button.setBackground(new Color(41, 46, 55)); // Restore original color
                        }
                    }

                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        button.setBackground(new Color(30, 30, 30)); // General color for press
                        if (label.equals("x") || label.equals("÷") || label.equals("-") || label.equals("+") || label.equals("=")) {
                            button.setBackground(new Color(74, 35, 97)); // Specific color for certain buttons
                        } else if (label.equals("AC")) {
                            button.setBackground(new Color(61, 54, 131)); // Specific color for "AC" button
                        }
                    }

                    public void mouseReleased(java.awt.event.MouseEvent evt) {
                        if (label.equals("x") || label.equals("÷") || label.equals("-") || label.equals("+") || label.equals("=")) {
                            button.setBackground(new Color(191, 159, 205)); // Restore to hover color
                        } else if (label.equals("AC")) {
                            button.setBackground(new Color(137, 114, 229)); // Restore to hover color
                        } else {
                            button.setBackground(new Color(90, 90, 90)); // Restore to hover color
                        }
                    }
                });

                // Set specific buttons to specific colour
                if (label.equals("x") || label.equals("÷") || label.equals("-") || label.equals("+") || label.equals("=")) {
                    button.setBackground(new java.awt.Color(151, 78, 195));
                }
                if (label.equals("AC")) {
                    button.setBackground(new java.awt.Color(80, 64, 153));
                    button.addActionListener(e -> displayTextField.setValue(""));
                }

                // Set specific size for buttons in the specified rows and columns
                if (row == 4 || col == 3) {
                    button.setPreferredSize(new Dimension(100, 50));
                } else {
                    button.setPreferredSize(new Dimension(50, 50));
                }

                c.gridx = col;
                c.gridy = row;
                add(button, c);
            }
        }

        setVisible(true);
    }
}