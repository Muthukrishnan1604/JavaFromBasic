package src.main.java.org.example.challenges.polymorphism;

public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize = 4;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super("Electric car");
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Electric -> All %d batteries are fired up, Ready!%n", batterySize);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("Electric -> Exceeds average: %.2f %n", this.avgKmPerCharge);
    }

}
