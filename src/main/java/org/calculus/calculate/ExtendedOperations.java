package org.calculus.calculate;


/**
 * The Calculator class provides a variety of arithmetic and mathematical functions,
 * including basic operations, modular arithmetic, exponentiation, root extraction,
 * logarithmic calculations, factorial, and memory storage capabilities.
 */

public class ExtendedOperations {

    

    public static Double modulo(Integer a, Integer b) {
        if (b == 0 || a == 0) {
            

            return Double.NaN; // Return NaN if divisor is zero

        } else {
            var result = a % b;
           

            return Double.valueOf(result);
        }
    }
    


    public Double potenzCalc(double base, double exponent) {
        System.out.println("Basis: " + base + " Exponent: " + exponent);
        return Math.pow(base, exponent);
    }

    public String squareRoot(double number) {
        if (number < 0) {
            return String.valueOf(Double.NaN);
        }
        return String.valueOf(Math.sqrt(number));
    }

    public Double factorial(double n) {
        double result = 1.0;
        for (double i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}