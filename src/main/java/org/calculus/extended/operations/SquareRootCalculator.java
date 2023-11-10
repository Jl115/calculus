package org.calculus.extended.operations;

/**
 * This class provides a method for calculating the square root of a number.
 */
public class SquareRootCalculator {

    /**
     * Calculates the square root of a given number.
     *
     * @param number The number whose square root is to be calculated.
     * @return The calculated square root of {@code number}.
     * @throws IllegalArgumentException If {@code number} is negative.
     */
    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root of a negative number cannot be calculated.");
        }
        return Math.sqrt(number);
    }
}
