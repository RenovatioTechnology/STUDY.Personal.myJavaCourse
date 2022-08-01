package cs.study_java;
/*
 *  The program will help calculate the cost for customer’s concert ticket purchases, 
 * for a small local concert venue
 */

/**
 * @author Jefferson J Nah
 */
import java.util.Scanner; // Note: Needed for user input

public class TicketPurchasesV2 {

    // constants variables, unchange values
    static final double CONCERT_LESS_THEN_10 = 44.00;
    static final double CONCERT_GREATER_THEN_10 = 40.00;
    static final int TICKET_COST = 25;
    static final double DJ_LESS_THEN_10 = 25.00;
    static final double DJ_GREATER_THEN_10 = 20.00;
    static final double FLOOR_TICKET = 0.0;
    static final double BLEACHER_TICKET = 4.99;
    static final double RESERVED_ROW_TICKET = 9.99;
    static final double RESERVED_TABLE_TICKET = 15.99;
    static final double TSHIRTS_LESS_THEN_5 = 22.95;
    static final double TSHIRTS_LESS_THEN_12 = 21.25;
    static final double TSHIRTS_GREATER_THEN_12 = 19.00;

    public static void main(String[] args) {

        // user input variables
        Scanner scnr = new Scanner(System.in);
        int ticketType;
        String seatChoice = "";
        String seatSelect = "";
        int ticketCount;
        int t_shirtCount;
        double ticketCost = 0;
        double t_shirtCost;
        double seatCost = 0;
        char choice;
        boolean isTrue;

        // Output variables

        // The Program entry starts here!
        System.out.println("Ticket Purchase Ordering System\n");

        System.out.println("Enter 1 for the concert or 2 for DJ dancing:");
        ticketType = scnr.nextInt();
        seatChoice = (ticketType == 1) ? "concert" : "DJ dancing";
        System.out.println("How many " + seatChoice + " tickets?");
        ticketCount = scnr.nextInt();

        if ((ticketType == 1) && (ticketCount > TICKET_COST)) {
            System.out.println("ERROR! A maximum of " + TICKET_COST + " tickets"
                    + " may be purchased at once.");

            System.out.println("Order will be adjusted to " + TICKET_COST + " tickets.\n");
            ticketCount = TICKET_COST;
        }

        System.out.println("Seating options are");
        System.out.println("  F - floor (no seats)");
        System.out.println("  B - bleachers (open seating)");
        System.out.println("  R - row seats (reserved)");
        System.out.println("  T - table seats (reserved)");
        System.out.println("Enter choice:");

        choice = scnr.next().toUpperCase().charAt(0);
        switch (choice) {
            case 'F':
                seatCost = ticketCount * FLOOR_TICKET;
                seatSelect = ("floor");
                break;
            case 'B':
                seatCost = ticketCount * BLEACHER_TICKET;
                seatSelect = ("bleachers");
                break;
            case 'R':
                seatCost = ticketCount * RESERVED_ROW_TICKET;
                seatSelect = ("row seat");
                break;
            case 'T':
                seatCost = ticketCount * RESERVED_TABLE_TICKET;
                seatSelect = ("table");
                break;
            default:
                System.out.println("Invalid choice - floor will be used");
                seatSelect = ("floor");
                System.out.println();
                break;
        }

        System.out.println("How many t-shirts?");
        t_shirtCount = scnr.nextInt();

        if (seatChoice.charAt(0) == 'B') {
            seatCost = ticketCount * BLEACHER_TICKET;
        } else if (seatChoice.charAt(0) == 'F') {
            seatCost = ticketCount * FLOOR_TICKET;
        } else if (seatChoice.charAt(0) == 'R') {
            seatCost = ticketCount * RESERVED_ROW_TICKET;
        }

        else if (seatChoice.charAt(0) == 'T') {
            seatCost = ticketCount * RESERVED_TABLE_TICKET;
        }

        if (ticketCount < 10) {
            if (seatChoice == ("concert"))
                ticketCost = ticketCount * CONCERT_LESS_THEN_10;
            else
                ticketCost = ticketCount * DJ_LESS_THEN_10;
        } else {
            if (seatChoice == ("concert"))
                ticketCost = ticketCount * CONCERT_GREATER_THEN_10;
            else
                ticketCost = ticketCount * DJ_GREATER_THEN_10;
        }

        if (t_shirtCount >= 1 && t_shirtCount <= 5) {
            t_shirtCost = t_shirtCount * TSHIRTS_LESS_THEN_5;
        } else if (t_shirtCount >= 6 && t_shirtCount <= 12) {
            t_shirtCost = t_shirtCount * TSHIRTS_LESS_THEN_12;
        } else {
            t_shirtCost = t_shirtCount * TSHIRTS_GREATER_THEN_12;
        }
        // Output
        if (t_shirtCount == 1 && t_shirtCount == 2) {
            isTrue = true;
        } else {

            isTrue = false;
        }

        if (seatChoice.charAt(0) == 'F') {
            isTrue = true;
        } else if (seatChoice.charAt(0) != 'F') {

            isTrue = false;
        }
        if (seatCost == 0 && choice == 'F' && t_shirtCount > 2) {
            isTrue = true;
        } else {
            isTrue = false;
        }
        System.out.println();
        System.out.println();
        System.out.println("TICKET ORDER");
        System.out.printf("%-17s %17s\n", "Event type:", seatChoice);
        System.out.printf("%-16s %16s\n", "Number of tickets:", ticketCount);

        System.out.printf("%-17s %17s\n", "Seating type:", seatSelect);

        if (isTrue) {

            System.out.printf("%-15s %15s\n", "Number of t-shirts:", t_shirtCount);
        }

        System.out.println();
        System.out.println("TICKET BILL");
        if (choice == 'F' && ticketType == 2) {
            System.out.printf("%-28s %.2f%n", "Ticket cost:", ticketCost);
        }

        if (isTrue) {
            System.out.printf("%-29s %.2f%n", "Seating cost:", seatCost);
        }

        if (t_shirtCount != 0) {
            System.out.printf("%-28s %.2f%n", "T-shirt cost:", t_shirtCost);
        }

        if (t_shirtCount != 0) {
            if (seatChoice.charAt(0) != 'F') {
                System.out.printf("%36s", "----------\n");
                System.out.printf("%-28s %.2f%n", "Total", (ticketCost + seatCost +
                        t_shirtCost));

            } else {
                System.out.printf("%36s", "----------\n");
                System.out.printf("%-28s %.2f%n", "Total", (ticketCost + seatCost));

            }
        } else {
            if (isTrue) {
                System.out.printf("%-28s %.2f%n", "Total", (ticketCost + t_shirtCost));

            }
        }

        return;
    }

}
