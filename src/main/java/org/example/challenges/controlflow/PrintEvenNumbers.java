package src.main.java.org.example.challenges.controlflow;

/**
 * Step 1 is to create a method called isEvenNumber that takes a parameter of type int.
 * Its purpose is to determine if the argument passed to the method is an even number or not.
 * Return true from the method if it's an even number; otherwise, return false.
 * Next, use a while loop to test a range of numbers from 5 up to and including 20, but printing out only the even numbers determined by the call to the isEvenNumber method.Step 1 is to create a method called isEvenNumber that takes a parameter of type int.
 * Its purpose is to determine if the argument passed to the method is an even number or not.
 * Return true from the method if it's an even number; otherwise, return false.
 * Next, use a while loop to test a range of numbers from 5 up to and including 20, but printing out only the even numbers determined by the call to the isEvenNumber method.
 */

public class PrintEvenNumbers {

    public static void main(String[] args) {
        int i = 5, even = 0, odd = 0;

        while(i <= 20) {
            i++;
            if(!isEvenNumber(i)) {
                odd++;
                continue;
            }
            even++;
            System.out.println("Even Number " + i);
            if(even == 5) {
                break;
            }
        }

        System.out.println("Total odd number " + odd);
        System.out.println("Total even number " + even);
    }

    public static boolean isEvenNumber(int number) {
        return (number & 1) == 0;
    }

}