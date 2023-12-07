package org.calculus.geometricSolids;

import java.util.Scanner;
public class ZylinderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Radius des Zylinders ein: ");
        double radius = scanner.nextDouble();

        System.out.print("Geben Sie die Höhe des Zylinders ein: ");
        double height = scanner.nextDouble();

        double volume = calculateVolume(radius, height);
        double surface = calculateSurface(radius, height);

        System.out.println("Das Volumen des Zylinders ist: " + volume);
        System.out.println("Die Oberfläche des Zylinders ist: " + surface);
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double calculateSurface(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }
}
