package cs.study_java;


public class ConditionalTest {
    public static void main(String[] args) {
        int myNumber;
        int yourNumber;

        myNumber = 7;
        yourNumber = (myNumber <= 6) ? myNumber + 9 : myNumber - 3;

        System.out.println(yourNumber);
    }
}