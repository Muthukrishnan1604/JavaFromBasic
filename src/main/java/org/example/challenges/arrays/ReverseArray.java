package src.main.java.org.example.challenges.arrays;


import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 6, 8, 9, 10};
        System.out.println("---- Before Reverse ----");
        System.out.println(Arrays.toString(inputArray));
        System.out.println("---- After Reverse ----");
        System.out.println(Arrays.toString(reverse(inputArray)));

        inputArray = new int[]{1, 2, 6, 9, 10};
        System.out.println("---- Before Reverse ----");
        System.out.println(Arrays.toString(inputArray));
        System.out.println("---- After Reverse ----");
        System.out.println(Arrays.toString(reverse(inputArray)));
        
    }

    private static int[] reverse(int[] inputArray) {
        int i = 0, j = inputArray.length - 1, tmp;
        while (i < j) {
            tmp = inputArray[j];
            inputArray[j] = inputArray[i];
            inputArray[i] = tmp;
            i++;
            j--;
        }
        return inputArray;
    }
}
