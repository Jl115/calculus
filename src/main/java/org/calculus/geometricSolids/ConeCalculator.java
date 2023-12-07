package org.calculus.geometricSolids;

import java.util.Scanner;

public class ConeCalculator {
    /**
     * Fordert den Benutzer zur Eingabe des Radius der Grundfläche des Kegels auf.
     *
     * @return Radius des Kegels
     */
    public static double requestConeRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Radius der Grundfläche des Kegels ein:");
        return scanner.nextDouble();
    }
}

