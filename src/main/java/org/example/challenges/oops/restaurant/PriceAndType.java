package src.main.java.org.example.challenges.oops.restaurant;

public class PriceAndType {

    private String type;

    private boolean isVeg;

    private double price;

    public PriceAndType(String type, boolean isVeg) {
        this.type = type;
        this.isVeg = isVeg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
