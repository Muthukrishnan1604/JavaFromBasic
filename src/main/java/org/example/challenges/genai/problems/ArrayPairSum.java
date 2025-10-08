package src.main.java.org.example.challenges.genai.problems;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairSum {

    public static void main(String[] args) {

        int[] nums = {3, 5, 2, 8, 11, 7};

        int[] nums3 = {5, 5, 2};


        int target = 10;

        int[] nums2 = {1, 2, 3, 4, 5};

        //System.out.println(hasPairWithSumBruteForce(nums, target));

        //System.out.println(hasPairWithSumBruteForce(nums2, target));

        System.out.println(hasPairWithSum(nums2, target));

    }

    /**
     * Determines if there are two distinct elements in the array that sum up to the target value.
     * Time Complexity: O(n) - Each element is visited once and set operations (add/contains) are O(1).
     * Space Complexity: O(n) - In the worst case, all n elements are stored in the set.
     *
     * @param nums The integer array to search.
     * @param target The target sum.
     * @return true if a pair is found, false otherwise.
     */
    public static boolean hasPairWithSum(int[] nums, int target) {
        // Use a HashSet for O(1) average time complexity lookups.
        Set<Integer> seenNumbers = new HashSet<>();

        // Iterate through the array once.
        for (int num : nums) {
            // 1. Calculate the required complement.
            int complement = target - num;

            // 2. Check if the complement has already been seen.
            // If it has, we found a pair (num + complement = target).
            if (seenNumbers.contains(complement)) {
                return true;
            }

            // 3. Add the current number to the set for future lookups.
            seenNumbers.add(num);
        }

        // If the loop finishes without finding a pair, return false.
        return false;
    }

    private static boolean hasPairWithSumBruteForce(int[] arr, int target) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if((arr[i] + arr[j]) == target) {
                    return true;
                }
            }
        }
        return false;
    }

}
