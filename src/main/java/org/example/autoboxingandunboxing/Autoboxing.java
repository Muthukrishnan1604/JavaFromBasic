package src.main.java.org.example.autoboxingandunboxing;

import java.util.ArrayList;

public class Autoboxing {

    public static void main(String[] args) {
        Integer integerValue = new Integer(10); // Deprecated
        Integer integer = Integer.valueOf(15); // Autoboxing this is not required we can directly assign value to it
        int intValue = integer.intValue(); // Unboxing

        // Automatic
        Integer integer1 = 10; // System will internally perform autoboxing
        intValue = integer1; // System will internally perform unboxing
        System.out.println(integer1.getClass().getSimpleName());
        System.out.println(intValue);

        double doubleValue = getDoubleObject();
        Double doubleVal = getLiteralDoublePrimitive();

        var list = getList(2, 3, 4, 5, 6, 7);
        System.out.println(list.getClass().getName());
        System.out.println(list);
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 10.00;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static ArrayList<Integer> getList(Integer... varArgs) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int value : varArgs) {
            list.add(value);
        }
        return list;
    }
}
