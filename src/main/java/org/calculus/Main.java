package org.calculus;

import java.util.ArrayList;

import org.calculus.UI.*;
import org.calculus.basicOperations.Addition;
import org.calculus.basicOperations.Subtraction;
import org.calculus.history.History;


public class Main {

    public static void main(String[] args) {
        Addition addition = new Addition("5+5+5");
        Addition addition1 = new Addition("6+8+20+16+55");
        Subtraction subtraction = new Subtraction("10-5");
        History history = new History();

        history.addValue(addition.getAddition());
        history.addValue(addition1.getAddition());
        history.addValue(addition.getAddition());
        history.addValue(addition1.getAddition());
        history.addValue(addition.getAddition());
        history.addValue(addition1.getAddition());
        history.addValue(addition.getAddition());
        history.addValue(addition1.getAddition());
        history.addValue(addition.getAddition());
        history.addValue(addition1.getAddition());
        history.addValue(addition1.getAddition());
        history.addValue(addition.getAddition());
        history.addValue(subtraction.getSubtraction());
        ArrayList<String> historyia = history.getHistory();
        for (String value : historyia) {
            System.out.println(value);
        }

        new CallculatorFrame();

    }
   
}
