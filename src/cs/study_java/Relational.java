package cs.study_java;
import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        int userBonus = 0;
        int userPoints = 0;

        Scanner input = new Scanner(System.in);
        userBonus = input.nextInt(); // Program will be tested with values: 15, 20, 25, 30, 35, 40

        if (userBonus <= 25) {
            userPoints = 10;
        } else {
            userPoints = 0;
        }

        System.out.println(userPoints);
    }
}