package src.main.java.org.example.interestingfacts.strings;


/*
 If we use + operator in between two character value it will not perform concat it will perform the addition
 */
public class CharactersWithAdditionOperator {

    public static void main(String[] args) {
        char input1 = 'A';

        char input2 = 'B';

        System.out.println("below code will perform addition not concat");

        System.out.println(input1 + input2);

        // If we need the concat then in that case we need to include the "" before performing the addition
        System.out.println("below code will perform concat");

        System.out.println(input1 + "" + input2);

        System.out.println("" + input1 + input2);

        // Below code will throw compile error
        //String result = input1 + input2;

        // Below code will perform addition and then convert it to a String
        String result = input1 + input2 + "";

        System.out.println(result);

    }

}
