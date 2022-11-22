package cs.study_java;

// week7;
// Author: Jefferson Nah

import java.util.Scanner;

public class TextMsgExpander2 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String ch = "";
        String BFF = "best friend forever";
        String IDK = "I don't know";
        String JK = "just kidding";
        String TTYL = "talk to you later";

        System.out.println("Enter text:");
        ch = scnr.nextLine();
        ch = ch.toUpperCase();
        System.out.println("You entered: " + ch);

        // if BFF comes then add best friend forever to the string
        if (ch.contains("BFF")) {

            ch = ch.replace("BFF", BFF);
            System.out.println("Replaced BFF with " + BFF);
        }
        // if IDK comes then add don't know to the string
        if (ch.contains("IDK")) {

            ch = ch.replace("IDK", IDK);
            System.out.println("Replaced IDK with " + IDK);
        }
        // if JK comes then add just kidding to the string
        if (ch.contains("JK")) {

            ch = ch.replace("JK", JK);
            System.out.println("Replaced JK with " + JK);
        }
        // if TTYL comes then add talk to you later to the string
        if (ch.contains("TTYL")) {
            ch = ch.replace("TTYL", TTYL);
            System.out.println("Replaced TTYL with " + TTYL);
        } else {
            // if there is no abbreviation just add the current character
            System.out.println("Expanded: " + ch);
        }

        return;
    }
}