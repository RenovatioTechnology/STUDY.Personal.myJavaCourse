package cs.study_java;

// Print two strings, firstString and secondString, in alphabetical order.
//Assume the strings are lowercase

import java.util.Scanner;

public class OrderStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstString;
        String secondString;
        /* read two strings */
        System.out.print("Enter first string word: ");
        firstString = scnr.next();
        System.out.print("Enter string word: ");
        secondString = scnr.next();
        /* compare strings and print in alphabetical order */
        if (firstString.compareTo(secondString) <= 0) {
            System.out.println(firstString + " " + secondString);
        } else {
            System.out.println(secondString + " " + firstString);
        }

    }
}