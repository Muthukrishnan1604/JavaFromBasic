package src.main.java.org.example.arrays;

/*
Arrays used to store multiple elements of same Data Type.

An array is a data structure that allows you to store a sequence of values, all of the same type.
You can have arrays for any primitive type, like ints, doubles, booleans, or in fact, any of the 8 primitives we've learned about.
You can also have arrays for any class.

Elements in an array are indexed, starting at 0.
If we have an array storing five names, conceptually, it looks as shown here.

The first element is at index 0 and is Andy.
The last element in this array is at index 4 and has the String value Eve.

Represents an array with 5 elements, storing names.
 * <p>
 * The array is indexed from 0 to 4, with each index holding a string value.
 * </p>
 * <pre>
 * | Index | Stored values in an array with 5 elements |
 * |-------|-------------------------------------------|
 * |   0   | "Andy"                                    |
 * |   1   | "Bob"                                     |
 * |   2   | "Charlie"                                 |
 * |   3   | "David"                                   |
 * |   4   | "Eve"                                     |
 * </pre>

When you declare an array, you first specify the type of the elements you want in the array.
Then you include square brackets in the declaration,
which is the key for Java to identify the variable as an array.
The square brackets can follow the type as shown in the first two examples.
You can also put the square brackets after the variable name as shown in the last example.
The first approach is much more common.
Note that you don't specify a size in the array declaration itself.

 * Represents the concept of Array Variable Declaration.
 * This Javadoc comment serves as a placeholder or a general description
 * for a section that would detail various ways to declare array variables in Java.
 * <p>
 * Typically, this would include examples and explanations of:
 * <ul>
 * <li>Declaring an array without initialization (e.g., { int[] myArray;})</li>
 * <li>Declaring and initializing an array with a specified size (e.g., {@code String[] names = new String[5];})</li>
 * <li>Declaring and initializing an array with elements (e.g., {@code double[] prices = {10.5, 20.0, 5.75};})</li>
 * <li>Multi-dimensional array declarations</li>
 * </ul>
 * </p>

The size of an array, once created, is fixed.
In this case, integerArray will have 10 elements.


You can't change the size of an array after the array is instantiated.
        int[] intArrayWithLimit = new int[10];
You can't add or delete elements. You can only assign values to one of the ten elements in this array, in this example.
Note that Java has other capabilities to store elements that can be resized.
*/


public class Arrays {

    public static void main(String[] args) {
        //Different way of declaring Array
        int[] intArray = {1, 2, 3, 4}; // This is anonyms array
        int integerList1[];
        integerList1 = new int[] {1, 2, 3, 4};

        //Instanting Array with limit
        int[] intArrayWithLimit = new int[10];
        int intArrayLimit[] = new int[10];

        double[] doubleArrayWithLimit = new double[5];
        doubleArrayWithLimit[0] = 2.5;
        doubleArrayWithLimit[4] = 10.0;
        // doubleArrayWithLimit[5] = 11.0; -> This will throw the error

        // Assigning some other value or values to the available index
        intArray[0] = 10;
        intArray[3] = 20;
        //intArray[2] = 20.0; If we assign some other data type to int array it will throw compile time error
        intArrayLimit[0] = 200;
        System.out.println("Accessing array element " + intArrayLimit[0]);
        System.out.println(intArray.length); // Once initialized the size won't change
        //intArray[4] = 30; --> This will throw ArrayIndex OutOfBound Exception
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }

        System.out.println(intArrayWithLimit.length);

        for (int i = 0; i < intArrayWithLimit.length; i++) {
            intArrayWithLimit[i] = intArrayWithLimit.length - i;
        }

        for (int i = 0; i < intArrayWithLimit.length; i++) {
            System.out.print(intArrayWithLimit[i] + ", ");
        }
    }

}