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

    /**
     * Berechnet das Volumen einer Kugel.
     *
     * @param radius Radius der Kugel
     * @return Volumen der Kugel
     */

    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Berechnet die Oberfläche einer Kugel.
     *
     * @param radius Radius der Kugel
     * @return Oberfläche der Kugel
     */

    public static double calculateSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }
}