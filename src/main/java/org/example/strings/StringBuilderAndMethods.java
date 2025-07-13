package src.main.java.org.example.strings;

/*
n Java, both String and StringBuilder (along with StringBuffer) are used to represent sequences of characters. However, they differ fundamentally in their mutability and thread-safety, which dictates when and where you should use each.

1. String Class
The java.lang.String class is the most commonly used class for representing character sequences.

Key Characteristics:

Immutable: This is the most crucial characteristic. Once a String object is created, its content cannot be changed. Any operation that seems to modify a String (like concat(), replace(), substring(), toUpperCase()) actually returns a new String object with the modified content, leaving the original String object untouched.

Memory Implications: Because new objects are created for every modification, frequent String manipulations (e.g., in a loop) can lead to the creation of many intermediate String objects, potentially consuming excessive memory and putting pressure on the Garbage Collector.

Thread-Safe (Inherently): Since String objects are immutable, they are inherently thread-safe. Multiple threads can access the same String object concurrently without any risk of data corruption, as its state never changes.

String Pool Optimization: String literals ("hello") are stored in the String Constant Pool. This is a special memory area that helps optimize memory by reusing identical string literals.

Overloaded Operators: The + operator in Java is overloaded for String concatenation. When you use + to concatenate strings, the Java compiler often optimizes this by internally using StringBuilder (or StringBuffer in older Java versions) for efficiency, especially for multiple concatenations in a single statement.

When to Use String:

When the string content is fixed and will not change after creation.

When you need to represent string literals.

When thread-safety is paramount and the string content truly needs to be constant across threads.

When passing strings as method arguments or returning them, as their immutability guarantees their value won't be altered unexpectedly.

For keys in HashMap or elements in HashSet, because their immutability ensures their hash code remains constant.

2. StringBuilder Class
The java.lang.StringBuilder class was introduced in Java 5.

Key Characteristics:

Mutable: Unlike String, StringBuilder objects are mutable. You can modify their content (append, insert, delete, replace characters) without creating a new object. Operations like append(), insert(), delete(), reverse(), etc., modify the StringBuilder object in place.

Memory Efficiency: Because it modifies the content in place, StringBuilder is highly efficient for performing numerous string manipulations (e.g., building a string in a loop), as it avoids the overhead of creating many intermediate String objects.

Not Thread-Safe: StringBuilder is not synchronized (not thread-safe). If multiple threads try to modify the same StringBuilder instance concurrently, it can lead to data inconsistency or corruption.

Faster (Generally): Due to lack of synchronization, StringBuilder is generally faster than StringBuffer.

When to Use StringBuilder:

When you need to perform frequent modifications to a string's content, especially within a single thread.

When performance is a concern and thread-safety is not required.

Building dynamic strings in loops or iterative processes.
 */

public class StringBuilderAndMethods {

    public static void main(String[] args) {
        String input = "Hello" + " Muthu!";
        input.concat(" Divya loves you");

        StringBuilder inputBuilder = new StringBuilder("Hello" + " Muthu!");
        inputBuilder.append(" Divya loves you");

        printInformation(input);
        printInformation(inputBuilder);

        StringBuilder emptyStart = new StringBuilder();
        //Initial capacity is 16
        emptyStart.append("I".repeat(57));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("I".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builder = new StringBuilder("Hello" + " Muthu!");
        builder.append(" Divya loves you");
        int indexOfY = builder.indexOf("y");
        builder.delete(indexOfY, indexOfY + 2).insert(indexOfY, 'i');
        System.out.println(builder);

        int indexOfL = builder.indexOf("l",18);
        builder.replace(indexOfL, indexOfL + 1, "L");
        System.out.println(builder);

        builder.reverse().setLength(8);
        System.out.println(builder);
    }

    public static void printInformation(String input) {
        System.out.println("Input = " + input);
        System.out.println("Length = " + input.length());
    }

    public static void printInformation(StringBuilder inputBuilder) {
        System.out.println("Input = " + inputBuilder);
        System.out.println("Length = " + inputBuilder.length());
        System.out.println("Capacity = " + inputBuilder.capacity());
    }

}
