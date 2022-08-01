
package cs.study_java;

/*
 * The program calculate a pool shape, base on available space for each hotel.
 * The pool shape will be the equivalent of a two regular hexagons joined
 * together by a rectangle.
 */

/**
 * @author Jefferson Nah
 */
import java.util.Scanner; // Note: Needed for user input

public class PoolDimensions {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // constants variables
        final double METERS_IN_FOOT = 0.3048;
        final double FEET_IN_SQUARE_METER = 10.7639;
        final double RECTANGLE_JOINS_HEX = 2.2;
        // hexagon and rectangle
        double rectangleHeight;
        double rectangleWidth;
        double rectangleArea;
        double hexagonArea1;
        double hexagonArea2;
        // Pool length and metric
        double totalPoolArea;
        double sqMetric;
        double poolPerimeterLength;
        double poolPerimeterMetric;
        // Gallons of water needed to fill pool
        double gallonsOfWater;
        double POOL_DEPTH = 6;
        // Prompts
        char district;
        String city = null;
        String state = null;
        double hexagonSide;

        System.out.println("Program to calculate pool dimensions");
        System.out.println();
        System.out.println("Enter hotel district:");
        district = scnr.next().charAt(0);
        scnr.nextLine();
        System.out.println("Enter hotel city:");
        city = scnr.nextLine();
        System.out.println("Enter hotel state:");
        state = scnr.nextLine();
        System.out.println("Enter hexagon side length in feet:");
        hexagonSide = scnr.nextDouble();
        System.out.println();
        System.out.println();

        // Rectangle Area
        rectangleHeight = hexagonSide;
        rectangleWidth = hexagonSide * RECTANGLE_JOINS_HEX;
        rectangleArea = rectangleHeight * rectangleWidth;
        // Calculate the pool area 1 and 2
        hexagonArea1 = hexagonSide * hexagonSide * 3 * Math.sqrt(3) / 2;
        hexagonArea2 = hexagonArea1;

        totalPoolArea = rectangleArea + hexagonArea1 + hexagonArea2;
        sqMetric = totalPoolArea / FEET_IN_SQUARE_METER;

        poolPerimeterLength = (8 * hexagonSide) + (2 * (rectangleWidth +
                rectangleHeight));
        poolPerimeterMetric = poolPerimeterLength * METERS_IN_FOOT;

        gallonsOfWater = rectangleHeight * rectangleWidth * POOL_DEPTH;

        // Output
        System.out.println("Calculations for hotel pool in");
        System.out.printf("%30s\n", "District " + district);
        System.out.printf("%30s\n", city);
        System.out.printf("%30s\n", state);
        System.out.println();

        System.out.printf("Rectangle area%16.3f\n", rectangleArea);
        System.out.printf("Hexagon 1 area%16.3f\n", hexagonArea1);
        System.out.printf("Hexagon 2 area%16.3f\n", hexagonArea2);

        System.out.printf("%31s", "--------\n");
        System.out.printf("Total pool area%15.3f sq ft\n", totalPoolArea);
        System.out.printf("and in metric%17.3f sq meters\n", sqMetric);
        System.out.println();
        System.out.printf("Pool perimeter length%9.1f ft\n", poolPerimeterLength);
        System.out.printf("and in metric%17.1f meters\n", poolPerimeterMetric);
        System.out.println();
        System.out.printf((int) gallonsOfWater + " gallons of water will be needed to fill the pool");
        System.out.println();

        return;

    }
}
