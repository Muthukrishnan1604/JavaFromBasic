package src.main.java.org.example.challenges.generics.maximum;

/*
Challenge 1: Generic Maximum Element Finder
Design a generic static method named findMax that takes a generic list and a Comparator as arguments.

The method should accept a List<T> and a Comparator<T>.

It must return the largest element in the list, as determined by the provided Comparator.

If the list is empty, the method should return null.

Question: Implement the findMax method within a utility class, ensuring it is robust and handles the edge case of an empty list.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElementFinder {

    public static void main(String[] args) {
        Comparator<Integer> integerComparator = (s1, s2) -> s1.compareTo(s2);
        Comparator<Double> doubleComparator = (s1, s2) -> s1.compareTo(s2);
        Comparator<Long> longComparator = (s1, s2) -> s1.compareTo(s2);
        Comparator<Float> floatComparator = Comparator.reverseOrder();

        List<Integer> integerList = Arrays.asList(25, 100, 1, 2, 5, 10, 12, 89);
        List<Double> doubleList = Arrays.asList(25.0, 100.0, 1.0, 2.0, 5.0, 10.0, 12.0, 89.0);
        List<Long> longList = Arrays.asList(25L, 100L, 1L, 2L, 5L, 10L, 12L, 89L);
        List<Float> floatList = List.of(25.0F, 100.0F, 1.0F, 2.0F, 5.0F, 10.0F, 12.0F, 89.0F);

        System.out.println(findMax(integerList, integerComparator));
        System.out.println(findMax(doubleList, doubleComparator));
        System.out.println(findMax(longList, longComparator));
        System.out.println(findMax(null, integerComparator));
        System.out.println(findMax(floatList, floatComparator));
        System.out.println(findMax(Arrays.asList("Muthu", "Divi", "Hema"), Comparator.naturalOrder()));
    }

    private static <T> T findMax(List<? extends T> inputList, Comparator<T> comparator){
        if(inputList != null && !inputList.isEmpty()) {
            return inputList.stream().max(comparator).orElse(null);
        }
        return null;
    }

}
