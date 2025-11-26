package src.main.java.org.example.practice.reflection;

import src.main.java.org.example.practice.singleton.BillPughInitialization;

import java.lang.reflect.InvocationTargetException;

public class Reflections {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class obj = Class.forName("src.main.java.org.example.practice.singleton.BillPughInitialization");

        var constructor = obj.getDeclaredConstructor();

        constructor.setAccessible(true);

        System.out.println(constructor.getParameterCount());

        var method = obj.getDeclaredMethod("test", String.class);

        method.setAccessible(true);

        var result = (String) method.invoke(constructor.newInstance(), "VANAKKAM DA Mapula");

        System.out.println(result);

        Class obj2 = BillPughInitialization.class;

        Reflections reflections = new Reflections();

        reflections.getClass();
    }

}
