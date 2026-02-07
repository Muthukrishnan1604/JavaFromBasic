package src.main.java.org.example.strings;

public class StripAndTrim {

    public static void main(String[] args) {
        String t = " Strip Leading ".stripLeading();
        System.out.println("Strip Leading will remove the leading spaces " + t.replaceAll(" ", "_"));
        t = " Strip Trailing ".stripTrailing();
        System.out.println("Strip Trailing will remove the spaces in the end " + t.replaceAll(" ", "_"));
        t = " Strip Leading ".strip();
        System.out.println("Strip will remove the spaces in the start and end " + t.replaceAll(" ", "_"));
        t = " Trim Spaces ".trim();
        System.out.println("Trim will also remove the spaces in the start and end but strip is created to handle all spaces " + t.replaceAll(" ", "_"));
    }

}
