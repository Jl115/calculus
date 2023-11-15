package org.calculus.bracketsAndChainBills;
import java.util.Stack;

public class MathExpressionEvaluator {
    private static String currentExpression = "";
    private static String currentResult = "";

    public static double calculate(String expression) {
        //Macht aus der String Expression einen Char Array und Initialisiert 2 Stacks
        //Ein Stack ist für die Zahlen und der andere für die Operationen zuständig.
        currentExpression = expression;
        char[] tokens = expression.toCharArray();
        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        //durchläuft den Character Array
        for (int i = 0; i < tokens.length; i++) {
            //Wenn eine Zahl zwischen 1 und 9 gefunden wird, wird ein Stringbuilder initialisiert
            if (tokens[i] >= '0' && tokens[i] <= '9'|| tokens[i] == '.') {
                StringBuilder sbuf = new StringBuilder();
                //Solange i eine Zahl abbildet wird sie diesem neu gebautem String hinzugefügt
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.') {
                    sbuf.append(tokens[i++]);
                }
                //der Zahlen String wird in den Value Stack gelegt und i um ein veringert um die for schleife weiter zu durchlaufen
                values.push(Double.parseDouble(sbuf.toString()));
                i--;
                //Wenn i eine öffnende klammer darstellt wird diese auf den ops stack gelegt
            } else if (tokens[i] == '(') {
                ops.push(tokens[i]);
                if (i > 0 && tokens[i - 1] >= '0' && tokens[i - 1] <= '9') {
                    ops.push('*');
                }
                //wird eine schliessende klammer gefunden, werden alle bisherigen operationen ausgeführt bis
                //eine öffnende klammer (indemfall der schluss der klammer) gefunden wird
            } else if (tokens[i] == ')') {
                while (ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                }
                ops.pop();
                //wenn i + - * oder / darstellt, wird geschaut ob der Operator priorität hat oder nicht
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(tokens[i]);
            }
        }

        while (!ops.empty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }
        double result = values.pop();
        currentResult = String.valueOf(result);
        return result;
    }
    //prüft den vorrang einer Opertaion
    public static boolean hasPrecedence(char op1, char op2) {
        //ist op 2 entweder eine öffnende oder schliessende klammer, hat diese keinen vorang und es wird false zurück gegeben
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        //ist die erste Operation kein * oder / oder die 2 Operation kein + oder - wird true zurück gegeben
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }
    //führt die Operationen auf basis eines Switchcases durch.
    public static double applyOp(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                else if (a == 0){
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
    public static String getExpressionAndResult(){

        return currentExpression + "=" + currentResult;
    }
    public static String getCurrentResult(){
        return currentResult;
    }

}