package cs.study_java;
import java.util.Scanner;

public class WordScramble {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userWord;

        System.out.print("Enter a word with 5 letters: ");
        userWord = scnr.next();

        System.out.print("Scrambled: ");
        System.out.print(userWord.charAt(3));
        System.out.print(userWord.charAt(1));
        System.out.print(userWord.charAt(4));
        System.out.print(userWord.charAt(0));
        System.out.print(userWord.charAt(2));
        System.out.println();
    }
}