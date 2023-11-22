package org.calculus.calculate;

/**
 * The Calculator class provides a variety of arithmetic and mathematical functions,
 * including basic operations, modular arithmetic, exponentiation, root extraction,
 * logarithmic calculations, factorial, and memory storage capabilities.
 */

public class ExtendedOperations {

    

    public double modulo(Double a, Double b) {
        if (b == 0 || a == 0) {
            return 0;
        }
        return a % b ;
    }

    public String potenzCalc(double base, double exponent) {
        return String.valueOf(Math.pow(base, exponent));
    }

    public String squareRoot(double number) {
        if (number < 0) {
            return "Not a Number";
        }
        return String.valueOf(Math.sqrt(number));
    }

    public String factorial(double n) {
        double result = 1.0;
        for (double i = 2; i <= n; i++) {
            result *= i;
        }
        return String.valueOf(result);
    }
}