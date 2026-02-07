package src.main.java.org.example.challenges.stream;

import src.main.java.org.example.challenges.stream.studentengagementsystem.Course;
import src.main.java.org.example.challenges.stream.studentengagementsystem.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.filtering;

public class MappingMain {

    public static void main(String[] args) {
        Course java = new Course("JavaMaster", "Java Masterclass");
        Course python = new Course("Python", "Python Expert");

        List<Student> studentList = IntStream.rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStudent(java, python))
                .toList();

        var mapStudent = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode));

        mapStudent.forEach((k, v) -> System.out.println(k + " " + v.size()));

        System.out.println("-".repeat(20));
        int minAge = 25;
        var youngerSet = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode, filtering(s -> s.getAge() <= minAge, Collectors.toList())));

        youngerSet.forEach((k, v) -> System.out.println(k + " " + v.size()));

        var experienced = studentList.stream()
                .collect(Collectors.partitioningBy(Student::hasProgrammingExperience));

        System.out.println("Experienced Students = " + experienced.get(true).size());

        var expCount = studentList.stream()
                .collect(Collectors.partitioningBy(Student::hasProgrammingExperience, Collectors.counting()));

        System.out.println("Experienced Students = " + expCount.get(true));

        var expAndActive = studentList.stream()
                .collect(Collectors.partitioningBy(s -> s.hasProgrammingExperience() && s.getMonthSinceActive() == 0,
                        Collectors.counting()));

        System.out.println("Experienced Students = " + expAndActive.get(true));

        var multiLevel = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode, Collectors.groupingBy(Student::getGender)));

        multiLevel.forEach((k, v) -> {
            System.out.println(k);
            v.forEach((key, value) -> {
                System.out.println(key);
                System.out.println(value.size());
            } );
        });

        long studentBodyCount = 0;

        for(var list : experienced.values()) {
            studentBodyCount += list.size();
        }

        System.out.println("Student Body Count = " + studentBodyCount);

        studentBodyCount = experienced.values()
                        .stream()
                        .mapToInt(List::size)
                        .sum();

        System.out.println("Student Body Count = " + studentBodyCount);

        studentBodyCount = experienced.values()
                .stream()
                .map(l -> l.stream()
                        .filter(s -> s.getMonthSinceActive() <= 3).count())
                .mapToLong(l -> l)
                .sum();

        System.out.println("Student Body Count = " + studentBodyCount);

        long count = experienced.values()
                .stream()
                .flatMap(s -> s.stream())
                .filter(student -> student.getMonthSinceActive() <= 3)
                .count();

        System.out.println("Student Body Count = " + studentBodyCount);
    }

}
