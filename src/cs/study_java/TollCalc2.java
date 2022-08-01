package cs.study_java;
import java.util.Scanner;

public class TollCalc2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int timeHour; // Time of travel hour (24 hour format)
        int timeMinute; // Time of travel minute
        int typeOfDay; // 0 - weekday, 1 - weekend/holiday
        int inputColon; // Used to read time format
        String userInput; // User specified time
        double tollAmount;

        System.out.print("Enter time of travel (HH:MM in 24 hour format): ");

        // Read an integer (hour), colon (char), and integer (minute)
        // with built-in string operators (discussed elsewhere)
        userInput = scnr.nextLine();
        inputColon = userInput.indexOf(":");
        timeHour = Integer.parseInt(userInput.substring(0, inputColon));
        timeMinute = Integer.parseInt(userInput.substring(inputColon + 1, userInput.length()));

        System.out.print("Enter type of day (0 - weekday, 1 - weekend/holiday): ");
        typeOfDay = scnr.nextInt();

        if (typeOfDay == 0) { // Weekday time and rates
                              // Determine toll based on hour of travel
            if (timeHour < 6) { // Before 6:00 am
                tollAmount = 1.55;
            } else if (timeHour < 10) { // 6 am to 9:59 am
                tollAmount = 4.65;
            } else if (timeHour < 18) { // 10 am to 5:59 pm
                tollAmount = 2.35;
            } else { // 6 pm and after
                tollAmount = 1.55;
            }
        } else { // Weekend/holiday time and rates
                 // Determine toll based on hour of travel
            if (timeHour < 8) { // Before 8:00 am
                tollAmount = 1.55;
            } else if (timeHour < 12) { // 8 am to 11:59 am
                tollAmount = 3.05;
            } else if (timeHour < 16) { // 12 pm to 3:59 pm
                tollAmount = 3.45;
            } else if (timeHour < 19) { // 4 pm to 6:5 9pm
                tollAmount = 3.60;
            } else if (timeHour < 22) { // 7 pm to 9:59 pm
                tollAmount = 3.05;
            } else { // 10 pm and after
                tollAmount = 1.55;
            }
        }

        // Output toll using am/pm format
        System.out.print("Toll at ");

        // Output hour adjusting for am/pm format
        if (timeHour == 0) {
            System.out.print("12:");
        } else if (timeHour <= 12) {
            System.out.print(timeHour + ":");
        } else {
            System.out.print((timeHour - 12) + ":");
        }

        // Output minute with formatting (discussed elsewhere) to
        // print two digits for minutes.
        System.out.print(String.format("%02d", timeMinute));

        System.out.println(" is " + tollAmount);
    }
}