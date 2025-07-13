package src.main.java.org.example.oops.polymorphism;

/*
var (Local-Variable Type Inference) and Casting in Java: Quick Interview Preparation Guide
Understanding var and casting are important for writing modern, efficient, and correct Java code. They represent different aspects of type handling in Java and are frequent topics in technical interviews.

1. var (Local-Variable Type Inference)
Introduced in Java 10, var is a keyword that allows local variables to be declared without explicitly stating their type. The compiler infers the type of the variable from the type of the initializer expression.

Key Concepts:

Local Variables Only: var can only be used for local variables. It cannot be used for:

Method parameters

Field (instance or static) declarations

Return types of methods

Catch block parameters

Compile-Time Feature: var is a compile-time feature, not a runtime feature. The Java compiler still determines the exact type of the variable at compile time. Once compiled, the bytecode is exactly the same as if you had explicitly declared the type. There is no performance penalty at runtime.

Requires an Initializer: A var declaration must be initialized at the time of declaration. This is because the compiler needs an expression to infer the type from.

Java

// Valid
var message = "Hello"; // Type inferred as String
var count = 10;      // Type inferred as int
var list = new ArrayList<String>(); // Type inferred as ArrayList<String>

// Invalid: must be initialized
// var total;
Clarity vs. Conciseness: var aims for conciseness, especially with verbose generic types.
However, overuse can reduce code readability if the inferred type isn't immediately obvious.

null Initializer: You cannot initialize var with null alone, as the compiler cannot infer the type.

Java

// Invalid
// var unknown = null;

// Valid (type inferred from cast)
var specificNull = (String) null;
No null in Diamond Operator: If using var with the diamond operator (<>), you must provide type arguments if the type cannot be inferred from the context.

Java

// Valid
var names = new ArrayList<String>(); // Inferred as ArrayList<String>

// Invalid (compiler can't infer type from empty diamond)
// var emptyList = new ArrayList<>();
When to Use var:

Boilerplate Reduction: When the type is long, complex, or obvious from the initializer.

Java

// Before var
// Map<String, List<Map<Integer, String>>> complexMap = new HashMap<>();
// After var
var complexMap = new HashMap<String, List<Map<Integer, String>>>();
Iterators/Loops: For local variables in enhanced for loops or traditional for loops.

Java

for (var item : someList) { ... }
for (var i = 0; i < 10; i++) { ... }
Resource Management (try-with-resources):

Java

try (var reader = new BufferedReader(new FileReader("file.txt"))) { ... }
When Not to Use var:

When Clarity Suffers: If the initializer expression is complex and the inferred type isn't immediately apparent to a human reader.

Primitive vs. Wrapper: Be careful with primitives vs. their wrapper types if strict type adherence is crucial later. var num = 10; infers int, not Integer.

API Design: Never in public APIs (method parameters, return types) as it reduces
explicit type information for callers.

Interview Tips for var:

Emphasize Compile-Time: Stress that it's a compile-time feature, not dynamic typing.

Local Variables Only: State this restriction clearly.

Must be Initialized: Highlight the requirement for an initializer.

Pros and Cons: Be able to discuss scenarios where it improves readability vs. where it harms it.

2. Casting
Casting in Java is the process of converting an object of one type to another type.
It is essential when dealing with inheritance hierarchies and polymorphic behavior.

Key Concepts:

Two Types of Casting:

Upcasting (Implicit/Widening): Casting an object reference to a supertype.
This is always safe and happens automatically (implicitly) without explicit syntax.

Java

Object obj = new String("Hello"); // String is upcasted to Object implicitly
Animal animal = new Dog();       // Dog is upcasted to Animal implicitly
Downcasting (Explicit/Narrowing): Casting an object reference to a subtype. This is potentially unsafe and requires explicit syntax. The compiler doesn't know at compile time if the object being cast actually is an instance of the target subtype.

Java

Object obj = "Hello";
String str = (String) obj; // Explicit downcasting

Animal animal = new Dog();
// Dog myDog = (Dog) animal; // Valid downcast, if 'animal' actually refers to a Dog object

Animal anotherAnimal = new Cat();
// Dog wrongDog = (Dog) anotherAnimal; // This would compile but throw ClassCastException at runtime
instanceof Operator: Crucially, always use the instanceof operator before performing a downcast to prevent a ClassCastException at runtime.

Java

Object myObject = new Integer(123); // Could be any object

if (myObject instanceof String) {
    String myString = (String) myObject; // This block will not execute
    System.out.println("It's a string: " + myString);
} else if (myObject instanceof Integer) {
    Integer myInteger = (Integer) myObject; // This block will execute
    System.out.println("It's an integer: " + myInteger);
}
Polymorphism: Casting is closely related to polymorphism, allowing you to treat objects of different types uniformly through a common supertype reference, then cast them back to their specific subtypes when needed.

Primitive Casting: You can also cast between primitive types (e.g., int to double, double to int).

Widening (Implicit): Smaller to larger type (e.g., int to long, float to double). No data loss.

Narrowing (Explicit): Larger to smaller type (e.g., double to int). Potential data loss (truncation, precision loss).

Java

int myInt = 10;
double myDouble = myInt; // Implicit widening

double largeDouble = 10.99;
int castInt = (int) largeDouble; // Explicit narrowing (value becomes 10, decimal lost)
When to Use Casting:

Accessing Subtype Specific Methods: When you have a supertype reference but need to call a method that is specific to a particular subtype.

Java

List<Animal> animals = new ArrayList<>();
animals.add(new Dog());
animals.add(new Cat());

for (Animal animal : animals) {
    if (animal instanceof Dog) {
        Dog dog = (Dog) animal; // Downcast to access dog-specific methods
        dog.bark();
    } else if (animal instanceof Cat) {
        Cat cat = (Cat) animal;
        cat.meow();
    }
}
Working with Collections: Before Generics (pre-Java 5), collections stored Objects, requiring explicit downcasting when retrieving elements. Even with generics, sometimes you might deal with raw types or mixed type hierarchies where casting is necessary.

Converting Data Types: For primitive type conversions where implicit conversion is not possible or desired (e.g., explicit truncation).

When Not to Overuse Casting:

Code Smells: Frequent downcasting often indicates a potential design flaw. Consider using polymorphism, interfaces, or generics to avoid unnecessary casts.

ClassCastException Risk: Over-reliance on downcasting without proper checks increases the risk of runtime errors.

Interview Tips for Casting:

Explain Upcasting vs. Downcasting: Clearly define them and their safety implications.

Importance of instanceof: Emphasize its role in preventing ClassCastException.

ClassCastException: Know when and why it occurs.

Relationship to Polymorphism: Explain how casting fits into polymorphic behavior.

Primitive vs. Object Casting: Understand the differences and rules for each.

Combined Tips & Tricks for Interview Preparation:
Understand the "Why": For both var and casting, don't just know what they do, but why they exist and when they are appropriate/inappropriate.

Immutability for var: While var is not about mutability, remember that the type inferred by var is final at compile-time. You can't change the inferred type later.

Compiler vs. Runtime: Be clear about what happens at compile-time (var inference, casting validity check) versus runtime (ClassCastException).

Practice Examples: Write small code snippets for various scenarios to solidify your understanding.

Edge Cases:

var with null: Remember you can't infer null.

var with diamond operator: Be aware of when type arguments are still needed.

ClassCastException: Know what causes it and how to prevent it.

Code Readability: When discussing var, always bring up the trade-off between conciseness and clarity. A good developer uses var judiciously.

Modern Java (var): Highlight var as a feature of modern Java, showing you keep up with language developments.
 */


