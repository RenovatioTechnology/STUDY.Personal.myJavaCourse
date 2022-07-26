package cs.study_java;


// Author: (Jefferson J Nah Jr.)

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum = 0;
        int userNum2 = 0;
        int userNumResult;
        double remainder;

        System.out.println("Enter one integer:");
        userNum = scan.nextInt();
        userNumResult = (userNum) + (userNum) + (userNum);

        System.out.println(userNum + " tripled is " + userNumResult);

        remainder = Math.sqrt(userNum);
        System.out.println("And the square root of " + userNum + " is " + remainder + "!");

        System.out.println("Enter a larger integer:");
        userNum2 = scan.nextInt();
        userNumResult = (userNum2 / userNum);
        remainder = (userNum2 % userNum);

        System.out.println("Integer division of " + userNum2 + " divided by " + userNum + " is " + userNumResult);
        System.out.println("Remainder when " + userNum2 + " is divided by " + userNum + " is " + (int) remainder);

        System.out.println("Floating point division of " + userNum2 + " divided by " + (int) userNum + " is "
                + (double) userNum2 / userNum);

    }
}