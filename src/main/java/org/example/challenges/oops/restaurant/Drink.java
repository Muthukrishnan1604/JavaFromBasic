package src.main.java.org.example.challenges.oops.restaurant;

public class Drink extends PriceAndType {

    private String size;


    public Drink(String size) {
        super("Coke", false);
        setSize(size);
    }

    public void setSize(String size) {
        if("Regular".equalsIgnoreCase(size) || "Medium".equalsIgnoreCase(size) || "Large".equalsIgnoreCase(size)) {
            this.size = size.toUpperCase();
        } else {
            this.size = "REGULAR";
        }
    }

    public String getSize() {
        return size;
    }

    @Override
    public double getPrice() {
        return switch (this.size) {
            case "MEDIUM" -> 75.00d;
            case "LARGE"  -> 120.00d;
            case "REGULAR" -> 50.00d;
            default -> 0.0d;
        };
    }
}
