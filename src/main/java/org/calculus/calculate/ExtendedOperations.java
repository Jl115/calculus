package org.calculus.calculate;

import java.math.BigDecimal;

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