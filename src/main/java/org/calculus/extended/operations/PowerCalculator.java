package org.calculus.extended.operations;

public class PowerCalculator {

    /**
     * Calculates base raised to the power of exponent.
     *
     * @param base  the base of the power.
     * @param exponent the exponent of the power.
     * @return the result of base raised to the power.
     */

    public static double power(double base, double exponent) {
        if (Double.isNaN(base) || Double.isNaN(exponent)) {
            return Double.NaN; // Return NaN if either base or exponent is NaN
        }
        return Math.pow(base, exponent); // Use Math.pow for handling fractional exponents
    }
}