package org.calculus.calculate;

/**
 * The Calculator class provides a variety of arithmetic and mathematical functions,
 * including basic operations, modular arithmetic, exponentiation, root extraction,
 * logarithmic calculations, factorial, and memory storage capabilities.
 */

public class ExtendedOperations {

    public static void main(String[] args) {
        ExtendedOperations extendedOperations = new ExtendedOperations();

    }
    
    // like this just not in console
    public void modulo(int a, int b) {
        if (b == 0 || a == 0) {
            System.out.println("0");
        }else 
        System.out.println( String.valueOf(a % b));
    }

  // like this just not in console
    public void potenzCalc(double base, double exponent) {
        System.out.println( String.valueOf(Math.pow(base, exponent)));
    }

    // like this just not in console
    public void  squareRoot(double number) {
        if (number < 0) {
            System.out.println("Not a Number");
        }else 
        System.out.println(Math.sqrt(number));
    }

    //aproved but not in console
    public void factorial(double n) {
        double result = 1.0;
        for (double i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
    
}