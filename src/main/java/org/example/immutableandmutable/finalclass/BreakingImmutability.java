package src.main.java.org.example.immutableandmutable.finalclass;

import java.util.Arrays;

public class BreakingImmutability {

    public static void main(String[] args) {

        Parent parent = new Parent(Arrays.asList("Muthu", "Divi", "Hema"));

        var list = parent.getInput();

        System.out.println(list);

        list.add("Test");

        System.out.println(list);


    }



}
