package org.calculus.basicOperations;

public class BasicOperations {

    private static double addition(double a, double b){
        double result = a + b;
        return result;
    }

    private static double subtraktion(double a, double b){
        double result = a - b;
        return result;
    }

    private static double multiplikation(double a, double b){
        double result = a * b;
        return result;
    }

    private static double division (double a, double b){
        double result = 0;
        if(a == 0 || b == 0){
            result = 0;
        }
        else{
            result = a / b;
        }
        return result;
    }
}
