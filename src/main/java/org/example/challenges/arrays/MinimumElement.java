package src.main.java.org.example.challenges.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int[] userInputList = readIntegers();
        System.out.println(Arrays.toString(userInputList));
        System.out.println("Minimum value = " + findMin(userInputList));

        System.out.println("Minimum value = " + findMinApproach2(userInputList));

        System.out.println("Minimum value = " + findMinUsingUtils(userInputList));

        int[] manualInput = {1, 4, 6, -1, 0};
        System.out.println("Minimum value = " + findMin(manualInput));
    }

    private static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int sizeOfArray = sc.nextInt();
        int[] userInputList = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++) {
            userInputList[i] = sc.nextInt();
        }
        sc.close();
        return userInputList;
    }

    private static int[] readIntegersUsingSplit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, seperated by commas: ");
        String input = sc.nextLine();
        String[] split = input.split(",");
        int[] userInputList = new int[split.length];
        for(int i = 0; i < split.length; i++) {
            userInputList[i] = Integer.valueOf(split[i]);
        }
        sc.close();
        return userInputList;
    }


    private static int findMin(int[] inputList) {
        int min = 0, tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for(int i = 0; i < inputList.length - 1; i++) {
                if(inputList[i] > inputList[i + 1]) {
                    tmp = inputList[i];
                    inputList[i] = inputList[i + 1];
                    inputList[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        min = inputList[0];
        return min;
    }

    private static int findMinUsingUtils(int[] inputList) {
        Arrays.sort(inputList);
        return inputList[0];
    }

    private static int findMinApproach2(int[] inputList) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < inputList.length ; i++) {
            if(min > inputList[i]) {
                min = inputList[i];
            }
        }
        return min;
    }
}
