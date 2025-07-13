package src.main.java.org.example.challenges.oops.restaurant;

public class SideItem extends PriceAndType {

    public SideItem(String type) {
        super(type, true);
    }

    @Override
    public double getPrice() {
        return switch (this.getType()) {
            case "French Fries" -> 90.00d;
            case "Cheese Balls"  -> 120.00d;
            case "Chicken Nuggets" -> 150.00d;
            default -> 0.0d;
        };
    }
}
