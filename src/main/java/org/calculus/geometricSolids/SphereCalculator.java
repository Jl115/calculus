package org.calculus.geometricSolids;

import java.util.Scanner;

public class SphereCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Radius der Kugel ein: ");
        double radius = scanner.nextDouble();

        double volume = calculateVolume(radius);
        double surfaceArea = calculateSurfaceArea(radius);

        System.out.println("Das Volumen der Kugel ist: " + volume);
        System.out.println("Die Oberfläche der Kugel ist: " + surfaceArea);
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
