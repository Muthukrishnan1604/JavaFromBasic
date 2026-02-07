package src.main.java.org.example.reflection;

public class Singleton {

    private Singleton() {
        if(SingletonHelper.singletonInstance == null) {
            System.out.println("My Singleton class");
        } else {
            System.out.println("Singleton Object already exist");
        }
    }

    private static class SingletonHelper {
        private static final Singleton singletonInstance = new Singleton();
    }

    public Singleton getInstance() {
        return SingletonHelper.singletonInstance;
    }

}
