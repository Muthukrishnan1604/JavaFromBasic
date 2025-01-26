package src.main.java.org.example.challenges.datatype;

/*
    Create four variable byte, short, int and create a variable of type long. make it equal to 50,000
    plus 10 times the sum of the values of the first 3 variables.
*/

public class PrimitiveTypeChallenge {

    public static void main(String... args) {

        byte byteVariable = 68;

        short shortvariable = 132;

        int intVariable = 4_000;

        long longVariable = 50_000L + 10L * (byteVariable + shortvariable + intVariable);

        System.out.println("Final Result " + longVariable);

        short result = (short) (1_000 + (10 * (40 + shortvariable + byteVariable)));

        System.out.println("Short Final Result " + result);
    }

}
