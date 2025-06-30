package src.main.java.org.example.oops.methodoverriding;

/*
### **Method Overriding Interview Preparation Points**

1.  **Definition:**
    * Method overriding means defining a method in a **child class** that already exists in its **parent class**, with the **exact same signature** (same name, same parameters).

2.  **Core Concept:**
    * By extending a parent class, the child class inherits all methods from the parent. These are sometimes called "derived methods."
    * Overriding allows a subclass to provide a **specific implementation** for an inherited method.

3.  **Type of Polymorphism:**
    * Also known as **Runtime Polymorphism** or **Dynamic Method Dispatch**.
    * The Java Virtual Machine (JVM) decides which specific method implementation to call at **runtime**, based on the actual object type.

4.  **`@Override` Annotation:**
    * **Recommendation:** It's highly recommended to place `@Override` immediately above the method definition in the child class.
    * **Purpose:** It's not mandatory for functionality, but it's a **compiler directive**.
    * **Benefit:** It helps the compiler flag an error if you accidentally violate any overriding rules (e.g., misspell the method name, change parameters), preventing subtle bugs.

5.  **Rules for Overriding (Must Follow):**
    * **Same Signature:** Must have the exact same method name and the same arguments (number, type, and order of parameters).
    * **Return Type:** The return type must be the same as, or a **covariant return type** (a subclass of) the return type in the parent class.
    * **Access Modifier:** Cannot have a **more restrictive** access modifier than the overridden method in the parent class.
        * Example: If parent is `protected`, child can be `protected` or `public`, but not `private` or default (package-private).
        * Example: If parent is `public`, child can only be `public`.

6.  **Methods That Cannot Be Overridden:**
    * **Static Methods:** Only instance methods can be overridden. Static methods are "hidden," not overridden.
    * **Private Methods:** Private methods are not inherited, thus cannot be overridden.
    * **`final` Methods:** Methods declared with the `final` keyword cannot be overridden.
    * **Constructors:** Constructors are not methods and cannot be overridden.

7.  **Calling Superclass Version:**
    * A subclass can use `super.methodName()` to explicitly call the superclass's version of an overridden method from within the overriding method.

 */

public class MethodOverriding {
        public static void main(String[] args) {
            System.out.println("--- Demonstrating Method Overriding ---");

            // Create objects
            Vehicle genericVehicle = new Vehicle();
            Car sportsCar = new Car("Ferrari"); // Child class object

            // --- 1. Basic Overriding and Runtime Polymorphism ---
            System.out.println("\n--- 1. Basic Overriding (Runtime Polymorphism) ---");
            System.out.print("Generic Vehicle: ");
            genericVehicle.start(); // Calls Vehicle's start()
            System.out.print("Sports Car: ");
            sportsCar.start();      // Calls Car's overridden start()

            // Polymorphic call: Reference of parent, object of child
            Vehicle polyVehicle = new Car("Porsche");
            System.out.print("Polymorphic Vehicle (Porsche): ");
            polyVehicle.start(); // Calls Car's overridden start() at runtime

            // --- 2. Overriding with `super` keyword ---
            System.out.println("\n--- 2. Calling Superclass Method from Subclass ---");
            sportsCar.move(100); // Calls Car's move(), which then calls Vehicle's move()

            // --- 3. Covariant Return Type ---
            System.out.println("\n--- 3. Covariant Return Type ---");
            Engine vehicleEngine = genericVehicle.getEngine();
            System.out.println("Vehicle Engine: " + vehicleEngine);

            // --- 4. Access Modifier Rules (Cannot reduce visibility) ---
            System.out.println("\n--- 4. Access Modifier Rules ---");
            genericVehicle.applyBrakes(); // Vehicle's protected method
            sportsCar.applyBrakes();      // Car's public method (allowed, increased visibility)

            // Attempting to call a protected method from Vehicle using a Vehicle reference in a different package
            // (This would be a compile error if OverridingDemo was in a different package and applyBrakes was only protected)
            // For demonstration, all classes are in the same default package.

            // --- 5. Static Methods (Method Hiding, NOT Overriding) ---
            System.out.println("\n--- 5. Static Methods (Method Hiding) ---");
            Vehicle.honk();         // Calls Vehicle's static honk() (based on reference type)
            Car.honk();             // Calls Car's static honk() (based on reference type)

            Vehicle polyStatic = new Car("BMW");
            polyStatic.honk();      // Still calls Vehicle's static honk() because it's based on reference type (Vehicle), not object type (Car)

            // --- 6. Private Methods (Cannot be overridden) ---
            System.out.println("\n--- 6. Private Methods (Cannot be overridden) ---");
            genericVehicle.checkService(); // Calls a public method that internally calls the private method
            // sportsCar.serviceReminder(); // Compile-time error: serviceReminder() has private access in Vehicle

            // --- 7. Final Methods (Cannot be overridden) ---
            System.out.println("\n--- 7. Final Methods (Cannot be overridden) ---");
            genericVehicle.refillFuel();
            sportsCar.refillFuel(); // This will execute Vehicle's final method. If Car tried to override it, it would be a compile error.

            System.out.println("\n--- End of Demonstration ---");
        }

}
