package cs.study_java;
import java.util.Scanner;

public class ShowMarriedNames {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName1;
        String lastName1;
        String firstName2;
        String lastName2;
        String firstNames;
        // FIXME: Declare lastName
        String lastName;

        System.out.println("What is the first person's first name?");
        firstName1 = scnr.nextLine();
        System.out.println("What is the first person's last name?");
        lastName1 = scnr.nextLine();

        System.out.println("What is the second person's first name?");
        firstName2 = scnr.nextLine();
        System.out.println("What is the second person's last name?");
        lastName2 = scnr.nextLine();

        System.out.println("Here are some common married-couple names:");
        System.out.println(firstName1 + " " + lastName1 + " and " +
                firstName2 + " " + lastName2);

        firstNames = firstName1 + " and " + firstName2;
        System.out.println(firstNames + " " + lastName1);
        System.out.println(firstNames + " " + lastName2);

        // FIXME: Use lastName variable similarly to firstNames variable
        System.out.println(firstNames + " " + lastName1 + "-" + lastName2);
        System.out.println(firstNames + " " + lastName2 + "-" + lastName1);

        lastName = lastName1 + lastName2;
        System.out.println(firstNames + " " + lastName);

        lastName = lastName2 + lastName1;
        System.out.println(firstNames + " " + lastName);

    }
}