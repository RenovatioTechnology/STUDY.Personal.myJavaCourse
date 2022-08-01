package cs.study_java;

public class DogAgeFormat {
    public static void main(String[] args) {

        System.out.printf("Dog age in human years (dogyears.com)\n\n");
        System.out.printf("-------------------------\n");

        // set num char for each column, left aligned
        System.out.printf("%-10s | %-12s\n", "Dog age", "Human age");
        System.out.printf("-------------------------\n");

        // set num char for each column, first col left aligned
        System.out.printf("%-10s | %24s\n", "2 months", "14 months");
        System.out.printf("%-10s | %12s\n", "6 months", "5 years");
        System.out.printf("%-10s | %12s\n", "8 months", "9 years");
        System.out.printf("%-10s | %12s\n", "1 year", "15 years");
        System.out.printf("-------------------------\n");

    }
}
