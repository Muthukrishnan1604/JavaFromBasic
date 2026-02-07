package src.main.java.org.example.challenges.oops.abstraction;

public class Laptop extends ProductForSale{

    public Laptop(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {
        System.out.printf("%s - %s - %5.2f%n", getType(), getDescription(), getPrice());
    }

}
