package cs.study_java;

import java.util.Scanner;

public class LifeExpectancyCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double lifeExpectancy;
        double userBmi;
        char userChoice;
        String userInput;
        boolean isOverweight;
        boolean isMale;

        // Get user's sex
        System.out.print("Female (f) or male (m): ");
        userInput = scnr.next();
        userChoice = userInput.charAt(0);
        if (userChoice == 'm') {
            isMale = true;
        } else {
            isMale = false;
        }

        // Get user's BMI
        System.out.print("Enter body mass index (BMI): ");
        userBmi = scnr.nextDouble();
        isOverweight = (userBmi >= 25);

        // Determine life expectancy based on sex and BMI
        if (isMale && !isOverweight) {
            lifeExpectancy = 79.4;
        } else if (!isMale && !isOverweight) {
            lifeExpectancy = 83.5;
        } else if (isMale && isOverweight) {
            lifeExpectancy = 77.3;
        } else {
            lifeExpectancy = 81.4;
        }

        System.out.println("Life expectancy is " + lifeExpectancy +
                " years.");
    }
}