package src.main.java.org.example.challenges.datatype;

/*
    Convert a given number of pounds to Kilogram
*/

public class DecimalNumberChallenge {

    public static void main(String... args) {

        double numberOfPounds = 200d;

        double poundInKilogram = 0.45359237;

        double poundToKilogram = numberOfPounds * poundInKilogram;

        System.out.println("Converted Kilogram " + poundToKilogram);

    }

}
