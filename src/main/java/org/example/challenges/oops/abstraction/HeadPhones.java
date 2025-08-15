package src.main.java.org.example.challenges.oops.abstraction;

public class HeadPhones extends ProductForSale {

    public HeadPhones() {
        this("Headphones", 200.00, "Headphones with mic");
    }

    public HeadPhones(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {
        System.out.printf("%s - %s - %5.2f%n", getType(), getDescription(), getPrice());
    }
}
