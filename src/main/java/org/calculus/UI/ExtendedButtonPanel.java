package org.calculus.UI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import org.calculus.components.BaseSpezialButton;
import org.calculus.components.DisplayTextField;

public class ExtendedButtonPanel extends JPanel {
    

    public ExtendedButtonPanel(DisplayTextField displayTextField) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0); 
        Dimension buttonSize = new Dimension(100, 50);
        c.weightx = 1.0;
        c.weighty = 1.5;


        BaseSpezialButton[][] buttons = {
            { new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField), new BaseSpezialButton("G", displayTextField),},
            {new BaseSpezialButton("(", displayTextField), new BaseSpezialButton(")", displayTextField)}
            
        };

        for (int row = 0; row < buttons.length; row++) {
            for (int col = 0; col < buttons[row].length; col++) {
                c.gridx = col;
                c.gridy = row;
                buttons[row][col].setPreferredSize(buttonSize);

                add(buttons[row][col], c);
            }
        }

        setVisible(true);
    }
}
