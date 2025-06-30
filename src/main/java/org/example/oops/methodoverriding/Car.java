package src.main.java.org.example.oops.methodoverriding;

public class Car extends Vehicle {
    private String carType;

    public Car(String carType) {
        this.carType = carType;
        this.name = carType; // Update the inherited name
    }

    // 1. Overriding `start()` method (same signature, same or less restrictive access)
    // @Override annotation is good practice to ensure it's an override
    @Override
    public void start() {
        System.out.println(name + " starts with a push button.");
    }

    // 2. Overriding `move()` method (same signature)
    @Override
    public void move(int speed) {
        super.move(speed); // Calling the superclass version
        System.out.println(name + " accelerates quickly at " + speed + " km/h.");
    }


    // 4. Overriding `applyBrakes()` method (can increase visibility)
    // Parent: protected, Child: public (allowed, less restrictive)
    @Override
    public void applyBrakes() {
        System.out.println(name + " applies ABS brakes for quick stop.");
    }

    /*
    // Uncommenting this would cause a COMPILE-TIME ERROR:
    // Cannot reduce the visibility of the inherited method from Vehicle
    @Override
    private void applyBrakes() {
        System.out.println(name + " applies ABS brakes for quick stop.");
    }
    */

    // 5. Hiding Static Method (NOT overriding)
    // This is method hiding, not overriding. The static keyword means it belongs to the class, not instance.
    public static void honk() {
        System.out.println("Sports Car honks loudly!");
    }

    /*
    // Uncommenting this would cause a COMPILE-TIME ERROR:
    // Cannot override the final method from Vehicle
    @Override
    public void refillFuel() {
        System.out.println(name + " is refilling premium fuel.");
    }
    */

    /*
    // Uncommenting this would cause a COMPILE-TIME ERROR:
    // This instance method cannot override the static method from Vehicle
    // If you try to override a static method as an instance method.
    @Override
    public void honk() {
        System.out.println("ERROR: Attempting to override static as instance.");
    }
    */
}
