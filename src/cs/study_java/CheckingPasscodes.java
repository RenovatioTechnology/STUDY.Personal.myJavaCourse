package cs.study_java;
// Set hasDigit to true if the 3-character passCode contains a digit.
import java.util.Scanner;

public class CheckingPasscodes {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean hasDigit;
        String passCode;

        hasDigit = false;
        passCode = scnr.next();

        if (Character.isDigit(passCode.charAt(0)) || Character.isDigit(passCode.charAt(1))
                || Character.isDigit(passCode.charAt(2))) {
            hasDigit = true;
        }

        if (hasDigit) {
            System.out.println("Has a digit.");
        } else {
            System.out.println("Has no digit.");
        }
    }
}