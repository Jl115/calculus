package extended.operations.potentiometer;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Calculator {
    /*MB*/
    // Konstanten
    public static final double PI = Math.PI; // Pi
    public static final double GRAVITATIONAL_CONSTANT = 6.67430e-11; // Gravitationskonstante in m^3 kg^-1 s^-2
    public static final double E = Math.E; // Euler'sche Zahl

    private Map<String, Double> memory = new HashMap<>();

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }
        return a / b;
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo Null ist nicht erlaubt.");
        }
        return a % b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double sqrt(double number) {
        if (number < 0) {
            throw new ArithmeticException("Wurzel aus einer negativen Zahl ist nicht definiert.");
        }
        return Math.sqrt(number);
    }

    public static double changeSign(double number) {
        return -number;
    }

    public static double nthRoot(int n, double x) {
        if (x < 0 && n % 2 == 0) {
            throw new ArithmeticException("x-te Wurzel aus einer negativen Zahl ist für gerade n nicht definiert.");
        }
        return Math.pow(x, 1.0 / n);
    }

    // Prozentrechnung
    public static double percentOf(double percentage, double total) {
        return (percentage / 100) * total;
    }

    // Quadrieren
    public static double square(double number) {
        return Math.pow(number, 2);
    }

    // Logarithmus Basis 2
    public static double log2(double number) {
        return Math.log(number) / Math.log(2);
    }

    // Logarithmus Basis 10
    public static double log10(double number) {
        return Math.log10(number);
    }

    // Logarithmus Basis n
    public static double logBaseN(double base, double number) {
        return Math.log(number) / Math.log(base);
    }

    // Speicherfunktionen
    public void saveToMemory(String key, double value) {
        memory.put(key, value);
    }

    public double recallFromMemory(String key) {
        return memory.getOrDefault(key, Double.NaN);
    }

    public void clearMemory(String key) {
        memory.remove(key);
    }

    public static void main(String[] args) {
        // Interaktive Konsolenoberfläche wird hier implementiert
    }

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