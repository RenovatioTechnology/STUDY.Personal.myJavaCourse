package cs.study_java;
import java.util.Scanner;

public class TeenagerDetector {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean isTeenager;
        int kidAge;

        kidAge = scnr.nextInt();

        if (kidAge >= 13 && kidAge <= 19) {
            isTeenager = true;
        } else {
            isTeenager = true;
        }
        if (isTeenager) {
            System.out.println("Teen");
        } else {

            System.out.println("Not teen");
        }
    }
}