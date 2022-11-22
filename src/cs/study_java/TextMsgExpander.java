package cs.study_java;

// week7;
// Author: Jefferson Nah

// Program Descriptions:
// if BFF comes then add best friend forever to the string
// if IDK comes then add don't know to the string
// if JK comes then add just kidding to the string
// if TTYL comes then add talk to you later to the string

import java.util.Scanner;

public class TextMsgExpander {

    Scanner scnr = new Scanner(System.in);

    String ch;

    public static void main(String[] args) {
        String ch;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter text:");

        ch = scnr.nextLine();

        System.out.println("You entered: " + ch);
        System.out.println();
        if (ch.indexOf("BFF") != -1) {

            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
            ch = ch.replaceAll("BFF", "best friend forever");
        }
        if (ch.indexOf("IDK") != -1) {

            System.out.println("Replaced \"IDK\" with \"I don't know\".");
            ch = ch.replaceAll("IDK", "I don't know");
        }
        if (ch.indexOf("JK") != -1) {

            System.out.println("Replaced \"JK\" with \"just kidding\".");
            ch = ch.replaceAll("JK", "just kidding");
        }
        if (ch.indexOf("TTYL") != -1) {

            System.out.println("Replaced \"TTYL\" with \"talk to you later\".\n");
            ch = ch.replaceAll("TTYL", "talk to you later");
            System.out.println("Expanded: " + ch);
        } else {
            System.out.println();
            // if there is no abbreviation just add the current character
            System.out.println("Expanded: " + ch);
        }
        return;
    }

}
