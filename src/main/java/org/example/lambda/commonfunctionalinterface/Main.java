package src.main.java.org.example.lambda.commonfunctionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    record Person (String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(new Person("Muthu", "Divi"),
                new Person("Divi", "Muthu"),
                new Person("Muthu", "Apple"),
                new Person("Divi", "Apple")));

        var comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName);
            }
        };

        people.sort(Comparator.comparing(o -> o.lastName));
        System.out.println(people);

        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return result == 0 ? secondLevel(o1, o2) : result;
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };
        people.sort(comparatorMixed);

        System.out.println(people);

        int result = calculator((var value1, var value2) -> value1 + value2, 5, 2);
        var result1 = binaryCalculator((var value1, var value2) -> value1 / value2, 5.0, 2.0);
        var result2 = binaryCalculator((value1,  value2) -> value1.toUpperCase() + " " + value2.toUpperCase(), "Muthu", "2");
        int result3 = calculator((value1, value2) -> value1 / value2, 5, 2);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result3);
        System.out.println(result2);

    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println(result);
        return result;
    }

    public static <T> T binaryCalculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println(result);
        return result;
    }

}
