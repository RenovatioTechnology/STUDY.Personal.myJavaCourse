package cs.study_java;
import java.util.Scanner;

public class TollCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int timeHour; // Time of travel hour (24 hour format)
        int timeMinute; // Time of travel minute
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

        // Output time and toll amount
        System.out.print("Toll at " + timeHour + ":");

        // Output minute with formatting (discussed elsewhere) to
        // print two digits for minutes.
        System.out.print(String.format("%02d", timeMinute));
        System.out.print(" is " + tollAmount);
    }
}