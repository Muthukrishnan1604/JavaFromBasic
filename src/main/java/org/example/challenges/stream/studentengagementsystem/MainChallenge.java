package src.main.java.org.example.challenges.stream.studentengagementsystem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Difference between toList and Collectors.
 */

public class MainChallenge {

    public static void main(String[] args) {
        Course java = new Course("JavaMaster", "Java Masterclass", 100);
        Course python = new Course("Python", "Python Expert", 50);
        Course gameInJava = new Course("JavaGame", "Creating Games in Java");

        var studentStream = Stream.iterate(1, s -> s <= 5000, i -> i + 1)
                .map(i -> Student.getRandomStudent(java, python))
                .toList();

        double result = studentStream.stream()
                .mapToDouble(student -> student.getPercentComplete("JavaMaster"))
                .reduce(0, Double::sum);

        double averageResult = studentStream.stream()
                .mapToDouble(student -> student.getPercentComplete("JavaMaster"))
                .average().orElse(0);


        double averagePercent = result / studentStream.size();

        System.out.printf("Average Percentage Complete = %.2f%% %n", averagePercent);

        System.out.printf("Average Percentage Complete = %.2f%% %n", averageResult);

        int topPercent = (int) (1.25 * averagePercent);

        System.out.printf("Best Percentage Complete = %d%% %n", topPercent);

        Comparator<Student> longTermStudent = Comparator.comparing(Student::getYearEnrolled);

        List<Student> hardWorker = studentStream.stream()
                .filter(student -> student.getMonthSinceActive("JavaMaster") == 0)
                .filter(student -> student.getPercentComplete("JavaMaster") >= topPercent)
                .sorted(longTermStudent)
                .limit(10)
                .collect(() -> new ArrayList<>(), ArrayList::add, ArrayList::addAll);

        System.out.println("Hardworker = " + hardWorker.size());

        hardWorker.forEach((work) -> work.addCourse(gameInJava));

        String res = Stream.iterate(0, i -> i <= 100, i -> i + 1)
                .mapToInt(i -> i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ", "[", "]"));

        System.out.println(res);
    }

}
