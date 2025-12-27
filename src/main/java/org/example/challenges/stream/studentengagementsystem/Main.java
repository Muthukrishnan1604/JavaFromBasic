package src.main.java.org.example.challenges.stream.studentengagementsystem;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Course java = new Course("JavaMaster", "Java Masterclass");
        Course python = new Course("Python", "Python Expert");

        Student muthu = new Student("CHN", 2025, 27, "M", true, java, python);

        muthu.watchLecture("JavaMaster", 10, 5, 2024);
        muthu.watchLecture("Python", 7, 7, 2024);

        System.out.println(muthu);

        Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(10)
                .forEach(System.out::println);

        long maleStudentCount = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .filter(student -> "M".equals(student.getGender()))
                .count();

        long femaleStudentCount = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .filter(student -> "F".equals(student.getGender()))
                .count();

        System.out.println("-".repeat(30));

        System.out.println("Male Student Count = " + maleStudentCount);
        System.out.println("Female Student Count = " + femaleStudentCount);

        Predicate<Student> isAgeRangeSatisfy = student -> {
          int age = student.getAge();
          return (age >= 30 && age <= 60);
        };

        long ageBetween30to60Count = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .filter(isAgeRangeSatisfy)
                .count();
        System.out.println("Age between 30 to 60 count = " + ageBetween30to60Count);

        IntSummaryStatistics ageSummary = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .mapToInt(Student::getAge)
                .summaryStatistics();

        System.out.println("Average Age Category = " + ageSummary.getAverage());
        System.out.println("Count = " + ageSummary.getCount());
        System.out.println("Minimum Age = " + ageSummary.getMin());
        System.out.println("Max Age = " + ageSummary.getMax());
        System.out.println("Sum of Age = " + ageSummary.getSum());

        System.out.println("-".repeat(30));

        List<String> distinctCountryCode = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .map(Student::getCountryCode)
                .distinct()
                .toList();

        System.out.println(distinctCountryCode);

        Predicate<Student> enrolledMorethan7Year = student -> student.getAge() - student.getAgeEnrolled() >= 7 && student.getMonthSinceActive() < 12;

        boolean stillActive = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .anyMatch(enrolledMorethan7Year);

        System.out.println(stillActive);

        Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .peek(student -> System.out.println("Post Limit Peek " + student))
                .skip(5)
                .peek(student -> System.out.println("Post skip Peek " + student))
                .limit(5)
                .peek(student -> System.out.println("Again Post Limit Peek " + student))
                .forEach(System.out::println);

        System.out.println(String.join("-".repeat(20),"Sort Students by Age", "-".repeat(20)));

        Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(10)
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .forEach(System.out::println);

        Student[] students = new Student[1000];
        Arrays.setAll(students, (i) -> Student.getRandomStudent(python, java));

        Arrays.stream(students)
                .takeWhile(student -> student.getAge() < 60)
                .forEach(System.out::println);

        Arrays.stream(students)
                .dropWhile(student -> student.getAge() < 60)
                .forEach(System.out::println);

        Predicate<Student> hasProgrammingSkills = Student::hasProgrammingExperience;


        var longTimeLearners = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthSinceActive() < 12))
                .filter(hasProgrammingSkills.negate())
                .limit(5)
                .toArray(Student[]::new);

        var learner = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthSinceActive() < 12))
                .filter(hasProgrammingSkills.negate())
                .limit(5)
                //.toList(); -> This will provide the immutable list if we try to modify it, it will throw unsupported operation
                .collect(Collectors.toList()); // This will provide mutable list in that we can perform modification

        System.out.println("-".repeat(30));
        System.out.println(learner);

        Collections.shuffle(learner);
        System.out.println("After shuffle " + learner);

        Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthSinceActive() < 12))
                .filter(hasProgrammingSkills.negate())
                .limit(5)
                .collect(Collectors.toList());
    }
}
