package src.main.java.org.example.basics.datatype;

/*
 By default java will treat the decimal value as double so
 we need to either type casting it as float or add the F in the prefix

 Advisable way is to use the F in the prefix
*/

public class FloatAndDoubleDataType {

    public static void main(String... args) {
        float floatVariable = 5.25f;

        double doubleVariable = 10.00001;

        System.out.println(floatVariable);

        System.out.println(doubleVariable);
    }

}
