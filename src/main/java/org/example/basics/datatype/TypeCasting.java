package src.main.java.org.example.basics.datatype;

/*
    We have two types of type casting:

    1. Widening Type Casting ->
        Converting a smaller type to a larger type size byte -> short -> char -> int -> long -> float -> double
    2. Narrowing Type Casting
        Converting a larger type to a smaller type size [ We need to manually cast it ]
*/

public class TypeCasting {

    public static void main(String[] args) {
        int intVariable = 10;

        // Widening Type Casting
        double doubleVariable = intVariable;

        System.out.println(doubleVariable);

        // Narrowing Type Casting
        intVariable = (int) doubleVariable;

        System.out.println(intVariable);

    }

}
