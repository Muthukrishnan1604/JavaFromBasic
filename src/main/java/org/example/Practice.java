package src.main.java.org.example;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
       // minimumNumberOfMultiplicationAndAdditionRequired();
        findMissingNumberApproach1();

        findMissingNumberApproach2();
    }

    private static void minimumNumberOfMultiplicationAndAdditionRequired() {
        int[] arr = {5, 2, 6, 7, 20};
        int[] res = new int[arr.length];
        // 3, 2,
        for(int i = 0; i < arr.length; i++) {
            int number = arr[i], addition = 0, multiplication = 0;
            while (number > 0) {
                if (number % 2 == 0) {
                    number = number/2;
                    multiplication = multiplication + 1;
                } else {
                    number--;
                    addition = addition + 1;
                }
            }
            res[i] = multiplication + addition;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));

    }

    private static void findMissingNumberApproach1() {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1, missing = Integer.MIN_VALUE;
        while (i < j) {
            if(((arr[i] + 1) == arr[i + 1]) &&  ((arr[j] - 1) == arr[j - 1])) {
                i++;
                j--;
            } else {
                if ((arr[j] - 1) != arr[j - 1]) {
                    missing = arr[j] - 1;
                } else {
                    missing = arr[i] + 1;
                }
                break;
            }
        }
        System.out.println(missing);
    }

    private static void findMissingNumberApproach2() {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int missingNumber = ((max * (max + 1))/2) - sum;

        System.out.println(missingNumber);
    }

}
