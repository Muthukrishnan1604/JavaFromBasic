package src.main.java.org.example.datatype;
/*
    Underflow in Java occurs when a data type tries to hold a value that is smaller than its minimum limit.
    This situation is more common with floating-point types but can also happen with integer types.
    For example, consider the byte type, which ranges from -128 to 127. If you subtract 1 from -128,
    the value underflows to 127 because of how binary arithmetic handles overflow

    Above is applicable for float, int, byte, short, long
*/

public class UnderFlow {

    public static void main(String... args) {
        int underFlow = Integer.MIN_VALUE;

        System.out.println("Value before underflow " + underFlow);

        System.out.println("Value after underflow " + (underFlow - 1));
    }
}
