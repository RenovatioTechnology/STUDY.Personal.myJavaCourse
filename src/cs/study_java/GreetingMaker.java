package cs.study_java;

//String modify example: Greeting.
import java.util.Scanner;

public class GreetingMaker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userName;
        String greetingText;

        System.out.print("Enter name: ");
        userName = scnr.nextLine();

        // Combine strings using +
        greetingText = "Hello " + userName;

        // Append a period (could have used +)
        greetingText = greetingText.concat(".");
        System.out.println(greetingText);

        // Insert Mr/Ms before user's name
        greetingText = "Hello Mr/Ms ";
        greetingText = greetingText.concat(userName);
        greetingText = greetingText.concat(".");
        System.out.println(greetingText);

        // Replace occurrence of "Darn" by "@$#"
        greetingText = greetingText.replace("Darn", "@$#");
        System.out.println(greetingText);
    }
}