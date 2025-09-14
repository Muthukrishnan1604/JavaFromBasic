package src.main.java.org.example.challenges.collections.collectionclass;

/*
Challenge 2: Synchronize and Reverse
Task: Write a method getSynchronizedAndReversedList(List<String> list) that takes a list of strings and returns a synchronized view
of the list with its elements reversed in place. You must use methods from the Collections class for both tasks.

Example:

Input: ["alpha", "beta", "gamma"]

Output: A synchronized List with elements: ["gamma", "beta", "alpha"]
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizeAndReverse {

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>(List.of("alpha", "beta", "gamma"));
        var outputList = getSynchronizedAndReversedList(inputList);
        System.out.println(outputList);
    }

    public static List<String> getSynchronizedAndReversedList(List<String> inputList) {
        Collections.reverse(inputList);
        return Collections.synchronizedList(inputList);

    }

}
