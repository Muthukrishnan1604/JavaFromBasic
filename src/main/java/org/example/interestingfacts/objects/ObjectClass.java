package src.main.java.org.example.interestingfacts.objects;
 // Parent class
    class Parents {
        protected String parentMessage = "Hello from Parent!";

        public void displayMessage() {
            System.out.println("Parent Method: " + parentMessage);
        }
    }

    // Child class extending Parent
    class Childs extends Parents {
        // This variable *shadows* parentMessage if named the same.
        // For clarity, let's use a slightly different name to show it's the Child's own field.
        protected String childMessage = "Greetings from Child!";

        // This method *overrides* the displayMessage() method from the Parent class.
        @Override
        public void displayMessage() {
            System.out.println("Child Method: " + childMessage);
            // You can also call the parent's method from here if needed:
            // super.displayMessage();
        }

        public void childSpecificMethod() {
            System.out.println("This is a method unique to the Child class.");
        }
    }

    public class ObjectClass {
        public static void main(String[] args) {
            // 1. Creating a Child object and assigning it to an Object reference
            Object obj = new Childs();
            System.out.println("--- Using Object reference ---");

            // Trying to call displayMessage() directly on 'obj' will result in a compile-time error
            // because the Object class does not have a displayMessage() method.
            // obj.displayMessage(); // <-- Compile-time error!

            // To call displayMessage(), we must cast 'obj' to a type that has this method.

            // 2. Casting to Parent to call the overridden method
            System.out.println("\n--- Casting to Parent ---");
            Parents p = (Parents) obj; // Cast obj to Parent type
            p.displayMessage(); // Calls Child's overridden displayMessage() due to runtime polymorphism
            System.out.println("Accessing protected variable via Parent reference: " + p.parentMessage); // Accesses Parent's protected variable

            // Trying to call childSpecificMethod() on 'p' will also be a compile-time error
            // because the Parent class does not have childSpecificMethod().
            // p.childSpecificMethod(); // <-- Compile-time error!

            // 3. Casting to Child to call the overridden method and child-specific methods/variables
            System.out.println("\n--- Casting to Child ---");
            Childs c = (Childs) obj; // Cast obj to Child type
            c.displayMessage(); // Calls Child's overridden displayMessage()
            c.childSpecificMethod(); // Calls Child's specific method
            System.out.println("Accessing protected variable via Child reference: " + c.childMessage); // Accesses Child's protected variable
            System.out.println("Accessing Parent's protected variable via Child reference: " + c.parentMessage); // Also accesses Parent's protected variable

            // Demonstrating method overriding with direct Child instantiation
            System.out.println("\n--- Direct Child Instantiation ---");
            Childs directChild = new Childs();
            directChild.displayMessage(); // Calls Child's overridden displayMessage()
        }
    }