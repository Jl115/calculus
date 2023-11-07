package org.calculus.extended.operations;

/**
 * Die Klasse CalculateModulo stellt eine Methode zur Berechnung des Modulo zweier Zahlen bereit.
 */
public class CalculateModulo {

    /**
     * Berechnet den Modulo (Rest der Division) zweier ganzer Zahlen.
     *
     * @param number1 der Dividend
     * @param number2 der Divisor
     * @return den Modulo von number1 und number2
     * @throws IllegalArgumentException wenn der Divisor 0 ist
     */
    public static int calculateModulo(int number1, int number2) {
        // Es ist wichtig zu prüfen, ob number2 nicht 0 ist, um eine Division durch 0 zu verhindern.
        if (number2 == 0) {
            throw new IllegalArgumentException("Der Divisor darf nicht 0 sein.");
        }
        return number1 % number2;
    }

    /**
     * Ein einfaches Testprogramm, das die calculateModulo-Methode verwendet.
     *
     * @param args nicht verwendet
     */
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 3;
        System.out.println("Der Modulo von " + number1 + " und " + number2 + " ist: " + calculateModulo(number1, number2));
    }
}