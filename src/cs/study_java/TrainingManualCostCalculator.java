package cs.study_java;
/*
 *  The program will calculate the costs for printing and mailing a training manual. 
 */

/**
 * @author Jefferson Nah
 */
import java.util.Scanner; // Note: Needed for user input

public class TrainingManualCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // constants variables
        final double PER_PAGE_COLOR = 0.06;
        final double BLACK_WHITE_PAGE_COLOR = 0.04;

        final double FIRST_OUNCE = 0.98;
        final double ADDITIONAL_OUNCE = 0.21;
        final double MAILING_PAGE_WEIGHT = 6.1;
        final double MAILING_COVER_WEIGHT = 2;
        char PRINTING_MAILING = '$';

        int colorPageCount = 0;
        int blackWhitePageCount = 0;

        int totalManualPages;
        double mnlCoverCost;
        double mnlBudgetCost;
        double printCost, printBudget, totalBudgetCost;
        double colorPageTotal;
        double blackWhitePageTotal;
        double weighs;
        double ounces;

        System.out.println("Program to calculate training manual costs");
        System.out.println();

        System.out.println("Enter the number of black and white pages:");
        blackWhitePageCount = scan.nextInt();
        System.out.println("Enter the number of color pages:");
        colorPageCount = scan.nextInt();
        System.out.println();

        totalManualPages = (blackWhitePageCount + colorPageCount);
        System.out.println("There are " + totalManualPages + " pages in the training manual");
        System.out.println();

        System.out.println("Enter the cover cost:");
        mnlCoverCost = scan.nextDouble();

        System.out.println("Enter the budget for training manuals:");
        printBudget = scan.nextDouble();

        colorPageTotal = (colorPageCount * PER_PAGE_COLOR);
        blackWhitePageTotal = (blackWhitePageCount * BLACK_WHITE_PAGE_COLOR);
        printCost = (colorPageTotal + blackWhitePageTotal + mnlCoverCost);

        System.out.println();
        System.out.println("For one manual:");
        System.out.println("    Color printing cost is " + colorPageTotal);
        System.out.println("    Black & white printing cost is " + blackWhitePageTotal);
        System.out.println("Total printing cost with cover is " + printCost + " per manual");

        weighs = Math.ceil(totalManualPages / MAILING_PAGE_WEIGHT) + MAILING_COVER_WEIGHT;
        ounces = (FIRST_OUNCE + ADDITIONAL_OUNCE * (weighs - 1));

        System.out.println();
        System.out.println("Each manual weighs " + weighs + " ounces and will cost " + ounces + " to mail");

        System.out.println();
        mnlBudgetCost = (printCost + ounces);
        System.out.println("Cost per manual (printing and mailing) is " + PRINTING_MAILING + mnlBudgetCost);

        totalBudgetCost = Math.floor(printBudget / mnlBudgetCost);
        System.out.println("Your budget will cover the costs of printing and mailing " + totalBudgetCost + " manuals");
        return;

    }

}