/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the starting temperature? ");
        String startingTemp = scanner.next();

        System.out.print("Enter C if converting to Celsius or F if converting to Fahrenheit: ");
        String convertingTo = scanner.next();

        int endingTemp = 0;
        String convertedType = "";
        if(convertingTo.equals("C") || convertingTo.equals("c")){
            endingTemp = (Integer.parseInt(startingTemp) - 32) * 5 / 9;
            convertedType = "Celsius";
        }

        if(convertingTo.equals("F") || convertingTo.equals("f")){
            endingTemp = (Integer.parseInt(startingTemp) * 9 / 5) + 32;
            convertedType = "Fahrenheit";
        }

        System.out.println("The converted temperature in " + convertedType + " is " + endingTemp);
    }
}
