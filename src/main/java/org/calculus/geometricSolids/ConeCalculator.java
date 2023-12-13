package org.calculus.geometricSolids;

import java.util.Scanner;

public class ConeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Radius der Grundfläche des Kegels ein: ");
        double radius = scanner.nextDouble();

        System.out.print("Geben Sie die Höhe des Kegels ein: ");
        double height = scanner.nextDouble();

        double volume = calculateVolume(radius, height);
        double surfaceArea = calculateSurfaceArea(radius, height);

        System.out.println("Das Volumen des Kegels ist: " + volume);
        System.out.println("Die Oberfläche des Kegels ist: " + surfaceArea);
    }

    /**
     * Berechnet das Volumen eines Kegels.
     *
     * @param radius Radius der Grundfläche des Kegels
     * @param height Höhe des Kegels
     * @return Volumen des Kegels
     */
    public static double calculateVolume(double radius, double height) {
        return (Math.PI * radius * radius * height) / 3.0;
    }

    /**
     * Berechnet die Oberfläche eines Kegels.
     *
     * @param radius Radius der Grundfläche des Kegels
     * @param height Höhe des Kegels
     * @return Oberfläche des Kegels
     */
    public static double calculateSurfaceArea(double radius, double height) {
        double slantHeight = Math.sqrt(radius * radius + height * height); // Länge der Mantellinie
        return Math.PI * radius * (radius + slantHeight);
    }
}
