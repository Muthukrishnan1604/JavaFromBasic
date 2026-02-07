package src.main.java.org.example.practice.singleton;

public class DoubleLockInitialization {
    private static volatile DoubleLockInitialization singletonObj;

    private DoubleLockInitialization() {
        System.out.println("Double Lock Initialization");
    }

    public static DoubleLockInitialization getInstance() {
        if(singletonObj == null) {
            synchronized (DoubleLockInitialization.class) {
                if(singletonObj == null) {
                    singletonObj = new DoubleLockInitialization();
                }
            }
        }
        return singletonObj;
    }

}
