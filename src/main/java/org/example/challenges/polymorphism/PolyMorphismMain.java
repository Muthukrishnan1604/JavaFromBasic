package src.main.java.org.example.challenges.polymorphism;

public class PolyMorphismMain {

    public static void main(String[] args) {
        Car car = new ElectricCar("Tesla", 18, 6);
        runCar(car);

        Car ferrari = new GasPoweredCar("Ferrari 296 GTS", 15.4, 6);
        runCar(ferrari);

        Car hybridCar = new HybridCar("Benz 123", 19, 4, 4);
        runCar(hybridCar);

        System.out.println("-".repeat(10));

        Car factoryCar = Car.getCar("ElectricCar", "Tesla1", 600, 0, 90);
        runCar(factoryCar);
    }

    public static void runCar(Car car) {
        car.startEngine();
        car.drive();
    }

}
