package src.main.java.org.example.singletonpattern;

public class SynchronizedInitialization {

    private static SynchronizedInitialization synchronizedInitialization;

    private SynchronizedInitialization() {

    }

    public static synchronized SynchronizedInitialization getInstance() {
        if (synchronizedInitialization == null) {
            synchronizedInitialization = new SynchronizedInitialization();
        }
        return synchronizedInitialization;
    }

}
