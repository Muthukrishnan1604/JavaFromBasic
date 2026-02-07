package src.main.java.org.example.reflection;


import src.main.java.org.example.reflection.otherpackage.ProtectedConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReflectionsMain {

    private static final String FORMAT = """
                Method Name = %s Return type value = %s 
            """;

    @Deprecated
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Way to create reflections. We have three-way to create reflections:
        // Step 1
        PublicConstructor publicConstructorObj = new PublicConstructor();
        Class publicConstructor = publicConstructorObj.getClass();
        // Step 2
        Class privateConstructor = Class.forName("src.main.java.org.example.reflection.PrivateConstructor");
        // Step 3
        Class protectedConstructor = ProtectedConstructor.class;

        Method[] methodsInPublicConstructor = publicConstructor.getDeclaredMethods();
        Method[] methodsInPrivateConstructor = privateConstructor.getDeclaredMethods();
        Method[] methodsInProtectedConstructor = protectedConstructor.getDeclaredMethods();

        Map<String, Method[]> reflections = new HashMap<>();
        reflections.put("public", methodsInPublicConstructor);
        reflections.put("private", methodsInPrivateConstructor);
        reflections.put("protected", methodsInProtectedConstructor);

        reflections.forEach((k, v) -> {
            System.out.println("Methods in " + k + " Constructor class");
            for(Method method : v) {
                System.out.print("Method Name = " + ( (!method.getName().isEmpty() && method.getParameters().length > 0) ? method.getName().concat(" -> ") :  method.getName() ));
                System.out.print(" ,Return Type = " + method.getReturnType().getName());
                System.out.print(" ,Modifier Type = " + Modifier.toString(method.getModifiers()));
                Arrays.stream(method.getParameters()).forEach(parameter -> {
                    System.out.print(String.join("Parameter Type ", " , " ));
                });
                System.out.println();
            }
            System.out.println("-".repeat(20));
        });

        Arrays.stream(privateConstructor.getDeclaredConstructors()).forEach(System.out::println);
        Arrays.stream(privateConstructor.getDeclaredConstructors()).forEach(c -> {
            try {
                c.setAccessible(true);
                if(c.getParameterCount() > 0) {
                    c.newInstance(5);
                } else {
                    c.newInstance();
                }
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });

        Arrays.stream(protectedConstructor.getDeclaredConstructors()).forEach(c -> {
            try {
                c.setAccessible(true);
                if(c.getParameterCount() > 0) {
                    c.newInstance(5);
                } else {
                    c.newInstance();
                }
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });

        // SingleTon Breaker
        Class singletonBreaker = Singleton.class;
        Constructor<Singleton> singletonConstructor = singletonBreaker.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        singletonConstructor.newInstance();

        // Private method accessing
        var myPrivateMethod = privateConstructor.getDeclaredMethod("getLengthOfString", String.class);
        System.out.println(myPrivateMethod.getName());
        myPrivateMethod.setAccessible(true);
        var result = (int) myPrivateMethod.invoke(myPrivateMethod, "Muthu");

        System.out.println(result);
    }

}
