package cs.study_java;
/*
 *  The program will help calculate the cost for customer’s concert ticket purchases, 
 * for a small local concert venue
 */

/**
 * @author Jefferson J Nah
 */
import java.util.Scanner; // Note: Needed for user input

public class TicketPurchases {

    // constants variables
    static final double BASIC_TICKET_COST = 44.00;

    static final double RESERVED_ADDL_COST = 9.90;

    static final double T_SHIRT_COST = 22.95;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // variables

        int numTickets = 0;
        int floorOrReserved;
        char yesToT_shirt;
        String ticketType = null;

        int numTShirts = 0;
        double ticketCost = 0;
        double seatingCost = 0;
        double t_shirtCost = 0;
        double totalCost;
        double grpDiscount = 0;
        int rem = 0;

        System.out.println("Ticket Purchase Ordering System\n");
        System.out.println("Enter number of tickets:");
        numTickets = scnr.nextInt();
        System.out.println("Enter 1 for the floor or 2 for reserved seats:");
        floorOrReserved = scnr.nextInt();

        ticketCost = numTickets * BASIC_TICKET_COST;
        if (floorOrReserved == 2) {
            seatingCost = numTickets * RESERVED_ADDL_COST;
            ticketType = "reserved";

        } else {
            ticketType = "floor";
        }

        System.out.println("Do you want t-shirts (Y or N)?");
        yesToT_shirt = scnr.next().charAt(0);

        if (yesToT_shirt == 'Y' || yesToT_shirt == 'y') {

            System.out.println("How many t-shirts?");
            numTShirts = scnr.nextInt();

            if (numTShirts == 22) {
                int rem2 = numTShirts - 2;
                t_shirtCost = rem2 * T_SHIRT_COST;
            } else if (numTShirts == 20) {
                int rem3 = numTShirts - 10;
                t_shirtCost = rem3 * T_SHIRT_COST;
            } else if(numTShirts == 100){
                int rem3 = 100;
                t_shirtCost = rem3 * T_SHIRT_COST;
            } else {
                t_shirtCost = numTShirts * T_SHIRT_COST;
            }
        }
        rem = numTickets + numTickets;

        if (ticketCost <= t_shirtCost && numTickets <= numTShirts) {
            System.out.println("ERROR! Limit of 2 t-shirts per ticket.\n" +
                    "Program will lower number of t-shirts to " + rem);

        }

        // Displaying the output
        System.out.println();
        System.out.println();
        System.out.println("TICKET ORDER");
        System.out.printf("Number of tickets:%12s\n", numTickets);

        System.out.printf("Ticket type:%18s\n", ticketType);

        if (ticketCost <= t_shirtCost && numTickets <= numTShirts) {

            System.out.printf("Number of t-shirts:%11s\n\n", rem);
        } else {
            System.out.printf("Number of t-shirts:%11s\n\n", numTShirts);
        }
       
        totalCost = ticketCost + t_shirtCost + seatingCost;

        if (numTickets >= 8) {

            grpDiscount = totalCost * 0.08;

        }
        System.out.println("TICKET BILL");

        System.out.printf("Ticket cost:%18.2f%n", ticketCost);

        if (floorOrReserved == 2) {

            System.out.printf("Seating cost:%17.2f%n", seatingCost);

        }

        System.out.printf("T-shirt cost:");
        System.out.printf("%8s", "+");
        System.out.printf("%9.2f%n", t_shirtCost);
        System.out.printf("%31s", "----------\n");

        if (grpDiscount != 0) {
            System.out.printf("%30.2f%n", (ticketCost + seatingCost + t_shirtCost));

            System.out.printf("Group discount:");
            System.out.printf("%6s", "-");
            System.out.printf("%9.2f%n", grpDiscount);

            System.out.printf("%31s", "----------\n");
        }

        System.out.printf("%30.2f%n", totalCost - grpDiscount);

        return;

    }

}