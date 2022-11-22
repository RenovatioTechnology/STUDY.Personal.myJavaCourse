package cs.study_java;
// Author: Jefferson Nah

import java.util.Scanner;

public class CaptionFixer {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String userCaption;
        String lastChar;
        char ch;
        char[] lastCharArray;
        userCaption = scnr.nextLine();
        // checking if last character contain .  or not
        if (!(userCaption.endsWith(".") || userCaption.endsWith("!") || userCaption.endsWith("?")
                || userCaption.endsWith("$"))) {
            lastChar = userCaption.substring(0, userCaption.length() - 1);
            lastCharArray = lastChar.toCharArray();
            ch = userCaption.charAt(userCaption.length() - 1);
            if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z')) {
                userCaption = userCaption.substring(0, userCaption.length() - 1) + ".";
            } else {
                userCaption = userCaption + ".";// if not append .
            }
        }
        if (userCaption.length() >= 2) {// checking if length of user Caption is greater than 3 or not
            if (userCaption.endsWith("..")) {// checking if user caption end with .. or not
                if (!userCaption.endsWith("...")) {// checking if user caption end with ... or not
                    userCaption = userCaption.substring(0, userCaption.length() - 1);// if not remove last .
                }
            }
        }
        // checking if first char is alphabet or not
        if (Character.isAlphabetic(userCaption.charAt(0))) {
            if (!Character.isUpperCase(userCaption.charAt(0)))// checking if first char is upper case or not
                userCaption = userCaption.substring(0, 1).toUpperCase()
                        + userCaption.substring(1, userCaption.length());// if not make first char uppercase
        }

        System.out.println(userCaption);// print caption

    }
}
