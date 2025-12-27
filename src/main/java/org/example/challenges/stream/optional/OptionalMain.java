package src.main.java.org.example.challenges.stream.optional;

import src.main.java.org.example.challenges.stream.studentengagementsystem.Course;
import src.main.java.org.example.challenges.stream.studentengagementsystem.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalMain {

    public static void main(String[] args) {
        Course java = new Course("JavaMaster", "Java Masterclass");
        Course python = new Course("Python", "Python Expert");
        Course ai = new Course("AI", "AI Expert");


        List<Student> studentList = Stream.generate(() -> Student.getRandomStudent(java, python))
                .limit(1000)
                .collect(Collectors.toList());

        Optional<Student> o1 = getStudent(new ArrayList<>(), "first");
        System.out.println("Empty = " + o1.isEmpty() + ", Present = " + o1.isPresent());
        System.out.println(o1);
        //studentList.addFirst(null);
        Optional<Student> o2 = getStudent(studentList, "first");
        System.out.println("Empty = " + o2.isEmpty() + ", Present = " + o2.isPresent());
        System.out.println(o2);

        System.out.println("Testing...");
        o1.ifPresentOrElse(System.out::println, () -> System.out.println("No element Present"));
        System.out.println(o2.get());
        o2.ifPresent(student -> {
                student.addCourse(ai);
                System.out.println(student);
        });

        //Student firstStudent = o2.orElse(getDummyStudent(java)); // This will invoke the getDummyStudent method even though we have value in o2
        Student firstStudent = o2.orElseGet(() -> getDummyStudent(java));
        long id = firstStudent.getStudentId();
        System.out.println(id);

        List<String> countryList = studentList.stream()
                .filter(Objects::nonNull)
                .map(Student::getCountryCode)
                .toList();

        Optional.of(countryList)
                .map(str -> String.join(",", str))
                .filter(str -> str.contains("FR"))
                .ifPresentOrElse(System.out::println, () -> System.out.println("Missing FR"));
    }

    private static Student getDummyStudent(Course... courses) {
        System.out.println("Getting the dummy Student");
        return new Student("NO", 1, 1, "U", false, courses);
    }

    private static Optional<Student> getStudent(List<Student> studentList, String type) {
        if(studentList == null || studentList.isEmpty()) {
            return Optional.empty();
        } else if ("first".equalsIgnoreCase(type)) {
            return Optional.ofNullable(studentList.getFirst());
        } else if ("last".equalsIgnoreCase(type)) {
            return Optional.ofNullable(studentList.getLast());
        } else {
            return Optional.ofNullable(studentList.get(new Random().nextInt(studentList.size())));
        }
    }

}
