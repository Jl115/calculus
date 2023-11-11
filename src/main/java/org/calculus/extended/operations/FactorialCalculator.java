package org.calculus.extended.operations;

import java.math.BigInteger;

/**
 * This class provides a method for calculating the factorial of a non-negative integer.
 */

public class FactorialCalculator {

    /**
     * Calculates the factorial of a given non-negative integer.
     *
     * @param number The number whose factorial is to be calculated. Must be non-negative.
     * @return The factorial of {@code number}.
     * @throws IllegalArgumentException if {@code number} is negative.
     */

    public static BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial of negative numbers is not defined.");
        }
        return factorialHelper(BigInteger.valueOf(number), BigInteger.ONE);
    }

    /**
     * Helper method for recursive calculation of the factorial.
     *
     * @param number The current value for which the factorial is being calculated.
     * @param result The accumulated result of the previous calculations.
     * @return The factorial of {@code number}.
     */

    private static BigInteger factorialHelper(BigInteger number, BigInteger result) {
        if (number.equals(BigInteger.ZERO)) {
            return result;
        } else {
            return factorialHelper(number.subtract(BigInteger.ONE), number.multiply(result));
        }
    }
}