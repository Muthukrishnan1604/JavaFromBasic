package src.main.java.org.example.strings;

/*
method - description

length - Returns the number of characters in the String.

charAt - Returns the character at the index that's passed.

indexOf - Returns an integer, representing the index in the sequence where the String or character passed,
can be located in the String.

lastIndexOf - Returns an integer, representing the index in the sequence where the String or character passed,
can be located in the String.

isEmpty - Returns true if length is zero.

isBlank - Returns true if length is zero OR the string only contains whitespace characters, added in JDK 11.
 */

public class StringInspectionMethod {

    public static void main(String[] args) {
        String input = "Hello Muthu!";
        StringInspectionMethod.printInfo(input);
        printInfo("");
        printInfo("\t    \n");

        System.out.printf("Index of Muthu = %d%n",input.indexOf("Muthu"));
        System.out.printf("Index of u = %d%n",input.indexOf('u'));
        System.out.printf("Last Index of u = %d%n",input.lastIndexOf('u'));

        System.out.println("We can pass particular index limit as well");
        System.out.printf("Index of u = %d%n",input.indexOf('u', 0));
        System.out.printf("Last Index of u = %d%n",input.lastIndexOf('u', 10));

        //Note - If the element not found it will return -1
        System.out.printf("If element not present Index of  = %d%n",input.indexOf('d'));
        System.out.printf("If element not present Last Index of  = %d%n",input.lastIndexOf('d'));
    }

    public static void printInfo(String input) {
        int length = input.length();
        System.out.printf("Input Length = %d%n", length);

        if(input.isEmpty()) {
            System.out.println("Input is Empty");
            return;
        }

        if(input.isBlank()) {
            System.out.println("Input is Blank");
            return;
        }

        System.out.printf("First char = %c%n",  input.charAt(0));

        System.out.printf("Last char = %c%n", input.charAt(length-1));
    }

}
