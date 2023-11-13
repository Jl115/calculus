package org.calculus.extended.operations;

/**
 * The CalculateModulo class provides a method to calculate the modulo (remainder) of two integers.
 */
public class CalculateModulo {

    /**
     * Calculates the modulo (remainder of the division) of two integers.
     *
     * @param number1 the dividend (the number to be divided)
     * @param number2 the divisor (the number by which to divide)
     * @return the modulo of number1 and number2
     * @throws IllegalArgumentException if the divisor is 0
     */
    public int modulo(int number1, int number2) {
        if (number2 == 0 || number1 == 0) {
            throw new IllegalArgumentException("Divisor cannot be 0");
        } else {
            return number1 % number2;
        }
    }
}