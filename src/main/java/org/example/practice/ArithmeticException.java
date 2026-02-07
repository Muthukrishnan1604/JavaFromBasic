package src.main.java.org.example.practice;

public class ArithmeticException {

    public static void main(String[] args) {

        System.out.println(1.0/0.0); // this will return infinity

        System.out.println(1.0/0);// this will return infinity

        System.out.println(1/0);// this will return infinity

        System.out.println(Double.parseDouble("1")/Double.parseDouble("0.0"));
    }


}
