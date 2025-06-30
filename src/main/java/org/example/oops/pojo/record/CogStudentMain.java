package src.main.java.org.example.oops.pojo.record;

import src.main.java.org.example.oops.pojo.legacy.Student;

public class CogStudentMain {

    public static void main(String[] args) {

        for(int i = 1; i < 6; i++ ) {
            CogStudent s = new CogStudent(i, switch (i) {
                case 1 -> "Muthu";
                case 2 -> "Divya";
                case 3 -> "Krishna";
                case 4 -> "Latha";
                default -> "Durai";
            }, "16/04/1998", "Java");
            System.out.println(s);
        }

        Student pojoStudent = new Student(1234, "Muthu", "16/04/1998", "Java");

        CogStudent recordStudent = new CogStudent(3456, "Divya", "31/01/1998", "Python");

        CogStudent recordStudent2 = recordStudent;

        System.out.println(pojoStudent);
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        pojoStudent.setName("Krishna");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

       // We don't have the getter method in record we need to use the camel case to get the value
       // record don't support setter to maintain the immutable
        System.out.println(recordStudent);
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

        System.out.println(recordStudent2.name() + " is taking " + recordStudent.classList());

    }

}
