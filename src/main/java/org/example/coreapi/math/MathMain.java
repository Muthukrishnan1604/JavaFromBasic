package src.main.java.org.example.coreapi.math;

import static java.lang.String.valueOf;

public class MathMain {

    public static void main(String[] args) {
        int maxMinusFive = Integer.MAX_VALUE - 5;

        /*
        for(int i = 0, id = maxMinusFive; i < 10; id = Math.incrementExact(id), i++) {
            System.out.printf("Assigning id %,d%n", id);
        }
        */

        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(Integer.MIN_VALUE));
       //System.out.println(Math.absExact(Integer.MIN_VALUE));
        System.out.println(Math.abs((long) Integer.MIN_VALUE));

        System.out.println(Math.max(-10, 100));
        System.out.println(Math.min(10.000002d, 10.0001f));

        System.out.println("Round Down = " + Math.round(10.2));
        System.out.println("Round up = " + Math.round(10.8));

        System.out.println("Floor = " + Math.floor(10.8));
        System.out.println("Ceil = " + Math.ceil(10.00001));

        System.out.println("Square root of 100 = " + Math.sqrt(100));
        System.out.println("2 to the 4 power (2*2*2*2) = " + Math.pow(2, 4));

        for(int i = 0; i < 10; i++) {
            System.out.println((char) ((Math.random() * 26) + 65));
        }
    }

}
