package src.main.java.org.example.oops.abstraction;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if("Slow".equalsIgnoreCase(speed))
            System.out.println(type + " lazily swimming");
        else
            System.out.println(type + " actively swimming");
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("GoldFish")) {
            System.out.println("swish! ");
        } else {
            System.out.println("Splash! ");
        }
    }
}
