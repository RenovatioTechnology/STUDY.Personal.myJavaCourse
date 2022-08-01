package cs.study_java;
import java.util.Scanner;

public class StringOutput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str1 = scnr.nextLine();
        String str2 = scnr.next();

        System.out.println(str1);
        System.out.println(str2);
    }
}