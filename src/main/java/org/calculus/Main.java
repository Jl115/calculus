package org.calculus;

import org.calculus.UI.CallculatorFrame;
import org.calculus.bracketsAndChainBills.MathExpressionEvaluator;
import org.calculus.history.Addition;
import org.calculus.history.History;

import java.net.StandardSocketOptions;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        System.out.println(MathExpressionEvaluator.calculate("5.36+5*5+(8*3)"));
    }
   
}
