package src.main.java.org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! Java From Basic");
        int[] arr = {0, 0, 0, 4, 0, 5, 7, 0};
        int temp;
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
        System.out.println();
        efficientApproach(arr);

        int[] arr2 = {0, 0, 0, 0, 0, 5, 7, 0};
        efficientApproach(arr2);

        int[] arr3 = {10, 11, 0, 0, 0, 5, 7, 0};
        sumOfArray(arr3);

        sumOfArray2(arr3);

    }

    private static void efficientApproach(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (arr.length - 1 >= count) {
            arr[count] = 0;
            count++;
        }

        System.out.println("Efficient Approach");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    private static void sumOfArray(int[] arr) {

        int result = Arrays.stream(arr).sum();

        System.out.println(result);
    }

    private static void sumOfArray2(int[] arr) {

        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        System.out.println(result);
    }
}
