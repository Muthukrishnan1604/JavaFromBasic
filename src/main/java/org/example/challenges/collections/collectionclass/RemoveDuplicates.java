package src.main.java.org.example.challenges.collections.collectionclass;

/*
Challenge 1: Basic Manipulation
Task: Write a method removeDuplicates(List<String> list) that takes a list of strings and
returns a new list containing only the unique elements from the original list.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>(List.of("apple", "banana", "apple", "cherry", "banana"));
        List<String> outputList = new ArrayList<>(inputList.size());
        System.out.println(inputList);

        for (String value : inputList) {
            if(!outputList.contains(value)) {
                outputList.add(value);
            }
        }
        System.out.println("Input Data = " + inputList);
        System.out.println("Output Data = " + outputList);
    }

}
