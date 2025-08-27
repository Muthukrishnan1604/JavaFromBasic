package src.main.java.org.example.challenges.lambda.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.*;
import java.util.stream.Collectors;

public class InventoryManager {
    public static final String ELECTRONICS = "Electronics";

    public static void main(String[] args) {
        List<Product> inventory = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Desk Chair", "Furniture", 250.00),
                new Product("Mouse", "Electronics", 35.00),
                new Product("Keyboard", "Electronics", 75.00),
                new Product("Coffee Table", "Furniture", 150.00),
                new Product("Monitor", "Electronics", 300.00),
                new Product("USB Hub", "Accessories", 20.00)
        );

        Predicate<Double> isGreaterThan100 = price -> price > 100.00;
        BiPredicate<String, Double> filterByCategoryAndByPrice = (category, price) -> ELECTRONICS.equalsIgnoreCase(category) && price > 200.00;

        Consumer<Product> discount = product -> {
            double price = (product != null && product.getPrice() > 0) ? product.getPrice() : 0;
            if(price > 0) {
                product.setPrice(price - ((price * 10)/100));
            }
        };

        BiConsumer<String, List<Product>> printer = (s, products) -> products.forEach(product -> System.out.println(product.getName() + " " + s) );

        System.out.println("Task 1 and Task 2: Filtering with Predicate");

        inventory.stream()
                .filter(Objects::nonNull)
                .filter(inv -> isGreaterThan100.test(inv.getPrice()))
                .forEach(product ->  {
                    applyDiscount(product, discount);
                });

        System.out.println("-".repeat(30));

        System.out.println("Task 3: Complex Filtering with BiPredicate");

        inventory.stream()
                .filter(Objects::nonNull)
                .filter(inv -> filterByCategoryAndByPrice.test(inv.getCategory(), inv.getPrice()))
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        System.out.println("Task 3: Complex Filtering with BiPredicate");

        inventory.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Product::getCategory))
                .forEach((t, u) -> printer.accept(t, u));

    }

    private static void applyDiscount(Product product, Consumer<Product> discount) {
        discount.accept(product);
        System.out.println(product);
    }
}