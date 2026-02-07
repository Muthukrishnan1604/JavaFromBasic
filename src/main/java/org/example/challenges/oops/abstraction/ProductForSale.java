package src.main.java.org.example.challenges.oops.abstraction;

public abstract class ProductForSale {

    private String type;

    private double price;

    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayingProductDetails(int quantity) {
        String print = String.format("%s - %d - %f", type, quantity, price);
        System.out.println(print);
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%2d qty at $%5.2f each, %-15s %-35s %n", quantity, price, this.type, description);
    }

    protected abstract void showDetails();
}
