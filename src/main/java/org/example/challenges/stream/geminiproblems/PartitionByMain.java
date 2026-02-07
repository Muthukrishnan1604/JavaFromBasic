package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionByMain {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> isPrime = i -> {
            int n = 2;
            while (n <= i/2) {
                if(i % n == 0) {
                    return false;
                }
                n++;
            }
            return true;
        };

        Map<Boolean, List<Integer>> result = integerList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.partitioningBy(isPrime));

        System.out.println(result);
    }

}
