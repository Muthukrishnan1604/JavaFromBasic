package src.main.java.org.example.practice.singleton;

public class LazyInitialization {

    private static LazyInitialization singletonObj;

    private LazyInitialization() {
        System.out.println("Lazy Singleton Object");
    }

    public static LazyInitialization getInstance() {
        if(singletonObj == null) {
            singletonObj = new LazyInitialization();
        }
        return singletonObj;
    }

}
