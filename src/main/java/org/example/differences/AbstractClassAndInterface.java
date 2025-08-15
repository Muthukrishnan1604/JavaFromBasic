package src.main.java.org.example.differences;

/*
*/

// Define an interface
interface Drivable {
    int name = 0;
    // Abstract method (implicitly public and abstract)
    void startEngine();
    void stopEngine();
    void accelerate(int speed);

    // Default method (Java 8 onwards)
    default void honk() {
        System.out.println("Beep beep!");
    }

    // Static method (Java 8 onwards)
    static String getType() {
        return "Vehicle Drivable Interface";
    }
}

// A concrete class implementing the Drivable interface
class Car implements Drivable {
    private int currentSpeed = 0;

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void accelerate(int speed) {
        this.currentSpeed += speed;
        System.out.println("Car accelerating to " + currentSpeed + " km/h.");
    }

    public void displaySpeed() {
        System.out.println("Current Car Speed: " + currentSpeed + " km/h");
    }
}

// Another concrete class implementing the Drivable interface
class Bicycle implements Drivable {
    private int pedalSpeed = 0;

    // Bicycle doesn't have an engine, but must implement the methods.
    // This highlights a potential limitation if the contract is too broad.
    @Override
    public void startEngine() {
        System.out.println("Bicycle has no engine to start.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bicycle has no engine to stop.");
    }

    @Override
    public void accelerate(int speed) {
        this.pedalSpeed += speed;
        System.out.println("Bicycle pedaling faster to " + pedalSpeed + " km/h.");
    }

    // Bicycle can also use the default honk method
    @Override
    public void honk() {
        System.out.println("Ring ring! (Bicycle bell)"); // Overriding default method
    }

    public void displayPedalSpeed() {
        System.out.println("Current Bicycle Pedal Speed: " + pedalSpeed + " km/h");
    }
}


public class AbstractClassAndInterface {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.accelerate(50);
        myCar.displaySpeed();
        myCar.honk(); // Uses default method
        myCar.stopEngine();

        System.out.println("\n---");

        Bicycle myBicycle = new Bicycle();
        myBicycle.startEngine(); // Still has to implement, even if it does nothing
        myBicycle.accelerate(15);
        myBicycle.displayPedalSpeed();
        myBicycle.honk(); // Uses overridden default method
        myBicycle.stopEngine();

        System.out.println("\nStatic method call: " + Drivable.getType());
    }

}
