package src.main.java.org.example.arrays.multidimensionalarray;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[5][4];
        System.out.println(Arrays.toString(twoDimArray));
        twoDimArray[0][0] = 1;
        twoDimArray[0][0] = 2;
        int[][] twoDimArray1 = new int[3][];
        System.out.println(Arrays.toString(twoDimArray1));

        for(int[] outer:twoDimArray) {
            System.out.println(Arrays.toString(outer));
        }

        iterateThroughNormalLoop(twoDimArray);

        iterateThroughForEachLoop(twoDimArray);

        System.out.println(Arrays.deepToString(twoDimArray));

        multiDimArray();
    }

    private static void multiDimArray() {
        Object[] objArray = new Object[3];
        objArray[0] = new int[3];
        objArray[1] = new String[3][];
        objArray[2] = new long[3][][];

        for(Object obj : objArray) {
            System.out.println("Element type = " + obj.getClass().getSimpleName());
            System.out.println(Arrays.deepToString(new Object[]{obj}));
        }
    }

    private static void iterateThroughForEachLoop(int[][] twoDimArray) {
        for(int[] outerArray : twoDimArray) {
            for(int value : outerArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


    private static void iterateThroughNormalLoop(int[][] twoDimArray) {
        for(int i = 0; i < twoDimArray.length; i++) {
            int[] innerArray = twoDimArray[i];
            for(int j = 0; j < innerArray.length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }

}
