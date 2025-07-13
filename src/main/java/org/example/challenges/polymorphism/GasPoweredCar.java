package src.main.java.org.example.challenges.polymorphism;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super("Gas powered car");
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("Gas -> Exceeds average: %.2f %n", this.avgKmPerLitre);
    }

}
