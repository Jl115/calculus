package org.calculus.extended.operations;

/**
 * This class provides methods for calculating powers.
 */

public class PowerCalculator {

    /**
     * Calculates base raised to the power of exponent.
     *
     * @param base  the base of the power.
     * @param power the exponent of the power.
     * @return the result of base raised to the power.
     */

    public static double power(double base, double power) {
        if (Double.isNaN(base) || Double.isNaN(power)) {
            return Double.NaN; // Return NaN if either base or power is NaN
        }
        if (power == 0) {
            return 1; // Base case for exponent 0
        }
        if (power < 0) {
            return 1 / power(base, -power); // Reciprocal if the exponent is negative
        }
        double result = base;
        for (int i = 1; i < Math.abs(power); i++) {
            result *= base; // Multiply base by itself power times
        }
        return result;
    }
}