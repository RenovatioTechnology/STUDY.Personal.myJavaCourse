package cs.study_java;
// Author: Jefferson Nah Jr.

import java.util.Scanner;

public class VariableUsage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInteger = 0;
        char charLetter = 'z';
        String Regis;

        System.out.println("Enter integer:");
        userInteger = scnr.nextInt();

        System.out.println("Enter character:");
        charLetter = scnr.next().charAt(0);

        System.out.println("Enter String:");
        Regis = scnr.next();
        System.out.printf("\n");

        System.out.printf(userInteger + " " + charLetter + " " + Regis);
        System.out.printf("\n");
        System.out.printf("%10s", Regis);
        System.out.printf("%10s", charLetter);
        System.out.printf("%10s", userInteger, "\n");
        System.out.printf("\n");
        return;
    }
}
