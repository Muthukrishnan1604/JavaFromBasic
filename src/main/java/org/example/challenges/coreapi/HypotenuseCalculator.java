package src.main.java.org.example.challenges.coreapi;

public class HypotenuseCalculator {

    public static void main(String[] args) {
        System.out.println(calculate(3.0, 4.0));
        System.out.println(calculate(5.0, 12.0));
        System.out.println(calculate(8.0, 15.0));
        System.out.println(calculate(1.0, 1.0));
    }

    private static double calculate(double input1, double input2) {
        System.out.println(Math.hypot(input1, input2));
        return Math.sqrt(Math.pow(input1, 2) + Math.pow(input2, 2));
    }

}
