package src.main.java.org.example.challenges.generics.DataFilter;

/*
Challenge 3: Generic Data Filtering with Comparable Constraint
Create a generic class called DataFilter that is designed to filter elements from a list based on a specific criteria,
but with a type constraint.

The DataFilter class should have a generic method filterGreaterThan(List<T> data, T threshold) that returns a new list containing
only the elements greater than the threshold.

The generic type T must be constrained to implement the Comparable<T> interface so that elements can be naturally compared.

Question: Implement the DataFilter class and the filterGreaterThan method, utilizing the Comparable constraint
(<T extends Comparable<T>>) to compare elements within the list against the threshold.
Demonstrate its use with a List<Integer> or List<String>.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DataFilter {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(25, 100, 1, 2, 5, 10, 12, 89);

        System.out.println(filterGreaterThan(integerList, 10));
    }


    private static <T extends Comparable<T>> List<T> filterGreaterThan(List<? extends T> data, T threshold) {

        if(data == null || data.isEmpty()) {
            return null;
        }
        List<T> result = new ArrayList<>();
        for(T input : data) {
            if(input.compareTo(threshold) > 0) {
                result.add(input);
            }
        }
        result.sort(Comparator.reverseOrder());
        return result;
    }

}
