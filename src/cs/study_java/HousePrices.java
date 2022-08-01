package cs.study_java;


// Author: (Jefferson J Nah Jr.)

import java.util.Scanner;

public class HousePrices {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currentPrice;
        int lastMonthsPrice;
        int mthlyWholeDollars;
        double estMonthlyMtge;
        double value1 = 0.045;
        int value2 = 12;

        System.out.println("Enter current and previous prices:");
        currentPrice = scnr.nextInt();
        lastMonthsPrice = scnr.nextInt();

        estMonthlyMtge = (currentPrice * value1 / value2);
        lastMonthsPrice = (currentPrice - lastMonthsPrice);
        mthlyWholeDollars = (int) estMonthlyMtge;

        System.out.println("House price is " + "$" + currentPrice + ". The change is " + "$" + lastMonthsPrice
                + " since last month.");
        System.out.println("The estimated monthly mortgage is " + "$" + mthlyWholeDollars + ".");
        mthlyWholeDollars = (mthlyWholeDollars * value2);
        System.out.println("The annual mortgage cost would be " + "$" + mthlyWholeDollars + ".");
    }
}
