package org.calculus;


import history.Addition;
import history.History;

import java.util.ArrayList;

import org.calculus.UI.*;


public class Main {

    public static void main(String[] args) {

        Addition addition = new Addition("5+5+5");
        Addition addition1 = new Addition("6+8+20+16+55");
        History history = new History();

        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        ArrayList<String> historyia = history.getHistory();
        for (String value : historyia) {
            System.out.println(value);
        }

        new CallculatorFrame();

    }
}
