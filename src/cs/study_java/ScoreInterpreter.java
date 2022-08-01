package cs.study_java;
// Author: Jefferson J Nah

import java.util.Scanner;

public class ScoreInterpreter {

    public static void main(String[] args) {
        int score = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your test score:");
        score = userInput.nextInt();

        if (score >= 80) {
            System.out.println("Doing well");

        } else if (score < 60) {
            System.out.println("Study more");
            System.out.println("and go to office hours for help");
        }

        else {
            System.out.println("Study more");
        }

        return;
    }
}