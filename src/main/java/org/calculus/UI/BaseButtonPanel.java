package org.calculus.UI;

import org.calculus.components.BaseButton;

import javax.swing.*;
import java.awt.*;

public class BaseButtonPanel extends JPanel {

    private BaseButton[] buttons = new BaseButton[10];

    public BaseButtonPanel() {
        setLayout(new GridBagLayout());
        setBackground(new java.awt.Color(19, 22, 27));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 2, 2, 2);
        c.weightx = 1.0;
        c.weighty = 1.0;

        String[][] buttonLabels = {
            {"AC", "()", "%", "÷"},
            {"7", "8", "9", "x"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "+"},
            {"+/-", "0", ".", "="}
        };

        for (int row = 0; row < buttonLabels.length; row++) {
            for (int col = 0; col < buttonLabels[row].length; col++) {
                String label = buttonLabels[row][col];
                BaseButton button = new BaseButton(label);
                button.setBackground(new java.awt.Color(41, 46, 55));
                button.setForeground(Color.WHITE);

                // Set specific buttons to specific colour
                if (label.equals("x") || label.equals("÷") || label.equals("-") || label.equals("+") || label.equals("=")) {
                    button.setBackground(new java.awt.Color(151, 78, 195));
                }
                if (label.equals("AC")) {
                    button.setBackground(new java.awt.Color(80, 64, 153));
                }

                // Set specific size for buttons in the specified rows and columns
                if (row == 4 || col == 3) {
                    button.setPreferredSize(new Dimension(100, 50)); // Set desired size
                } else {
                    button.setPreferredSize(new Dimension(50, 50)); // Set default size
                }

                // Customize font
                button.setFont(new Font("Arial", Font.PLAIN, 16));

                c.gridx = col;
                c.gridy = row;
                add(button, c);
            }
        }

        setVisible(true);
    }
}