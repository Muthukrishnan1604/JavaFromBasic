package src.main.java.org.example.strings;

public class StringFormat {

    public static void main(String[] args) {

        int age = 27;

        double pay = 30_000.000000d;

        String formattedString = String.format("My age is %d and my pay is %f", age, pay);

        System.out.println(formattedString);

        formattedString = String.format("Allow only two values after decimal %.2f", pay);

        System.out.println(formattedString);

        // Another option from JDK 15 for formatting

        System.out.println("My age is %d".formatted(age));

    }

}
