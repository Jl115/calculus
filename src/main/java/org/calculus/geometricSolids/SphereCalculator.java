package org.calculus.geometricSolids;

import java.util.Scanner;

public class SphereCalculator {
    /**
     * Fordert den Benutzer zur Eingabe des Radius der Kugel auf.
     *
     * @return Radius der Kugel
     */
    public static double requestRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Radius der Kugel ein:");
        return scanner.nextDouble();
    }
}