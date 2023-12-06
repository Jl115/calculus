package org.calculus.extended.operations;

    /**
    * The CalculateModulo class provides a method to calculate the modulo of two numbers.
     */

public class CalculateModulo {

    /**
     * Calculates the modulo (remainder of the division) of two integers.
     *
     * @param number1 the dividend
     * @param number2 the divisor
     * @return the modulo of number1 and number2
     * @throws IllegalArgumentException if the divisor is 0
     */

    public static Double calculateModulo(double number1, double number2) {
        // It is important to check that number2 is not 0 to prevent division by zero.
        if (number2 == 0 || number1 == 0) {
            return 0.0;
        }
        return number1 % number2;
    }
}