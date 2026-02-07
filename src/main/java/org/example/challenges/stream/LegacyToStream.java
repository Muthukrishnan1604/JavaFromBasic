package src.main.java.org.example.challenges.stream;

import java.util.List;
import java.util.stream.DoubleStream;

record Item(String name, double price) {}

record Order(int id, String status, List<Item> items) {}

public class LegacyToStream {

    public static void main(String[] args) {

        List<Item> cheapItems = List.of(new Item("Pen", 10.0), new Item("Paper", 5.0));     // Total: 15.0
        List<Item> expensiveItems = List.of(new Item("Laptop", 800.0), new Item("Mouse", 50.0)); // Total: 850.0
        List<Item> midItems = List.of(new Item("Desk", 120.0));                           // Total: 120.0

        List<Order> orders = List.of(
                new Order(1, "CLOSED", expensiveItems), // Should be included (850.0)
                new Order(2, "OPEN", midItems),         // Should be excluded (Status is not CLOSED)
                new Order(3, "CLOSED", cheapItems),     // Should be excluded (Total 15.0 is <= 100)
                new Order(4, "CLOSED", midItems)        // Should be included (120.0)
        );

        calculateSpecialRevenueUsingStream(orders);

    }

    public double calculateSpecialRevenue(List<Order> orders) {
        double total = 0.0;
        for (Order order : orders) {
            if ("CLOSED".equals(order.status())) {
                double orderSum = 0.0;
                for (Item item : order.items()) {
                    orderSum += item.price();
                }

                if (orderSum > 100.0) {
                    total += orderSum;
                }
            }
        }
        return total;
    }

    public static double calculateSpecialRevenueUsingStream(List<Order> orders) {
        return orders.stream()
                .filter(order -> "CLOSED".equals(order.status()))
                .flatMapToDouble(order -> DoubleStream.of(order.items()
                        .stream().map(Item::price).mapToDouble(Double::doubleValue).sum()))
                .filter(res -> res > 100.0)
                .sum();
    }
}
