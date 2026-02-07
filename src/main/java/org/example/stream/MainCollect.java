package src.main.java.org.example.stream;

/*
In this class we will cover all the collect methods
 */

import src.main.java.org.example.challenges.stream.studentengagementsystem.Course;
import src.main.java.org.example.challenges.stream.studentengagementsystem.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollect {

    public static void main(String[] args) {

        Course java = new Course("JavaMaster", "Java Masterclass");
        Course python = new Course("Python", "Python Expert");

        List<Student> studentList = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .toList();

        Set<Student> chnStudents = studentList.stream()
                .filter(student -> "CHN".equalsIgnoreCase(student.getCountryCode()))
                .collect(Collectors.toSet());

        System.out.println("Chennai Student = " + chnStudents.size());

        Set<Student> under30 = studentList.stream()
                .filter(student -> student.getAgeEnrolled() < 30)
                .collect(Collectors.toSet());

        System.out.println("Under Thirty Student = " + under30.size());

        Set<Student> youngChn = new TreeSet<>(Comparator.comparing(Student::getStudentId));

        youngChn.addAll(chnStudents);
        youngChn.retainAll(under30);

        youngChn.forEach(student -> System.out.print(student.getStudentId() + " "));

        System.out.println();

        Set<Student> youngChn2 = studentList.stream()
                .filter(student -> student.getAgeEnrolled() < 30)
                .filter(student -> "CHN".equalsIgnoreCase(student.getCountryCode()))
                .collect(() -> new TreeSet<>(Comparator.comparing(Student::getStudentId)), Set::add, TreeSet::addAll);

        youngChn2.forEach(student -> System.out.print(student.getStudentId() + " "));

        System.out.println();

        String countryList = studentList.stream()
                .map(Student::getCountryCode)
                .distinct()
                .sorted()
                .reduce("", ((string, string2) -> string + " " + string2));

        System.out.println(countryList);


        List<Integer> integerList = Stream.of(3, 1, 4, 5, 1)
                .collect(ArrayList::new, List::add, ArrayList::addAll);

        System.out.println(integerList);

        Map<Character, Integer> map = Stream.of("cat", "car", "dog", "dove", "divi")
                .collect(() -> new HashMap<>(), (k, v) -> {
                    System.out.println(v);
                    if(k.containsKey(v.charAt(0))) {
                        Integer value = k.get(v.charAt(0)) + 1;
                        k.put(v.charAt(0), value);
                    } else {
                        k.put(v.charAt(0), 1);
                    }
                }, HashMap::putAll);
        System.out.println(map);

        Integer result = Stream.of(1, 2, 5, 6, 8)
                .reduce(10 , Integer::sum);

        String stringResult = Stream.of("Muthu", "Divi", "Hema")
                        .reduce("", (string, string1) -> String.join(",", string, string1) );

        System.out.println(result);

        System.out.println(stringResult);
    }


}
