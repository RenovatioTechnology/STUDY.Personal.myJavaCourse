package cs.study_java;
// Assign secretID with firstName, a space, and lastName.
//Ex: If firstName is Barry and lastName is Allen, then output is:
// Barry Allen
import java.util.Scanner;
public class CombiningStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String secretID;
        String firstName;
        String lastName;

        firstName = scnr.next();
        lastName = scnr.next();

        secretID = firstName;
        char spaceChar = ' ';
        secretID = secretID + spaceChar;
        secretID = secretID.concat(lastName);

        System.out.println(secretID);
    }
}
