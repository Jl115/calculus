package org.calculus.extended.operations;

import java.math.BigInteger;

/**
 * Diese Klasse bietet eine Methode zur Berechnung der Fakultät einer nichtnegativen ganzen Zahl.
 */
public class FactorialCalculator {

    /**
     * Berechnet die Fakultät einer gegebenen nichtnegativen ganzen Zahl.
     *
     * @param number Die Zahl, von der die Fakultät berechnet werden soll. Muss nichtnegativ sein.
     * @return Die Fakultät von {@code number}.
     * @throws IllegalArgumentException wenn {@code number} negativ ist.
     */
    public static BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Die Fakultät von negativen Zahlen ist nicht definiert.");
        }
        return factorialHelper(BigInteger.valueOf(number), BigInteger.ONE);
    }

    /**
     * Hilfsmethode zur rekursiven Berechnung der Fakultät.
     *
     * @param number Der aktuelle Wert, für den die Fakultät berechnet wird.
     * @param result Das akkumulierte Ergebnis der bisherigen Berechnung.
     * @return Die Fakultät von {@code number}.
     */
    private static BigInteger factorialHelper(BigInteger number, BigInteger result) {
        if (number.equals(BigInteger.ZERO)) {
            return result;
        } else {
            return factorialHelper(number.subtract(BigInteger.ONE), number.multiply(result));
        }
    }
}