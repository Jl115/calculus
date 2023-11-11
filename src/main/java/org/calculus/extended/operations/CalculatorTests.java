package org.calculus.extended.operations;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains tests for the Calculator class.
 * Each test verifies the correctness of a specific method from the Calculator class.
 */

public class CalculatorTests {

    /**
     * Tests the addition method.
     * Ensures that adding two positive numbers yields the correct sum.
     */

    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3), "Adding 2 and 3 should yield 5");
    }

    /**
     * Tests the subtraction method.
     * Checks that subtracting a larger number from a smaller one results in the correct negative value.
     */

    @Test
    void testSubtract() {
        assertEquals(-1, Calculator.subtract(2, 3), "Subtracting 3 from 2 should yield -1");
    }

    /**
     * Tests the multiplication method.
     * Confirms that multiplying two positive numbers produces the correct product.
     */

    @Test
    void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3), "Multiplying 2 by 3 should yield 6");
    }

    /**
     * Tests the division method.
     * Verifies that dividing a number by another yields the correct quotient.
     */

    @Test
    void testDivide() {
        assertEquals(2, Calculator.divide(6, 3), "Dividing 6 by 3 should yield 2");
    }

    /**
     * Tests division by zero.
     * Expects an ArithmeticException to be thrown when attempting to divide by zero.
     */

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1, 0), "Dividing by zero should throw an ArithmeticException");
    }

    /**
     * Tests the modulo operation.
     * Checks that the remainder of the division is correctly calculated.
     */

    @Test
    void testModulo() {
        assertEquals(1, Calculator.modulo(10, 3), "10 modulo 3 should yield 1");
    }

    /**
     * Tests the power function.
     * Ensures that raising a base to an exponent results in the correct value.
     */

    @Test
    void testPower() {
        assertEquals(8, Calculator.power(2, 3), "2 raised to the power of 3 should yield 8");
    }

    /**
     * Tests the square root calculation.
     * Verifies that the square root of a positive number is correctly calculated.
     */

    @Test
    void testSqrt() {
        assertEquals(3, Calculator.sqrt(9), "The square root of 9 should be 3");
    }

    /**
     * Tests the square root calculation with a negative number.
     * Expects an ArithmeticException to be thrown for the square root of a negative number.
     */

    @Test
    void testSqrtNegative() {
        assertThrows(ArithmeticException.class, () -> Calculator.sqrt(-1), "Calculating the square root of -1 should throw an ArithmeticException");
    }

    /**
     * Tests the factorial function.
     * Confirms that the factorial of a non-negative integer is correctly computed.
     */

    @Test
    void testFactorial() {
        assertEquals(new BigInteger("120"), Calculator.factorial(5), "Factorial of 5 should yield 120");
    }

    /**
     * Tests the factorial function with a negative number.
     * Expects an ArithmeticException to be thrown when calculating the factorial of a negative number.
     */

    @Test
    void testFactorialNegative() {
        assertThrows(ArithmeticException.class, () -> Calculator.factorial(-1), "Calculating the factorial of -1 should throw an ArithmeticException");
    }

    /**
     * Tests the sign change operation.
     * Checks that the sign of a number is correctly inverted.
     */

    @Test
    void testChangeSign() {
        assertEquals(-5, Calculator.changeSign(5), "Changing the sign of 5 should yield -5");
        assertEquals(5, Calculator.changeSign(-5), "Changing the sign of -5 should yield 5");
    }

    /**
     * Tests the nth root function.
     * Verifies that the nth root of a number is correctly calculated for various degrees of roots.
     */

    @Test
    void testNthRoot() {
        assertEquals(2, Calculator.nthRoot(2, 4), "The square root of 4 should be 2");
        assertEquals(3, Calculator.nthRoot(3, 27), "The cube root of 27 should be 3");
        assertThrows(ArithmeticException.class, () -> Calculator.nthRoot(2, -4), "Calculating the square root of a negative number should throw an ArithmeticException");
    }
}