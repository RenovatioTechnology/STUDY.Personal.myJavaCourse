package cs.study_java;
public class SquareComputation {

    public static int computeSquare(int numToSquare) {
        return numToSquare * numToSquare;
    }

    public static void main(String[] args) {
        int numSquared;

        numSquared = computeSquare(7);
        System.out.println("7 squared is " + numSquared);
    }
}