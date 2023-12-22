package org.calculus.UI;

import javax.swing.*;
import java.awt.*;

public class CommaFrame extends JFrame {

    public CommaFrame() {

        CommaPanel commaPanel = new CommaPanel();

        setTitle("Nachkomma");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(commaPanel, BorderLayout.CENTER);

        // Set the preferred size before packing
        setPreferredSize(new Dimension(335, 567));
        pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
}
