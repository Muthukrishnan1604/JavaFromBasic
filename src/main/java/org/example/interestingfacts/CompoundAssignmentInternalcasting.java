package src.main.java.org.example.interestingfacts;

/*
 In actual java code if we try to apply operator with two different data types compiler will throw error

 Example result = result + 10.5;

 but if we do the same with compound Assignment operator it will do the casting

 Example result += 10.5;

 internally above code will get converted to result = (type of result) (result + 10.5)

 */
public class CompoundAssignmentInternalcasting {

    public static void main(String[] args) {
        int result = 10;

        result += 15.5;

        //result = result + 15.5;

        //result = (int) (result + 15.5);

        System.out.println(result);

        result *= 5;

        System.out.println(result);

        result /= 5;

        System.out.println(result);

        byte byteVar = 5;
        short shortVar = byteVar;
        int intVar = shortVar;
        float floatVar = intVar;

        long longVar = intVar;
        float floatVar1 = longVar;
        System.out.println(floatVar1);

    }
}
