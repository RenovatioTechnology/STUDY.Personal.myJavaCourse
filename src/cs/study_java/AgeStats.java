package cs.study_java;

import java.util.Scanner;

public class AgeStats {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userAge;

        System.out.print("Enter age: ");
        userAge = scnr.nextInt();

        // Note that more than one "if" statement can execute
        if (userAge < 16) {
            System.out.println("Enjoy your early years.");
        }

        if (userAge > 15) {
            System.out.println("You are old enough to drive.");
        }

        if (userAge > 17) {
            System.out.println("You are old enough to vote.");
        }

        if (userAge > 24) {
            System.out.println("Most car rental companies will rent to you.");
        }

        if (userAge > 34) {
            System.out.println("You can run for president.");
        }
    }
}
