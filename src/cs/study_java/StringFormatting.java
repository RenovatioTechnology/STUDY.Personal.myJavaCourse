package cs.study_java;

// Author: Jefferson Nah Jr.

import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String major1stWord = null;
        String major2ndWord = null;
        String degreeType = null;
        String secMajor1stWord = null;
        String secMajor2ndWord = null;
        String secDegreeType = null;

        char major1char;
        char major2char;
        char secMajor1char;
        char secMajor2char;

        System.out.println("Enter a two-word major and degree type:");
        major1stWord = keyboard.next();
        major2ndWord = keyboard.next();
        degreeType = keyboard.next();
        System.out.println("Enter a second two-word major and degree type:");
        secMajor1stWord = keyboard.next();
        secMajor2ndWord = keyboard.next();
        secDegreeType = keyboard.next();

        // abbreviate to the first character in each word for Major
        major1char = major1stWord.charAt(0);
        major2char = major2ndWord.charAt(0);
        secMajor1char = secMajor1stWord.charAt(0);
        secMajor2char = secMajor2ndWord.charAt(0);

        System.out.println();
        // Major 1 Output, display the degree type abbreviated
        System.out.printf("%17s", degreeType + ", ");
        System.out.print(major1char);
        System.out.println(major2char);

        // Major 2 Output, and display the degree type abbreviated
        System.out.printf("%17s", secDegreeType + ", ");
        System.out.print(secMajor1char);
        System.out.println(secMajor2char);

        return;
    }
}