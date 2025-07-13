package src.main.java.org.example.challenges.polymorphism;

public class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super("Hybrid car");
        this.avgKmPerLitre = 20;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Hybrid -> All %d cylinders  and %d batteries are fired up, Ready!%n", cylinders, batterySize);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("Hybrid -> Exceeds average: %.2f %n", this.avgKmPerLitre);
    }

}
