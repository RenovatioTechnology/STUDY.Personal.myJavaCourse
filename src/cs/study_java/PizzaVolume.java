package cs.study_java;
public class PizzaVolume {

    public static double calcPizzaVolume(double pizzaDiameter, double pizzaHeight) {
        double pizzaRadius;
        double pizzaArea;
        double pizzaVolume;
        double piVal = 3.14159265;

        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        pizzaVolume = pizzaArea * pizzaHeight;
        return pizzaVolume;
    }

    public static void main(String[] args) {
        System.out.println("12.0 x 0.3 inch pizza is " + calcPizzaVolume(12.0, 0.3) + " inches cubed");
        System.out.println("12.0 x 0.8 inch pizza is " + calcPizzaVolume(12.0, 0.8) + " inches cubed");
        System.out.println("16.0 x 0.8 inch pizza is " + calcPizzaVolume(16.0, 0.8) + " inches cubed");
    }
}