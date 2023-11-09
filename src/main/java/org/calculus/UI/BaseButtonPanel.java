package org.calculus.UI;

import java.awt.*;

import javax.swing.JPanel;

import org.calculus.components.BaseButton;

public class BaseButtonPanel extends JPanel {

    private BaseButton[] buttons = new BaseButton[10];

    public BaseButtonPanel() {
        setLayout(new GridBagLayout());
        setBackground(new java.awt.Color(19, 22, 27));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 2,2, 2);
        c.weightx = 1.0;
        c.weighty = 1.0;

        String[][] buttonLabels = {
            {"AC", "C", "%", "÷"},
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
                c.gridx = col;
                c.gridy = row;
                add(button, c);
            }
        }

        setVisible(true);
    }
}