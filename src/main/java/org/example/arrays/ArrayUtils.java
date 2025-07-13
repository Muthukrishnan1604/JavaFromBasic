package src.main.java.org.example.arrays;

import java.util.Arrays;
import java.util.Random;

/*
Array util class can have mutiple functions to perform initializing Value, Sorting and copying the array and
finding the elements
 */

public class ArrayUtils {

    public static void main(String[] args) {
        int[] intList = {1,2, 5, 8, 10};

        System.out.println(Arrays.toString(intList));

        Object objectVariable = intList;

        if(objectVariable instanceof int[]) {
            System.out.println("Object is int array");
        }

        Object[] objectArray = new Object[3];

        objectArray[0] = "Hello Muthu";
        objectArray[1] = intList;
        objectArray[2] = new double[]{1.0, 2.0, 3.0};

        for (Object obj : objectArray) {
            if(obj instanceof String ob) {
                System.out.println(ob.toUpperCase());
            } else if(obj instanceof double [] doubleArray) {
                System.out.println(Arrays.toString(doubleArray));
            }
        }

        int[] randomArray = getRandomArray(10);
        Arrays.sort(randomArray);
        printArray(randomArray);

        int[] secondArray = new int[10]; // This will set every element to o with int default value
        printArray(secondArray);

        Arrays.fill(secondArray, 5); // To fill with some default value we can use fill method in Arrays
        printArray(secondArray);

        Arrays.fill(secondArray, 5, 10, 10);
        printArray(secondArray);

        int[] thirdArray = getRandomArray(10);
        printArray(thirdArray);

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        printArray(fourthArray);

        Arrays.sort(fourthArray);
        printArray(thirdArray);
        printArray(fourthArray);

        /*In CopyOf function in array it won't throw the Array IndexOut Of Bound exception if
        we pass the length greater than the actual copy array length */

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        printArray(largerArray);

        /*
        We can partially copy the array as well
         */
        largerArray = Arrays.copyOf(thirdArray, 5);
        printArray(largerArray);
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newIntArray = new int[length];

        for(int i = 0; i < length; i++) {
            newIntArray[i] = random.nextInt(50);
        }

        return newIntArray;
    }

}
