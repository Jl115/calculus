package org.calculus.bracketsAndChainBills;

import java.util.Stack;

public class ExpressionParser {

    public static double parse(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                int number = 0;
                while (Character.isDigit(c)) {
                    number = number * 10 + (c - '0');
                    i++;
                    if (i < expression.length()) {
                        c = expression.charAt(i);
                    } else {
                        break;
                    }
                }
                i--;
                numbers.push((double) number);
            } else if (c == '(') {
                operations.push(c);
            } else if (c == ')') {
                while (operations.peek() != '(') {
                    numbers.push(applyOp(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.pop();
            } else if (isOperator(c)) {
                while (!operations.isEmpty() && precedence(c) <= precedence(operations.peek())) {
                    numbers.push(applyOp(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(c);
            }
        }

        while (!operations.isEmpty()) {
            numbers.push(applyOp(operations.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private static double applyOp(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static void main(String[] args) {
        String expression = "10 + (2 * 3) - (1 / 5)";
        System.out.println("Result: " + parse(expression));
    }
}
