package cs.study_java;

// Author: Jefferson Nah

import java.util.Scanner;

public class FormatStrings {

    public static void main(String[] args) {
        final int NUM_PHONE_CHARS = 13;

        Scanner scnr = new Scanner(System.in);
        String numbers;
        String str1;
        String str2 = "";
        String displayLine;
        String major;
        int thisIndexOf;
        String university;
        String city;

        numbers = scnr.nextLine();
        str1 = numbers.substring(1, 4);
        str1 += "-";

        if (str1.length() == NUM_PHONE_CHARS) {
            System.out.println(str1);
        } else {
            System.out.println("ERROR: Phone number must contain 13 characters.");
        }
        if (str1.length() == NUM_PHONE_CHARS) {
            str2 = numbers.substring(5);
            System.out.println(str2);
        }
        if (str1.length() == NUM_PHONE_CHARS) {
            str1 += str2;
            System.out.println(str1);
        }

        displayLine = scnr.nextLine();
        displayLine = displayLine.toLowerCase();
        System.out.println(displayLine);

        thisIndexOf = displayLine.indexOf(':');

        major = displayLine.substring(0, thisIndexOf);

        displayLine = displayLine.substring(thisIndexOf + 2);
        thisIndexOf = displayLine.indexOf(',');
        university = displayLine.substring(0, thisIndexOf);
        city = displayLine.substring(thisIndexOf + 2);

        System.out.println(city + ": " + university + ", " + major);

    }

}