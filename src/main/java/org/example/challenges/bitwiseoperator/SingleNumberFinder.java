package src.main.java.org.example.challenges.bitwiseoperator;

/*
Challenge 1: Single Number Finder (XOR Magic)
Given an array of integers where every element appears twice except for one, find that single element.
Your solution must have linear runtime complexity and use only constant extra space
(i.e., no use of HashMaps or extra arrays proportional to the input size).

Constraint: The solution must leverage the properties of the XOR (^) bitwise operator.

Question: Implement a method findSingleNumber(int[] nums) that efficiently returns the unique element.
 */

public class SingleNumberFinder {

    public static void main(String[] args) {

        System.out.println(singleNumberFinder(new int[] {10, 20, 30, 1, 3, 1, 20, 10, 30}));

        System.out.println(singleNumberFinder(new int[] {1, 20, 30, 1, 3, 1, 1, 10, 30, 20, 10}));

    }

    public static int singleNumberFinder(int[] inputs) {
        int result = 0;
        for(int input : inputs) {
            result ^= input;
        }
        return result;
    }
}
