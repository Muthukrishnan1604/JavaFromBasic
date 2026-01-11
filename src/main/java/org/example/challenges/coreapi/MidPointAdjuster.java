package src.main.java.org.example.challenges.coreapi;

import java.util.List;

public class MidPointAdjuster {

    public static void main(String[] args) throws ClassNotFoundException {

        List<Double> doubleList = List.of(25.5, 3.2, -3.7, -2.5);

        doubleList.forEach(i -> {
                    System.out.printf("Ceiling value of %f is %f%n", i, getCeilingValue(i));
                    System.out.printf("Floor value of %f is %f%n", i, getFloorValue(i));
                    System.out.printf("Rounded value of %f is %d%n", i, getRoundedValue(i));
                });
    }

    private static double getCeilingValue(double input) {
        return Math.ceil(input);
    }

    private static double getFloorValue(double input) {
        return Math.floor(input);
    }

    private static long getRoundedValue(double input) {
        return Math.round(input);
    }
}
