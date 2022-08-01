package cs.study_java;
import java.util.Scanner;

public class Roshambo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int nextChoice;

        nextChoice = scnr.nextInt();

        if (nextChoice == 0) {
            System.out.println("Rock");
        } else if (nextChoice == 1) {
            System.out.println("Paper");
        } else if (nextChoice == 2) {
            System.out.println("Scissors");
        } else {
            System.out.println("Unknown");
        }

    }
}