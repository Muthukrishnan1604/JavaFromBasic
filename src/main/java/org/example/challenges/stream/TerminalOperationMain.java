package src.main.java.org.example.challenges.stream;

import src.main.java.org.example.challenges.stream.studentengagementsystem.Course;
import src.main.java.org.example.challenges.stream.studentengagementsystem.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationMain {

    public static void main(String[] args) {
        Course java = new Course("JavaMaster", "Java Masterclass");
        Course python = new Course("Python", "Python Expert");
        Course ai = new Course("AI", "AI Expert");


        List<Student> studentList = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .toList();

        int minAge = 18;

        studentList.stream()
                .filter(Objects::nonNull)
                .filter(student -> student.getAge() <= minAge)
                .findAny()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone"));

        studentList.stream()
                .filter(Objects::nonNull)
                .filter(student -> student.getAge() <= minAge)
                .findFirst()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone"));

        studentList.stream()
                .filter(Objects::nonNull)
                .filter(student -> student.getAge() <= minAge)
                .min(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone"));

        studentList.stream()
                .filter(Objects::nonNull)
                .filter(student -> student.getAge() <= minAge)
                .max(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone"));

        studentList.stream()
                .filter(Objects::nonNull)
                .filter(student -> student.getAge() <= minAge)
                .mapToInt(Student::getAge)
                .average()
                .ifPresentOrElse(s -> System.out.printf("Average age of students is %f %n", s),
                        () -> System.out.println("Didn't find anyone"));

        studentList.stream()
                .filter(Objects::nonNull)
                .filter(student -> student.getAge() <= minAge)
                .map(Student::getCountryCode)
                .distinct()
                .reduce((student, student2) -> String.join(",", student, student2))
                .ifPresentOrElse(s -> System.out.printf("Unique Country Code %s %n", s),
                        () -> System.out.println("Didn't find anyone"));

        var result = studentList.stream()
                .filter(Objects::nonNull)
                .collect(() -> new HashMap<Long, Student>(), (studentMap, student) -> {
                    System.out.println("Testing my knowledge");
                    studentMap.putIfAbsent(student.getStudentId(), student);
                }, HashMap::putAll);

        System.out.println(result);
    }

}
