package src.main.java.org.example.challenges.collections.collectionclass;

/*
Challenge 1: Find Min and Max
Task: Write a method getMinAndMax(List<Integer> list) that returns a new List<Integer> containing the minimum and maximum values
from the input list, respectively.
You must use a method from the Collections class to find the minimum and maximum values.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        List<Integer> inputList = List.of(5, 2, 8, 1, 9, 4);

        System.out.println(getMinAndMax(inputList));
    }

    public static List<Integer> getMinAndMax(List<Integer> inputList) {
        return new ArrayList<>(List.of(Collections.max(inputList), Collections.min(inputList)));
    }
}
