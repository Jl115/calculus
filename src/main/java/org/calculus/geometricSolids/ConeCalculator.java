package org.calculus.geometricSolids;

import java.util.Scanner;

public class ConeCalculator {

    /**
     * Fordert den Benutzer zur y Eingabe des Radius der Grundfläche des Kegels auf.
     *
     * @return Radius des Kegels
     */

    public static double requestConeRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Radius der Grundfläche des Kegels ein:");
        return scanner.nextDouble();
    }

    /**
     * Fordert den Benutzer zur Eingabe der Höhe des Kegels auf.
     *
     * @return Höhe des Kegels
     */

    public static double requestConeHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Höhe des Kegels ein:");
        return scanner.nextDouble();
    }

    /**
     * Berechnet das Volumen eines Kegels.
     *
     * @param r Radius der Grundfläche des Kegels
     * @param h Höhe des Kegels
     * @return Volumen des Kegels
     */

    public static double calculateVolume(double r, double h) {
        return (Math.PI * r * r * h) / 3.0;
    }

    /**
     * Berechnet die Oberfläche eines Kegels.
     *
     * @param r Radius der Grundfläche des Kegels
     * @param h Höhe des Kegels
     * @return Oberfläche des Kegels
     */

    public static double calculateSurfaceArea(double r, double h) {
        double l = Math.sqrt(r * r + h * h); // Länge der Mantellinie
        return Math.PI * r * (r + l);
    }
}