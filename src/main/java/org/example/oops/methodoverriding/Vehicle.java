package src.main.java.org.example.oops.methodoverriding;

public class Vehicle {

    protected String name = "Generic Vehicle";

    // 1. Basic Overridden Method: public access
    public void start() {
        System.out.println(name + " starts with a key.");
    }

    // 2. Method with Arguments: for signature matching
    public void move(int speed) {
        System.out.println(name + " is moving at " + speed + " km/h.");
    }

    // 3. Covariant Return Type Example
    public Engine getEngine() {
        System.out.println(name + " has a standard engine.");
        return new Engine("Standard Engine");
    }

    // 4. Method with Protected Access Modifier
    public void applyBrakes() {
        System.out.println(name + " applies standard brakes.");
    }

    // 5. Static Method (Cannot be overridden, only hidden)
    public static void honk() {
        System.out.println("Generic Vehicle honks.");
    }

    // 6. Private Method (Cannot be overridden, not inherited/visible)
    private void serviceReminder() {
        System.out.println(name + " needs a service soon (private method).");
    }

    // 7. Final Method (Cannot be overridden)
    public final void refillFuel() {
        System.out.println(name + " is refilling fuel. (Cannot be overridden)");
    }

    // A public method to demonstrate calling the private method (only from within this class)
    public void checkService() {
        serviceReminder();
    }

}
