package cs.study_java;

public class MethodsCallingMethods {

    public static double calcCircleArea(double circleDiameter) {
        double circleRadius;
        double circleArea;
        double piVal = 3.14159265;

        circleRadius = circleDiameter / 2.0;
        circleArea = piVal * circleRadius * circleRadius;

        return circleArea;
    }

    public static double pizzaCalories(double pizzaDiameter) {
        double totalCalories;
        double caloriesPerSquareInch = 16.7; // Regular crust pepperoni pizza

        totalCalories = calcCircleArea(pizzaDiameter) * caloriesPerSquareInch;

        return totalCalories;
    }

    public static void main(String[] args) {
        System.out.printf("12 inch pizza has %.2f calories.\n", pizzaCalories(12.0));
        System.out.printf("14 inch pizza has %.2f calories.\n", pizzaCalories(14.0));
    }
}