package org.calculus.basicOperations;

public class Subtraction {

    private String A;
    private double B;
    private String C;

    public Subtraction(String A) {
        this.A = A;
    }

    public String getSubtraction() {
        String[] express = A.split("\\-");
        for(String number: express) {
            B += Double.parseDouble(number);
        }
        this.C = A + " = "+String.valueOf(B);
        B = 0;
        return C;
    }
    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }
}
