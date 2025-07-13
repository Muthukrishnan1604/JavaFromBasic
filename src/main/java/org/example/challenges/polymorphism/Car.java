package src.main.java.org.example.challenges.polymorphism;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    private String getCarDetails(){
        return this.description;
    }

    public void startEngine() {
        System.out.println("Thanks for choosing " + getCarDetails());
        System.out.println(this.getClass().getSimpleName() + " engine started!");
    }

    public void drive() {
        System.out.println("Drive the car " + this.getClass().getSimpleName());
        this.runEngine();
    }

    protected void runEngine() {
        System.out.println("Running " + this.getClass().getSimpleName());
    }

    public static Car getCar(String carType, String description, double averageKm, int cylinder, int batterySize) {
        return switch (carType.substring(0,carType.indexOf("Car")).toUpperCase()) {
            case "ELECTRIC" -> new ElectricCar(description, averageKm, batterySize);
            case "HYBRID" -> new HybridCar(description, averageKm, cylinder, batterySize);
            case "GAS POWERED" -> new GasPoweredCar(description, averageKm, cylinder);
            default -> new Car(description);
        };
    }

}
