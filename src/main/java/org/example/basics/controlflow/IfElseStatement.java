package src.main.java.org.example.basics.controlflow;

/*
 We can add multiple else if block if needed

 We have only one else block that is also optional, else block will get executed only if previous statements are false
 */


public class IfElseStatement {

    public static void main(String[] args) {
        int value = 1000;

        if (value > 1000) {
            System.out.println("Value is greater than 1000");
        } else if (value < 1000) {
            System.out.println("Value is less than 1000");
        } else {
            System.out.println("Value is equal to 1000");
        }
    }

}
