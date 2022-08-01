package cs.study_java;
import java.util.Scanner;

public class TicketCounter {
    public static void main(String[] args) {
        int awardPoints;
        int userTickets;

        Scanner scnr = new Scanner(System.in);
        userTickets = scnr.nextInt(); // Program will be tested with values: 6, 7, 8, 9.

        if (userTickets != 7) {
            awardPoints = 10;
        } else {
            awardPoints = userTickets;
        }

        System.out.println(awardPoints);
    }
}