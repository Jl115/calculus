package org.calculus.UI;

import javax.swing.*;
import java.awt.*;

public class HistoryFrame extends JFrame {

    public HistoryFrame() {
        HistoryPanel historyPanel = new HistoryPanel();

        setTitle("History");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(historyPanel, BorderLayout.CENTER);

        // Set the preferred size before packing
        setPreferredSize(new Dimension(335, 567));

        // Pack the frame to fit its contents
        pack();

        // Ensure the frame is visible
        setVisible(true);
    }
}
