package src.main.java.org.example.singletonpattern;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if(lazyInitialization == null) {
            lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }

}
