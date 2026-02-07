package src.main.java.org.example.autoboxingandunboxing;

import java.util.Arrays;

public class BoxingOnArrayAndLists {

    public static void main(String[] args) {
        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        int[] intArray = new int[5];

        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());
        System.out.println(Arrays.toString(intArray));

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));
    }

}
