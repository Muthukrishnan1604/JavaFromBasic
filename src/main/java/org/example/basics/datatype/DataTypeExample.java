package src.main.java.org.example.basics.datatype;

public class DataTypeExample {

    public static void main(String... args) {
        /*
            Below is the way to create variable
            Syntax DataType variable_name = some_value(Optional)
        */
        int intVariable = 10; // This is the Declaration Statement

        char charVariable = 'a';

        // If you didn't do the typecasting as byte java compiler will consider this as int
        byte byteVariable = (byte) 10;

        /*
            If you didn't include L in the end of the value java compiler will consider this as int
            and if you try to update the value to long value it will through compiler error
        */
        long longVariable; // we can declare variable without value as well

        longVariable = 1000000000000L;

        // If you didn't do the typecasting as short java compiler will consider this as int
        short shortVariable = (short) 100;

        /*
            If you didn't include F in the end of the value java compiler will consider this as double by default
            uncomment the below line to see the compiler error
        */
        //float floatVariable = 10.00;

        float floatVariable = 10.00F;

        double doubleVariable = 10.01235;

        boolean booleanVariable = true;

        System.out.println("int Value - " + intVariable);

        System.out.println("short Value - " + shortVariable);

        System.out.println("character Value - " + charVariable);

        System.out.println("byte Value - " + byteVariable);

        System.out.println("long Value - " + longVariable);

        System.out.println("float Value - " + floatVariable);

        System.out.println("double Value - " + doubleVariable);

        System.out.println("boolean Value - " + booleanVariable);

    }

}
