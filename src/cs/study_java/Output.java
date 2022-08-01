package cs.study_java;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        int numMinutes;
        try (// tests will run your program with input 2, then run again with input 5.
             // Your program should work for any input, though.
                Scanner scnr = new Scanner(System.in)) {
            numMinutes = scnr.nextInt();
        }
        System.out.println(numMinutes);
    }
}