import java.lang.classfile.constantpool.IntegerEntry;

public class CastAndVarMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Thupakki");
        movie.watchMovie();

        Adventure adventure = (Adventure) Movie.getMovie("A", "Thupakki");
        adventure.watchMovie();

        /*Below code will return classCast exception, because c will return the Comedy object but
        that is trying to converted to Adventure type that is not possible so it is causing this issue.
            Adventure adventure = (Adventure) Movie.getMovie("C", "Thupakki");
         */

        Object comedy = Movie.getMovie("C", "Kalakalapu");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();
        comedyMovie.watchComedy();

        var kalakalapu = Movie.getMovie("C", "Kalakalapu");
        kalakalapu.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        /*we can't directly assign the value as null as the compiler will get confuse which type to refer.
            So we need to explicitly mention it */
        var string = (Integer) null;
        System.out.println(string);

        Object unknownObject = Movie.getMovie("C", "DD returns");
        if(unknownObject.getClass().getSimpleName().equals("Comedy") || unknownObject instanceof Comedy) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if(unknownObject instanceof ScienceFiction science) { // This is introduced in java 16
            science.watchScienceFiction();
        }

    }

/*
instanceof Operator in Java: Quick Interview Preparation Guide
The instanceof operator is a fundamental part of Java's object-oriented nature, allowing for runtime type checking. It's frequently discussed in interviews to assess a candidate's understanding of polymorphism, inheritance, and safe type handling.

What is instanceof?
The instanceof operator is a binary operator in Java used for runtime type checking. It determines if an object is an instance of a particular class, an instance of a subclass that implements a specific interface, or an instance of a class that extends a specific superclass.

Syntax:

Java

objectReference instanceof Type
objectReference: An expression that evaluates to an object reference (or null).

Type: A class or interface type.

Return Value:

Returns true if objectReference is an instance of Type, or an instance of a class that inherits from Type, or an instance of a class that implements Type.

Returns false otherwise.

Crucially: If objectReference is null, instanceof always returns false. This prevents NullPointerExceptions when performing type checks.

Purpose and Use Cases:
The primary purpose of instanceof is to enable safe downcasting and conditional logic based on an object's runtime type in a polymorphic hierarchy.

Safe Downcasting: This is the most common use case. When you have a reference to a superclass type (or an Object type), but you know (or suspect) that the underlying object is actually of a more specific subtype, you can use instanceof to safely check its type before casting. This prevents ClassCastException at runtime.

Java

class Animal {}
class Dog extends Animal { void bark() { System.out.println("Woof!"); } }
class Cat extends Animal { void meow() { System.out.println("Meow!"); } }

public class AnimalApp {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting

        // Without instanceof, a direct cast could lead to ClassCastException
        // Cat potentialCat = (Cat) myAnimal; // Throws ClassCastException if myAnimal is a Dog

        if (myAnimal instanceof Dog) { // Check before downcasting
            Dog dog = (Dog) myAnimal; // Safe downcast
            dog.bark(); // Output: Woof!
        } else if (myAnimal instanceof Cat) {
            Cat cat = (Cat) myAnimal;
            cat.meow();
        } else {
            System.out.println("Unknown animal type.");
        }

        // Example with null
        Animal nullAnimal = null;
        System.out.println("nullAnimal instanceof Dog: " + (nullAnimal instanceof Dog)); // false
    }
}
Conditional Logic in Polymorphism: When iterating over a collection of objects that share a common supertype or interface, but you need to perform different actions based on their specific concrete type.

Java

interface Shape { void draw(); }
class Circle implements Shape { @Override public void draw() { System.out.println("Drawing Circle"); } }
class Square implements Shape { @Override public void draw() { System.out.println("Drawing Square"); } }

public class ShapeDrawer {
    public static void main(String[] args) {
        java.util.List<Shape> shapes = new java.util.ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                // Specific logic for Circle
                System.out.print("It's a Circle: ");
            } else if (shape instanceof Square) {
                // Specific logic for Square
                System.out.print("It's a Square: ");
            }
            shape.draw(); // Common polymorphic behavior
        }
    }
}
instanceof with Pattern Matching (Java 16+)
A significant enhancement introduced in Java 16 (as a standard feature) is Pattern Matching for instanceof. This feature streamlines code by combining the instanceof check with the declaration of a new variable that is automatically cast to the correct type.

Before Java 16:

Java

Object obj = "Hello Java";
if (obj instanceof String) {
    String s = (String) obj; // Manual cast required
    System.out.println("String length: " + s.length());
}
With Java 16+ Pattern Matching:

Java

Object obj = "Hello Java";
if (obj instanceof String s) { // 's' is the pattern variable; automatically declared and cast
    System.out.println("String length: " + s.length()); // Use 's' directly
}
// 's' is only in scope within the true block of the 'if' statement.
// This also works with 'else if' and more complex logical expressions.
Benefits of Pattern Matching:

Reduced Boilerplate: Eliminates redundant casting.

Improved Readability: Makes the code more concise and easier to understand.

Enhanced Safety: The pattern variable s is only in scope if the instanceof check is successful, providing stronger type safety.

Interview Tips and Tricks:
Fundamental Purpose: Start by stating that instanceof is for runtime type checking and safe downcasting.

null Handling: Always mention that null instanceof Type is always false. This is a common trick question to catch candidates who might forget this edge case.

ClassCastException Prevention: Emphasize that instanceof is your primary tool to prevent ClassCastException at runtime when performing downcasts.

== vs. instanceof: Clarify that == compares references (or primitive values), while instanceof compares the runtime type of an object.

Polymorphism Connection: Explain how instanceof fits into the broader concept of polymorphism and object-oriented design. It allows you to leverage polymorphism while still being able to act on specific types when necessary.

instanceof as a "Code Smell": Be prepared to discuss that frequent use of instanceof (especially a long chain of if-else if instanceof) can sometimes indicate a design flaw. Often, such scenarios can be refactored using polymorphism (e.g., overriding methods in subclasses, using interfaces) to achieve more extensible and maintainable code.

Good Use: When dealing with objects from external libraries or frameworks where you cannot modify the class hierarchy, or for simple type-specific checks.

Potential Bad Use: When you have control over the hierarchy and could use method overriding instead.

Pattern Matching for instanceof: For Java 16+ interviews, definitely mention and demonstrate pattern matching. This shows you're up-to-date with modern Java features and can write more concise code.

Internal Working (Optional but impressive): If you want to go deeper, briefly explain that instanceof checks the object's runtime Class metadata and traverses its inheritance hierarchy (including implemented interfaces) to determine compatibility. This corresponds to the instanceof JVM bytecode instruction.
 */
}
