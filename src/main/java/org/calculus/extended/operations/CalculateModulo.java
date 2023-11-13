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

    public static int calculateModulo(int number1, int number2) {
        // It is important to check that number2 is not 0 to prevent division by zero.
        if (number2 == 0) {
            throw new IllegalArgumentException("The divisor must not be 0.");
        }
        return number1 % number2;
    }

    /**
     * Calculates the modulo of two integers.
     * Returns 0 if either of the arguments is 0.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The modulo of a and b, or 0 if either a or b is 0.
     */

    public static int modulo(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        }
        return a % b;
    }
}