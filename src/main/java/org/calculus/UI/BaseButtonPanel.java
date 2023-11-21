package org.calculus.UI;

import org.calculus.components.BaseButton;
import org.calculus.components.DisplayTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class BaseButtonPanel extends JPanel {
    private DisplayTextField displayTextField;
    private BaseButton[] buttons = new BaseButton[10];

    public BaseButtonPanel(DisplayTextField displayTextField) {
        this.displayTextField = displayTextField;

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
                    button.addActionListener(e -> displayTextField.setValue(""));
                }

                // Set specific size for buttons in the specified rows and columns
                if (row == 4 || col == 3) {
                    button.setPreferredSize(new Dimension(100, 50));
                } else {
                    button.setPreferredSize(new Dimension(50, 50));
                }

                c.gridx = col;
                c.gridy = row;
                add(button, c);
            }
        }

        setVisible(true);
    }

    private BufferedImage createRoundButtonImage(int size, Color bgColor, Color textColor, String text) {
        BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(bgColor);
        g2.fill(new Ellipse2D.Double(0, 0, size - 1, size - 1));

        g2.setColor(textColor);
        g2.setFont(new Font("Arial", Font.PLAIN, size / 3));
        FontMetrics metrics = g2.getFontMetrics();
        int x = (size - metrics.stringWidth(text)) / 2;
        int y = ((size - metrics.getHeight()) / 2) + metrics.getAscent();
        g2.drawString(text, x, y);

        g2.dispose();
        return image;
    }
}