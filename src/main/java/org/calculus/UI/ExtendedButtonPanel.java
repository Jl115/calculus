package org.calculus.UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import org.calculus.components.BaseButton;
import org.calculus.components.BaseSpezialButton;

public class ExtendedButtonPanel extends JPanel {

    public ExtendedButtonPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0);
        c.weightx = 1.0;
        c.weighty = 1.0;

        BaseSpezialButton[][] buttons = {
                { new BaseSpezialButton("pi"), new BaseSpezialButton("e"), new BaseSpezialButton("w") },
                { new BaseSpezialButton("pi"), new BaseSpezialButton("e"), new BaseSpezialButton("w") },
                { new BaseSpezialButton("pi"), new BaseSpezialButton("e"), new BaseSpezialButton("w") },
                { new BaseSpezialButton("pi"), new BaseSpezialButton("e"), new BaseSpezialButton("w") },
        };

        // Set the special values for the special buttons
        ((BaseSpezialButton) buttons[0][0]).setSpecialValue(null); 
        ((BaseSpezialButton) buttons[0][1]).setSpecialValue(null); 
        ((BaseSpezialButton) buttons[0][2]).setSpecialValue(null); 

        for (int row = 0; row < buttons.length; row++) {
            for (int col = 0; col < buttons[row].length; col++) {
                c.gridx = col;
                c.gridy = row;
                add(buttons[row][col], c);
            }
        }

        setVisible(true); 
    }
}
