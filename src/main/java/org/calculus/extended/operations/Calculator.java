package org.calculus.extended.operations;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * The Calculator class provides a variety of arithmetic and mathematical functions,
 * including basic operations, modular arithmetic, exponentiation, root extraction,
 * logarithmic calculations, factorial, and memory storage capabilities.
 */

public class Calculator {

    // Constants
    public static final double PI = Math.PI; // The value of PI
    //public static final double GRAVITATIONAL_CONSTANT = 6.67430e-11; // Gravitational constant in m^3 kg^-1 s^-2
    public static final double E = Math.E; // The value of Euler's number

    private Map<String, Double> memory = new HashMap<>(); // Memory storage for calculator values

    /**
     * Adds two double values.
     *
     * @param a The first operand
     * @param b The second operand
     * @return The sum of a and b
     */

    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second double value from the first.
     *
     * @param a The minuend.
     * @param b The subtrahend.
     * @return The difference of a and b.
     */

    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two double values.
     *
     * @param a The first multiplicand.
     * @param b The second multiplicand.
     * @return The product of a and b.
     */

    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first double value by the second.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of a and b.
     * @throws ArithmeticException If the divisor is zero.
     */

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }
        return a / b;
    }

    /**
     * Calculates the modulo of two integers.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The remainder of the division of a by b.
     * @throws ArithmeticException If the divisor is zero.
     */

    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo Null ist nicht erlaubt.");
        }
        return a % b;
    }

    /**
     * Raises a base to the power of an exponent.
     *
     * @param base     The base value.
     * @param exponent The exponent value.
     * @return The result of base raised to the power of exponent.
     */

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Calculates the square root of a number.
     *
     * @param number The number to calculate the square root of.
     * @return The square root of number.
     * @throws ArithmeticException If the number is negative.
     */

    public static double sqrt(double number) {
        if (number < 0) {
            throw new ArithmeticException("Wurzel aus einer negativen Zahl ist nicht definiert.");
        }
        return Math.sqrt(number);
    }

    /**
     * Changes the sign of a number.
     *
     * @param number The number to change the sign of.
     * @return The number with its sign changed.
     */

    public static double changeSign(double number) {
        return -number;
    }

    /**
     * Calculates the nth root of a number.
     *
     * @param n The degree of the root.
     * @param x The number to find the nth root of.
     * @return The nth root of x.
     * @throws ArithmeticException If x is negative and n is even.
     */

    public static double nthRoot(int n, double x) {
        if (x < 0 && n % 2 == 0) {
            throw new ArithmeticException("x-te Wurzel aus einer negativen Zahl ist für gerade n nicht definiert.");
        }
        return Math.pow(x, 1.0 / n);
    }
    /**
     * Calculates the percentage of a total.
     *
     * @param percentage The percentage to calculate.
     * @param total      The total value.
     * @return The calculated percentage of the total.
     */


    public static double percentOf(double percentage, double total) {
        return (percentage / 100) * total;
    }
    /**
     * Squares a number.
     *
     * @param number The number to square.
     * @return The square of number.
     */


    public static double square(double number) {
        return Math.pow(number, 2);
    }

    /**
     * Calculates the logarithm base 2 of a number.
     *
     * @param number The number to calculate the logarithm of.
     * @return The logarithm base 2 of number.
     */

    public static double log2(double number) {
        return Math.log(number) / Math.log(2);
    }

    /**
     * Calculates the logarithm base 10 of a number.
     *
     * @param number The number to calculate the logarithm of.
     * @return The logarithm base 10 of number.
     */

    public static double log10(double number) {
        return Math.log10(number);
    }
    /**
     * Calculates the logarithm of a number with an arbitrary base.
     *
     * @param base   The base of the logarithm.
     * @param number The number to calculate the logarithm of.
     * @return The logarithm of number with base base.
     */

    public static double logBaseN(double base, double number) {
        return Math.log(number) / Math.log(base);
    }

    /**
     * Saves a value with an associated key to the calculator's memory.
     *
     * @param key   The key associated with the value.
     * @param value The value to be saved.
     */

    public void saveToMemory(String key, double value) {
        memory.put(key, value);
    }

    /**
     * Recalls a value from the calculator's memory.
     *
     * @param key The key associated with the value to be recalled.
     * @return The value associated with the key, or NaN if the key does not exist.
     */

    public double recallFromMemory(String key) {
        return memory.getOrDefault(key, Double.NaN);
    }

    /**
     * Clears a value from the calculator's memory.
     *
     * @param key The key associated with the value to be cleared.
     */

    public void clearMemory(String key) {
        memory.remove(key);
    }

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param number The integer to calculate the factorial of.
     * @return The factorial of number as a BigInteger.
     * @throws ArithmeticException if the number is negative, as factorial is not defined for negative numbers.
     */

    public static BigInteger factorial(int number) {
        if (number < 0) {
            throw new ArithmeticException("Fakultät von negativen Zahlen ist nicht definiert.");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}