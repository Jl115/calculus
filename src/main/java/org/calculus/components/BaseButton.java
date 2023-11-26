package org.calculus.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class BaseButton extends JButton implements ActionListener {
    private int fontSize;

    public BaseButton(String name) {
        this(name, 20);
    }

    public BaseButton(String name, int fontSize) {
        this.fontSize = fontSize;
        this.setText(name);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
        this.addActionListener(this);
        this.setVisible(true);
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, 15, 15));

        g2.setColor(getForeground());
        g2.setFont(new Font("Arial", Font.PLAIN, fontSize));
        FontMetrics metrics = g2.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth(getText())) / 2;
        int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.getText());
    }
}

