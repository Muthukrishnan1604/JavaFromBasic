package src.main.java.org.example.arrays;

import java.util.Arrays;

public class ArrayBinarySearch {

    public static void main(String[] args) {
        String [] strings = {"Bharathi", "Divya", "Durai", "Hepsi", "Mano", "Muthu", "Victor"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        // Note -> We need to apply binary search only for sorted arrays
        if(Arrays.binarySearch(strings, "Hema") > 0) {
            System.out.println("Found in the list");
        } else {
            System.out.println("Name not found in the list");
        }

        int[] intList = {1, 2, 3, 4, 5};
        int[] intList2 = Arrays.copyOf(intList, intList.length);

        if(Arrays.equals(intList, intList2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

}
