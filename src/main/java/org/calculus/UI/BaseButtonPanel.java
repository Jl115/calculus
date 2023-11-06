package org.calculus.UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import org.calculus.components.BaseButton;

public class BaseButtonPanel extends JPanel {

    private BaseButton[] buttons = new BaseButton[10];

    public BaseButtonPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 2, 2, 2);
        c.weightx = 1.0;
        c.weighty = 1.0;

        // First row
        c.gridx = 0;
        c.gridy = 0;
        BaseButton cButton = new BaseButton("C");
        this.add(cButton, c);

        BaseButton dButton = new BaseButton("D");
        c.gridx = 1;
        this.add(dButton, c);

        BaseButton percentButton = new BaseButton("%");
        c.gridx = 2;
        this.add(percentButton, c);

        BaseButton divideButton = new BaseButton("/");
        c.gridx = 3;
        this.add(divideButton, c);

        // Second row
        BaseButton sevenButton = new BaseButton("7");
        c.gridx = 0;
        c.gridy = 1;
        this.add(sevenButton, c);

        BaseButton eightButton = new BaseButton("8");
        c.gridx = 1;
        this.add(eightButton, c);

        BaseButton nineButton = new BaseButton("9");
        c.gridx = 2;
        this.add(nineButton, c);

        BaseButton multiplyButton = new BaseButton("x");
        c.gridx = 3;
        this.add(multiplyButton, c);

        // Third row
        BaseButton fourButton = new BaseButton("4");
        c.gridx = 0;
        c.gridy = 2;
        this.add(fourButton, c);

        BaseButton fiveButton = new BaseButton("5");
        c.gridx = 1;
        this.add(fiveButton, c);

        BaseButton sixButton = new BaseButton("6");
        c.gridx = 2;
        this.add(sixButton, c);

        BaseButton subtractButton = new BaseButton("-");
        c.gridx = 3;
        this.add(subtractButton, c);

        // Fourth row
        BaseButton oneButton = new BaseButton("1");
        c.gridx = 0;
        c.gridy = 3;
        this.add(oneButton, c);

        BaseButton twoButton = new BaseButton("2");
        c.gridx = 1;
        this.add(twoButton, c);

        BaseButton threeButton = new BaseButton("3");
        c.gridx = 2;
        this.add(threeButton, c);

        BaseButton addButton = new BaseButton("+");
        c.gridx = 3;
        this.add(addButton, c);

        // Fifth row
        BaseButton zeroButton = new BaseButton("0");
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        this.add(zeroButton, c);

        BaseButton decimalButton = new BaseButton(".");
        c.gridx = 2;
        c.gridwidth = 1;
        this.add(decimalButton, c);

        BaseButton equalsButton = new BaseButton("=");
        c.gridx = 3;
        this.add(equalsButton, c);

        this.setVisible(true);
    }
}