package src.main.java.org.example.practice.singleton;

public class EagerInitialization {

    private static final EagerInitialization singletonObj = new EagerInitialization();

    private EagerInitialization() {
        System.out.println("Singleton Object");
    }

    public static EagerInitialization getInstance() {
        return singletonObj;
    }
}
