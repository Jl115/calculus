package org.calculus.basicOperations;

import java.util.Arrays;
import java.util.Scanner;
public class BasicOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numb1 = null;
        double result = 0.0;





        if (numb1.contains("-")) {
            String[] subtraction = numb1.split("-");
            result = Double. parseDouble(subtraction[0]) - Double. parseDouble(subtraction[1]);
        }
        else if (numb1.contains("\\+")){
            String[] addition = numb1.split("\\+");
            result = Double. parseDouble(addition[0]) + Double. parseDouble(addition[1]);
        }
        else if (numb1.contains("/")){
            String[] division = numb1.split("/");
            result = Double. parseDouble(division[0])* Double. parseDouble(division[1]);
        }
        else {
            String[] multiplication = numb1.split("\\*");
            result = Double. parseDouble(multiplication[0]) / Double. parseDouble(multiplication[1]);
        }



        System.out.print(result);
    }
}
