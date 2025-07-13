package src.main.java.org.example.challenges.arrays;

import java.util.Arrays;
import java.util.Random;

public class DescendingSort {

    public static void main(String[] args) {
        int[] intArray = getRandomArray(10);
        System.out.println(Arrays.toString(intArray));
        linearSortInDesc(intArray);
        sortInDescUsingArrayUtils(intArray);
        otherWayToSortInDesc(intArray);
    }

    /*
        Method to perform sorting in descending order using Array utils
     */
    private static void sortInDescUsingArrayUtils(int[] intArray) {
        System.out.println("Sorting using the Array utils and String builder");
        Arrays.sort(intArray);
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for(int i = intArray.length - 1; i >= 0; i--) {
            builder.append(String.valueOf(intArray[i]));
            if(i > 0) {
                builder.append(", ");
            }
        }
        builder.append("]");
        System.out.println(builder.toString());
    }

    /*
        Below is the linear with time complexity O(n^2)
    */
    private static void linearSortInDesc(int[] intArray) {
        int max;
        for(int i = 0; i < intArray.length - 1; i++) {
            for(int j = i + 1; j < intArray.length; j++) {
                if(intArray[i] < intArray[j]) {
                    max = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = max;
                }
            }
        }
        System.out.println("Sorted in descending order");
        System.out.println(Arrays.toString(intArray));
    }

    /*
        Below is the bubble sort in desc order
    */
    private static void otherWayToSortInDesc(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
        int[] inputArray = Arrays.copyOf(intArray, intArray.length);
        boolean flag = true;
        int max;
        while (flag) {
            flag = false;
            for(int i = 0; i < inputArray.length - 1; i++) {
                if(inputArray[i] < inputArray[i + 1]) {
                    max = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = max;
                    flag = true;
                }
            }
        }
        System.out.println("Sorted in descending order using other way");
        System.out.println(Arrays.toString(inputArray));
    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] intArray = new int[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }
}
