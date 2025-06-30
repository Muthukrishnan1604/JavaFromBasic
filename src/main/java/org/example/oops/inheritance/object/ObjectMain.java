package src.main.java.org.example.oops.inheritance.object;

import src.main.java.org.example.oops.constructor.StudentConstructor;

public class ObjectMain extends Object {

    public static void main(String[] args) {
        StudentConstructor studentConstructor = new StudentConstructor("Muthu", 7);
        System.out.println(studentConstructor);

        PrimarySchoolStudent muthu = new PrimarySchoolStudent("Muthu", 7, "Durai");
        System.out.println(muthu);
    }
}


