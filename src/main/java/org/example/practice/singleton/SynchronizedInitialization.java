package src.main.java.org.example.practice.singleton;

public class SynchronizedInitialization {

    private static SynchronizedInitialization singletonObj;

    private SynchronizedInitialization() {
        System.out.println("Synchronized Singleton Object");
    }

    public static synchronized SynchronizedInitialization getInstance() {
        if(singletonObj == null) {
            singletonObj = new SynchronizedInitialization();
        }
        return singletonObj;
    }

}
