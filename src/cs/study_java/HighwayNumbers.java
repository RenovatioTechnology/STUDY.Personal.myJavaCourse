package cs.study_java;

// Author: Jefferson J Nah

import java.util.Scanner;

public class HighwayNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        System.out.println("Enter a highway number:");
        highwayNumber = scnr.nextInt();

        if (highwayNumber > 99 && highwayNumber <= 999) {
            primaryNumber = highwayNumber % 100;
            System.out
                    .println(highwayNumber + " is an auxiliary highway, serving primary highway " + primaryNumber
                            /* + (primaryNumber % 2 == 0 ? "going east/west" : "going north/south") */);

        } else if (highwayNumber > 0 && highwayNumber < 100) {
            if (highwayNumber % 2 == 0) {
                System.out.println(highwayNumber + " is a primary highway, going east/west");
            } else {
                System.out.println(highwayNumber + " is a primary highway, going north/south");
            }
        } else {
            System.out.println(highwayNumber + " is not a valid interstate highway number");
        }

        return;
    }
}

