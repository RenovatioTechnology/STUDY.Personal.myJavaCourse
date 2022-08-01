package cs.study_java;
import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        double x;

        x = Math.sqrt(49.0);

        // This will output 1 decimal place
        System.out.printf("%.1f\n", x);

        x = Math.abs(-6.7);

        // This will output 1 decimal place
        System.out.printf("%.1f\n", x);

        x = Math.pow(3.0, 2.0);

        // This will output 1 decimal place
        System.out.printf("%.1f\n", x);

        x = Math.abs(-9.8 + 4.6);

        // This will output 1 decimal place
        System.out.printf("%.1f\n", x);

        x = Math.pow(3.0, Math.sqrt(4.0));

        // This will output 1 decimal place
        System.out.printf("%.1f\n", x);
    }
}

