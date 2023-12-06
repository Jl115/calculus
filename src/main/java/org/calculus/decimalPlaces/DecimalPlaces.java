package org.calculus.decimalPlaces;

public class DecimalPlaces {

    static int decimalPlaces = 8;
    public static String formatDecimalPoints(double number) {

        String format = String.format("%." + decimalPlaces + "f", number);
        return format;
    }

    public void setDecimalPlaces(int number) {
        decimalPlaces = number;
    }

}
