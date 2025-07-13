package src.main.java.org.example.arrays;

/*
The enhanced for loop provides a simpler and more readable way to iterate over all elements in an array or any class
that implements the java.lang.Iterable interface (which includes all java.util.Collection types like ArrayList,
HashSet, LinkedList, etc.).

It hides the complexity of managing an iterator or an index counter,
making your code less error-prone and more concise. Internally, for collections,
the compiler translates this loop into code that uses an Iterator. For arrays, it uses an index counter.

When to Use the Enhanced For Loop (for (Type element : collectionOrArray)):
When you need to process every element in a collection or array.

This is its primary use case. It's ideal for tasks like printing all elements,
performing a calculation on each element, or applying a transformation that doesn't require modifying the
collection's structure.

When you don't need the index of the current element.

If your logic doesn't depend on the element's position (index) within the collection or array,
the enhanced for loop is the cleanest and most readable option.

To make your code more readable and concise.

Compared to traditional for loops with index management or explicit Iterator usage, the enhanced for loop reduces boilerplate code and clearly expresses the intent: "for each element in this collection, do something."

To reduce the chance of off-by-one errors or IndexOutOfBoundsExceptions.

Since you're not manually managing indices, these common errors are eliminated.

When NOT to Use the Enhanced For Loop (or be cautious):
When you need to modify the collection during iteration (add or remove elements).

Crucial Point: If you try to add or remove elements from the underlying Collection while iterating with an enhanced for loop, you will likely encounter a ConcurrentModificationException. This is because the enhanced for loop uses an Iterator internally, and most Collection implementations detect external modifications during iteration.

Solution: If you need to remove elements, use an explicit Iterator and its remove() method. If you need to add elements or clear the collection, you'll generally iterate, collect elements to be added/removed, and then perform the modifications after the loop, or use a traditional for loop with index (if removing) or create a new collection.

Java

// BAD EXAMPLE - Will throw ConcurrentModificationException
// for (String fruit : fruits) {
//     if (fruit.startsWith("A")) {
//         fruits.remove(fruit); // !!! DANGER !!!
//     }
// }

// GOOD EXAMPLE - Using Iterator for safe removal
// Iterator<String> iterator = fruits.iterator();
// while (iterator.hasNext()) {
//     String fruit = iterator.next();
//     if (fruit.startsWith("A")) {
//         iterator.remove(); // Safe removal
//     }
// }
When you need the index of the current element.

If your logic requires knowing the position of the element (e.g., to access a corresponding element in another array, or if you need to perform actions every Nth element), you must use a traditional for loop with an index (for (int i = 0; i < array.length; i++)).

When you need to iterate backward.

The enhanced for loop always iterates forward from the beginning of the collection/array. If you need to iterate
in reverse, a traditional for loop is necessary.

When you need to skip elements or break out of the loop early based on a condition.

While you can use if conditions and continue inside an enhanced for loop to skip iterations, you cannot use break
to exit the loop entirely based on a condition (unless you wrap it in a custom try-catch block for a
custom exception, which is highly unconventional and discouraged for control flow).
A traditional for loop or while loop offers more direct control flow with break.

 */

public class ForEachLoop {

    public static void main(String[] args) {

        int[] arrayList = {1, 2, 3, 4, 6, 8, 9};

        for(int num : arrayList) {
            System.out.printf("%d,  ", num);
        }

        System.out.println();

        System.out.println(arrayList);
    }

}
