package cs.study_java;

import java.util.Scanner;
import java.lang.Math;

public class BodyTemperatureEx {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double bodyTemp;

        System.out.print("Enter body temperature in Fahrenheit: ");
        bodyTemp = scnr.nextDouble();

        if (Math.abs(bodyTemp - 98.6) < 0.0001) {
            System.out.println("Temperature is exactly normal.");
        } else if (bodyTemp > 98.6) {
            System.out.println("Temperature is above normal.");
        } else {
            System.out.println("Temperature is below normal.");
        }
    }
}
