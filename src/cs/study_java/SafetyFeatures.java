package cs.study_java;
import java.util.Scanner;

public class SafetyFeatures {

    public static void main(String[] args) {
        int carYear;

        Scanner input = new Scanner(System.in);
        carYear = input.nextInt();

        if (carYear < 1968) {
            System.out.printf("Probably has few safety features.");
            System.out.println();
        }
        if (carYear > 1971) {
            System.out.println("Probably has seat belts.");

        }
        if (carYear > 1991) {
            System.out.println("Probably has anti-lock brakes.");

        }
        if (carYear > 2002) {
            System.out.println("Probably has airbags.");

        }

    }
}