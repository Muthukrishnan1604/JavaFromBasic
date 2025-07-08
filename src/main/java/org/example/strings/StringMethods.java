package src.main.java.org.example.strings;

public class StringMethods {

    public static void main(String[] args) {
        String birthDate = "16/04/1998";

        int startingIndex = birthDate.indexOf("1998");

        System.out.println("starting index = " + startingIndex);

        System.out.println("Birth Year = " + birthDate.substring(startingIndex));

        System.out.println("Birth Month = " + birthDate.substring(3, startingIndex-1));

        String newDate = String.join("-", "16", "04", "1998");
        System.out.println(newDate);

        newDate = "16";
        newDate = newDate.concat("/");
        newDate = newDate.concat("04");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1998");

        System.out.println(newDate);

        newDate = "31" + "-" + "01" + "-" + "1998";

        System.out.println(newDate);

        newDate = "31".concat("/").concat("01").concat("/").concat("1998");
        System.out.println(newDate);

        // Replace method
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("16", "sixteen"));

        System.out.println(newDate.replaceFirst("sixteen", "16"));
        // We can use this for targeting regular expression
        System.out.println(newDate.replaceAll("-", "/"));

        System.out.println("MuthuDivya\n".repeat(5));
        System.out.println("-".repeat(20));

        System.out.println("MuthuDivya\n".repeat(5).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("     MuthuDivya\n".repeat(5).indent(-3));
        System.out.println("-".repeat(20));
    }
}
