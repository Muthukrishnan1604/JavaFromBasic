package src.main.java.org.example.basics.variables;

/*
    There are different types of variables in Java. They are

        1. Instance Variable - Variable declared in class level [ static and non-static ]
        2. Local Variable - Variable declared in method level
        3. Parameter variable - Variable assigned in the method parameter
*/

import java.util.Arrays;

public class TypesOfVariables {

    private int instanceVariable;

    private static final int instanceStaticVariable = 10;

    public int getInstanceVariable() {
        return instanceVariable;
    }

    // In the below line args is the parameter variable
    public static void main(String[] args) {

        TypesOfVariables variable = new TypesOfVariables();

        int localVariable = 10;

        System.out.println("Print Local Variable " + localVariable);

        System.out.println("Print instance Variable " + variable.getInstanceVariable());

        System.out.println("Print static instance variable " + instanceStaticVariable);

        System.out.println("Print parameter Variable " + Arrays.stream(args).toList());
    }

}
