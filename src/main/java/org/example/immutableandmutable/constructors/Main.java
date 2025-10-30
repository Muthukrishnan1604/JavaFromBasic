package src.main.java.org.example.immutableandmutable.constructors;

import src.main.java.org.example.immutableandmutable.constructors.external.Child;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent("Muthu", "16/04/1998", 2);
        Child child = new Child();

        System.out.println(parent);
        System.out.println(child);
    }

}
