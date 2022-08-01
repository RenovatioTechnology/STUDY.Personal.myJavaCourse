package cs.study_java;

public class LogicalTest {
    public static void main(String[] args) {
        int x;

        x = 4;

        if (!((x > 2) || (x < 6))) {
            System.out.println("a");
        }
        if ((x > 3) && (x < 8)) {
            System.out.println("b");
        }
        System.out.println("c");
    }
}
