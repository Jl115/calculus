package org.calculus;

import history.Addition;
import history.History;
import history.ShowOnlyValue;
import trigFunctions.trigFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double angel = 35.0; // This is only optional Number.
        Addition addition = new Addition("5+5+5");
        Addition addition1 = new Addition("6+8+20+16+55");
        History history = new History();

        // Add Trigonometry Functions and implementation in the main
        double sinValue = trigFunctions.calculateSin(angel);
        double cosValue = trigFunctions.calculateCos(angel);
        double tanValue = trigFunctions.calculateTan(angel);


        // User can See the Degrees in the Console.
        System.out.println("Sinus " + angel + "Degrees " + sinValue);
        System.out.println("Cosines " + angel + "Degrees " + cosValue);
        System.out.println("Tangents " + angel + "Degrees " + tanValue);


        // Add Value in history
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition1.getRechnung());
        history.addValue(addition.getRechnung());

        // Getting the History
        ArrayList<String> theHistory = history.getHistory();
        for (String value : theHistory) {
            System.out.println(value);
        }
        //Select a Value from the History
        Scanner scanner = new Scanner(System.in);
        int selectedValue;
        boolean validInput;
        do {
            System.out.println("Please select a value you would like to use: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please use a value from 1 to 10");
                scanner.next();
            }
            selectedValue = scanner.nextInt();

            if (selectedValue < 0 || selectedValue > 9) {
                System.err.println("There is no value at that index");
                System.err.println("Please use a value from 1 to 10");
                validInput = false;
            } else {
                String valueHasBenSelected = history.getValueOfHistory(selectedValue);
                if (valueHasBenSelected != null) {
                    String theResultOfValue = ShowOnlyValue.getTheResultOfValue(valueHasBenSelected);
                    System.out.println("\nThe selected value: " + selectedValue + " = " + theResultOfValue);
                }
                validInput = true;
            }
        } while (!validInput);

    }
}