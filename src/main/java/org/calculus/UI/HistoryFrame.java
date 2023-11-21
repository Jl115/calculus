package org.calculus.UI;

import javax.swing.*;
import java.awt.*;

public class HistoryFrame extends JFrame {

    public HistoryFrame() {

        setTitle("History");
        this.setPreferredSize(new Dimension(335, 567));

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        HistoryPanel historyPanel = new HistoryPanel();

        add(historyPanel, BorderLayout.CENTER);
        
    }
}