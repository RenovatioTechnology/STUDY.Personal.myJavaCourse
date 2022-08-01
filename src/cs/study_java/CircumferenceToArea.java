package cs.study_java;

import java.util.Scanner;

public class CircumferenceToArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final double PI_VAL = 3.14159265;

        double circleRadius;
        double circleCircumference;
        double circleArea;

        System.out.print("Enter circumference: ");
        circleCircumference = scnr.nextDouble();

        circleRadius = circleCircumference / 2 * PI_VAL;
        circleArea = PI_VAL * circleRadius * circleRadius;

        System.out.println("Circle area is: " + circleArea);
    }
}
