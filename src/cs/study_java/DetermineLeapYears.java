package cs.study_java;

// Author:  Jefferson Nah

import java.util.Scanner;

public class DetermineLeapYears {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean leapYear; // true when inputYear is a leap year

        System.out.println("Enter a 4-digit year:");
        inputYear = scnr.nextInt();
        if (inputYear % 400 == 0) {
            leapYear = true;
        } else if (inputYear % 100 == 0) {
            leapYear = false;
        } else if (inputYear % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        // Output:
        if (leapYear == true) {
            System.out.println("true");
            System.out.println(inputYear + " is a leap year");
        } else {
            System.out.println("false");
            System.out.println(inputYear + " is not a leap year");
        }
    }
}
