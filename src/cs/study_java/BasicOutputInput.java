package cs.study_java;

import java.util.Scanner;     // API class required for user input

public class BasicOutputInput {
    public static void main(String[] args) {
        int areaCodeDigits;
        int prefixDigits;
        int last4digits;
        int age;
        int year = 1;
        int years = 10;


        System.out.println("     #");
        System.out.println("    # #");
        System.out.println("   #   #");
        System.out.println("  #     #");
        System.out.println(" #########");
        System.out.println(" #       #");
        System.out.println(" #       #");
        System.out.println(" #   **  #");
        System.out.println(" #   **  #");
        System.out.println(" #   **  #");
        System.out.println(" #########");
        System.out.println();
        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter your current age:");
        age = scnr.nextInt();
        System.out.println("Time passes...");

        System.out.print("     You are now "+(age));
        System.out.println(" years old.");
        System.out.print("     You will be "+(age+year));
        System.out.println(" next year.");
        System.out.print("     You will be "+(age+years));
        System.out.print(" in ");
        System.out.print(years);
        System.out.println(" years!");
        System.out.println();

        System.out.println("Enter the 3-digit area code:");
        areaCodeDigits = scnr.nextInt();
        System.out.println("Enter the 3-digit prefix:");
        prefixDigits = scnr.nextInt();
        System.out.println("Enter last 4 numbers in the phone number:");
        last4digits = scnr.nextInt();
        System.out.println();

        System.out.print("Formatted phone number is ");
        System.out.print("("+areaCodeDigits);
        System.out.print(") ");
        System.out.print(prefixDigits);
        System.out.print("-");
        System.out.print(last4digits);
        System.out.println(".");
        System.out.println("Call now!");;

        return;
    }
}