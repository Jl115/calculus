package org.calculus.UI;

import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;

public class HistoryFrame extends JFrame {

    private HistoryPanel historyPanel;

    public HistoryFrame() {
        HistoryPanel historyPanel = new HistoryPanel(new DisplayTextField());

        setTitle("History");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(historyPanel, BorderLayout.CENTER);

        // Set the preferred size before packing
        setPreferredSize(new Dimension(335, 567));
        pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    public HistoryPanel getHistoryPanel() {
        return historyPanel;
    }
}
