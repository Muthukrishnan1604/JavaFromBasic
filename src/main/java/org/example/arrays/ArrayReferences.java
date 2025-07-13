package src.main.java.org.example.arrays;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {

        int[] intArray = new int[5];
        int[] anotherArray = intArray;

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        intArray[0] = 1;
        anotherArray[1] = 5;
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }



}
