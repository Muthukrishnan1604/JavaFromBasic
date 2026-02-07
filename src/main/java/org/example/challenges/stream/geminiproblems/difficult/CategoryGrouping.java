package src.main.java.org.example.challenges.stream.geminiproblems.difficult;

/*
Problem Statement -

Description: Given a list of Product objects (fields: String name, String category), create a Map where the key is the category and the value is a List of product names (Strings) belonging to that category.

Input: List.of(new Product("Apple", "Fruit"), new Product("Banana", "Fruit"), new Product("Broccoli", "Veggie"))

Expected Output: {Fruit=[Apple, Banana], Veggie=[Broccoli]}
 */

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

record Product(String name, String category) {

}

public class CategoryGrouping {

    public static void main(String[] args) {
        List<Product> productList = List.of(new Product("Apple", "Fruit"),
                new Product("Banana", "Fruit"),
                new Product("Broccoli", "Veggie"));

        Map<String, List<String>> result = productList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Product::category, Collectors.mapping(Product::name, Collectors.toList())) );

        System.out.println(result);
    }

}
