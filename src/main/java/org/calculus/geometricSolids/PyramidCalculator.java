package org.calculus.geometricSolids;

public class PyramidCalculator {
    public static double calculateVolume(double sidelength, double height) {
        return (sidelength * sidelength * height) / 3.0;
    }

    public static void main(String[] args) {
        double sidelength = 5.0; // Beispielwerte
        double height = 10.0;

        double volume = calculateVolume(sidelength, height);
        System.out.println("Das Volumen der Pyramide ist: " + volume);
    }
}

