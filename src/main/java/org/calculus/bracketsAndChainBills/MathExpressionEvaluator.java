package org.calculus.bracketsAndChainBills;

import java.math.BigDecimal;
import java.util.Stack;

import org.calculus.calculate.ExtendedOperations;
import org.calculus.history.History;

public class MathExpressionEvaluator {
    private static String currentExpression = "0";
    private static String currentResult = "";
    private static ExtendedOperations extendedOperations = new ExtendedOperations();

    public static Double calculate(String expression) {
        currentExpression = expression;
        // Updated regex to split the expression into tokens
        String[] tokens = expression.split("(?<=[-+*/()])|(?=[-+*/()])|(?<=mod)|(?=mod)");
        Stack<Double> values = new Stack<>();
        Stack<String> ops = new Stack<>();
    
        for (int i = 0; i < tokens.length; i++) {
            // Debug: Print current token
            System.out.println("Token: " + tokens[i]);
    
            if (tokens[i].matches("[0-9.]+")) {
                values.push(Double.parseDouble(tokens[i]));
            } else if (tokens[i].equals("(")) {
                ops.push(tokens[i]);
            } else if (tokens[i].equals(")")) {
                while (!ops.isEmpty() && !ops.peek().equals("(")) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                if (!ops.isEmpty()) {
                    ops.pop();
                }
            } else if (tokens[i].matches("[+\\-*/]") || tokens[i].equals("mod")) {
                while (!ops.isEmpty() && hasPrecedence(tokens[i], ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(tokens[i]);
            }
    
            // Debug: Print stacks after each token
            System.out.println("Values stack: " + values);
            System.out.println("Ops stack: " + ops);
        }
    
        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }
    
        Double result = values.pop();
        currentResult = String.valueOf(result);
        // Adds the expression and its result to the history
        History.addValue(expression + " = "+ currentResult);
        return result;
    }
    
    
    
    

    // prüft den vorrang einer Opertaion
    public static boolean hasPrecedence(String tokens, String string) {
        // ist op 2 entweder eine öffnende oder schliessende klammer, hat diese keinen
        // vorang und es wird false zurück gegeben
        if (string.equals("(") || string.equals(")")) {
            return false;
        }
        // ist die erste Operation kein * oder / oder die 2 Operation kein + oder - wird
        // true zurück gegeben
        return (!tokens.equals("*") && !tokens.equals("/")) || (!string.equals("+") && !string.equals("-"));
    }

    // führt die Operationen auf basis eines Switchcases durch.
    public static Double applyOp(String op, Double b, Double a) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    return Double.NaN; // Return NaN if divisor is zero
                }
                return a / b;
            case "mod":
                if (b == 0) {
                    return Double.NaN;
                }
                System.out.println("a: " + a + ", b: " + b); // Debug statement
                return ExtendedOperations.modulo(a.intValue(), b.intValue());
        }
        return 0.0;
    }

    public static String getExpressionAndResult() {

        return currentExpression + "=" + currentResult;
    }

    public static String getCurrentResult() {
        return currentResult;
    }

}