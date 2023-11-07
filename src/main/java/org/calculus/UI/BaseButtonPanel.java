package org.calculus.UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import org.calculus.components.BaseButton;

public class BaseButtonPanel extends JPanel {

    private BaseButton[] buttons = new BaseButton[10];

    public BaseButtonPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0,0, 0);
        c.weightx = 1.0;
        c.weighty = 1.0;

        String[][] buttonLabels = {
            {"AC", "+/-", "%", "/"},
            {"7", "8", "9", "x"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "+"},
            {"0", ".", "="}
        };

        for (int row = 0; row < buttonLabels.length; row++) {
            for (int col = 0; col < buttonLabels[row].length; col++) {
                String label = buttonLabels[row][col];
                BaseButton button = new BaseButton(label);
                c.gridx = col;
                c.gridy = row;
                add(button, c);
            }
        }

        setVisible(true);
    }
}