package org.calculus.UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import org.calculus.components.BaseSpezialButton;
import org.calculus.components.DisplayTextField;

public class ExtendedButtonPanel extends JPanel {
    
    // Konstruktor akzeptiert nun eine DisplayTextField-Instanz
    public ExtendedButtonPanel(DisplayTextField displayTextField) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 0); // Ein Rand von 5 Pixeln um die Buttons
        c.weightx = 1.0;
        c.weighty = 1.0;

        // Array der speziellen Buttons, die zu diesem Panel hinzugefügt werden
        BaseSpezialButton[][] buttons = {
            { new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField) },
            { new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField) },
            { new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField) },
            { new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField) },
            { new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField) },
            { new BaseSpezialButton("pi", displayTextField), new BaseSpezialButton("e", displayTextField), new BaseSpezialButton("w", displayTextField), new BaseSpezialButton("w", displayTextField) },
        };

        // Hinzufügen der Buttons zum Panel
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
