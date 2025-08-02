package src.main.java.org.example.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndArrayList {

    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Two", "Three"};

        var originalList = Arrays.asList(originalArray);

        System.out.println(originalList.getClass().getName());

        originalList.set(0, "One");

        originalList.add("Four"); // This will throw the runtime error

        System.out.println("List elements = " + originalList);

        System.out.println("Array elements = " + Arrays.toString(originalArray));

    }

}
