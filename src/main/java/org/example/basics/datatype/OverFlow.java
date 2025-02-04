package src.main.java.org.example.basics.datatype;

/*
    Overflow in Java occurs when a data type exceeds its maximum limit and wraps around to the minimum value,
    resulting in unexpected behavior. This is common with integer types like byte, short, int, and long.
*/

public class OverFlow {

    public static void main(String... args) {
        int overFlow = Integer.MAX_VALUE;

        System.out.println("Value before underflow " + overFlow);

        System.out.println("Value after underflow " + (overFlow + 1));
    }

}
