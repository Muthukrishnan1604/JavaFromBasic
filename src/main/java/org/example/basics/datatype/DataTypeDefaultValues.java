package src.main.java.org.example.basics.datatype;

/*
    Run the below code to see the default value which is assigned by java compiler for each primitive data type

    Note:
    1. It is not good practice to leave the variable unassigned without assigning value
    2. If you didn't initialize local variable with some value, we will get compiler error
*/

public class DataTypeDefaultValues {

    public static void main(String[] args) {
        // Uncomment the below two lines to see the issue discussed in note 2
        /*int localVariable;

        System.out.println("Local Variable " + localVariable);*/

        DefaultValue defaultValue = new DefaultValue();

        System.out.println("Default byte value " + defaultValue.getByteVariable());

        System.out.println("Default short value " + defaultValue.getShortVariable());

        System.out.println("Default int value " + defaultValue.getIntVariable());

        System.out.println("Default long value " + defaultValue.getLongVariable());

        System.out.println("Default float value " + defaultValue.getFloatVariable());

        System.out.println("Default double value " + defaultValue.getDoubleVariable());

        System.out.println("Default char value " + defaultValue.getCharVariable());

        System.out.println("Default boolean value " + defaultValue.isBooleanVariable());

        System.out.println("Default String value " + defaultValue.getStringVariable());
    }

}
