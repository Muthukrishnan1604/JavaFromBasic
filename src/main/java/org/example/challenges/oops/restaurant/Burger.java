package src.main.java.org.example.challenges.oops.restaurant;

public class Burger extends PriceAndType{

    private boolean isToppingsNeeded;

    private String extraToppings;

    private int toppingsLimit;

    public Burger(String type, boolean isToppingsNeeded, String extraToppings, int toppingsLimit) {
        super(type, true);
        this.isToppingsNeeded = isToppingsNeeded;
        this.extraToppings = extraToppings;
        this.toppingsLimit = getToppingsLimit(toppingsLimit);
        if(this.toppingsLimit > 0) {
            setExtraToppings();
        }
    }

    public int getToppingsLimit(int toppingsLimit) {
        if(toppingsLimit >= 0 && toppingsLimit < 6) {
            this.toppingsLimit = toppingsLimit;
        }
        return this.toppingsLimit;
    }

    @Override
    public double getPrice() {
        double burgerPrice = 0.0d;
        if ("Normal Burger".equalsIgnoreCase(this.getType()) || "Veg Burger".equalsIgnoreCase(this.getType())) {
            burgerPrice = 120.50d;
        } else if ("Non Veg Burger".equalsIgnoreCase(this.getType())){
            burgerPrice = 150.95d;
        }

        if(isToppingsNeeded) {
            burgerPrice += toppingsLimit * 20.25d;
        }
        return burgerPrice;
    }

    public void setExtraToppings() {
        this.extraToppings = "%d Added toppings".formatted(this.toppingsLimit);
    }

    public String getExtraToppings() {
        return extraToppings;
    }
}
