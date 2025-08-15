package src.main.java.org.example.oops.abstraction;

public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        getExplicit();
        System.out.println("Shed in the Spring");
    }

    @Override
    public void makeNoise() {

    }
}
