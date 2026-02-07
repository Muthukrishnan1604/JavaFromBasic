package src.main.java.org.example.challenges.oops.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private static List<ProductForSale> productsList = new ArrayList<>();

    private static void displayProductDetails() {
        for(var product : productsList) {
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }

    private static void addOrders(ArrayList<OrderItem> orderItem, int orderIndex, int qty) {
        orderItem.add(new OrderItem(qty, productsList.get(orderIndex)));
    }

    private static void printOrders(ArrayList<OrderItem> order) {
        double salesTotal = 0;

        for(var item : order) {
            item.getProduct().printPricedItem(item.getQuantity());
            salesTotal += item.getProduct().getSalesPrice(item.getQuantity());
        }
        System.out.println("Sales Total = $" + salesTotal);
    }

    public static void main(String[] args) {
        productsList.add(new HeadPhones("HeadPhone", 400.00, "Head Phones without noise cancellation and with mic"));
        productsList.add(new HeadPhones("HeadPhone", 500.00, "Head Phones with noise cancellation and with mic"));
        productsList.add(new HeadPhones("HeadPhone", 300.00, "Head Phones without noise cancellation and no mic"));
        productsList.add(new Mobile("Mobile Phone", 40000.00, "One Plus Mobile with 50MP camera"));
        productsList.add(new Mobile("Mobile Phone", 140000.00, "Iphone pro max"));
        productsList.add(new Laptop("Laptop", 50000.00, "Lenovo Laptop"));

        displayProductDetails();

        System.out.println("\n Order 1");
        var order1 = new ArrayList<OrderItem>();
        addOrders(order1, 1, 2);
        addOrders(order1, 3, 2);
        printOrders(order1);
    }

}
