package cs.study_java;


// Example: Get username from email address.
import java.util.Scanner;

public class ExtractUsername {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String emailText;
        int atSymbolIndex;
        String emailUsername;

        System.out.print("Enter email address: ");
        emailText = scnr.nextLine();

        atSymbolIndex = emailText.indexOf('@');
        if (atSymbolIndex == -1) {
            System.out.println("Address is missing @");
        } else {
            emailUsername = emailText.substring(0, atSymbolIndex);
            System.out.println("Username: " + emailUsername);
        }
    }
}
