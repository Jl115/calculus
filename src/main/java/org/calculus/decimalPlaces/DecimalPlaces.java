package org.calculus.decimalPlaces;

import java.util.Locale;

public class DecimalPlaces {

    static int decimalPlaces = 8;
    public static String formatDecimalPoints(double number) {

        String format = String.format(Locale.US,"%." + decimalPlaces + "f", number);
        return format;
    }

    public void setDecimalPlaces(int number) {
        decimalPlaces = number;
    }

}
