package src.main.java.org.example.challenges.stream.geminiproblems.groupby;

import java.util.*;
import java.util.stream.Collectors;

record Product(String name, String category) {

}

record Sale(String storeName, String productName, double amount) {

}


public class GroupingByMain {

    public static void main(String[] args) {
        List<Product> productList = List.of(new Product("Apple", "Fruit"),
                new Product("Banana", "Fruit"),
                new Product("Broccoli", "Veggie"),
                new Product("Carrot", "Veggie"),
                new Product("Orange", "Fruit"));

        Map<String, List<String>> groupByCategory = productList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Product::category, Collectors.mapping(Product::name, Collectors.toList())));

        System.out.println(groupByCategory);

        List<Sale> sales = List.of(
                new Sale("Store A", "Laptop", 1200.0),
                new Sale("Store B", "Phone", 800.0),
                new Sale("Store A", "Mouse", 50.0),
                new Sale("Store B", "Keyboard", 100.0)
        );

        Map<String, Double> result = sales.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Sale::storeName, Collectors.summingDouble(Sale::amount)));

        System.out.println(result);
    }

}
