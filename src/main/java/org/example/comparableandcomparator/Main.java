package src.main.java.org.example.comparableandcomparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer integer = 5;

        Integer[] integers = {0, 5, 10, -50, 50};

        System.out.println(equalsIgnoreCase("Muthu", "Divya"));

        for (Integer value : integers) {
            int val = integer.compareTo(value);
            System.out.printf("%d %s %d: compareTo = %d%n", integer, (val == 0 ? "=" : (val > 0) ? ">" :  "<"), value, val);
        }

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String value : fruit) {
            int val = banana.compareTo(value);
            System.out.printf("%s %s %s: compareTo = %d%n", banana, (val == 0 ? "=" : (val > 0) ? ">" :  "<"), value, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        Student muthu = new Student("Muthu");

        Student[] students = {new Student("Divi"), new Student("Hema"), new Student("Hepsi"), new Student("Victor"), new Student("Maggi")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }


    public static boolean equalsIgnoreCase(String input1, String input2) {
        if(input1.length() == input2.length()) {
            int value1, value2, result;
            for(int i = 0; i < input1.length(); i++) {
                value1 = input1.charAt(i);
                value2 = input2.charAt(i);
                result = (value1 > value2) ? (value1 - value2) : (value2 - value1);
                if(result != 0 && result != 32)
                    return false;
            }
            return true;
        }
        return false;
    }
}
