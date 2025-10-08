package src.main.java.org.example.challenges.bitwiseoperator;

/*
Challenge 2: Power of Two Check (AND Operation)
Determine if a given non-negative integer N is a power of two (i.e., N=2
k
  where k≥0). A number is a power of two if and only if it has exactly one bit set to 1 in its binary representation.

Constraint: The solution must use the bitwise AND ($\texttt{&}$) operator in a clever way to achieve this check in O(1) time. You must also handle the edge case of N=0.

Question: Implement a method isPowerOfTwo(int n) that returns true if n is a power of two and false otherwise.
 */

public class PowerOfTwoChecker {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(12));
        System.out.println(isPowerOfTwo(1));
    }

    private static boolean isPowerOfTwo(int input) {
        return (input & (input -1)) == 0;
    }
}
