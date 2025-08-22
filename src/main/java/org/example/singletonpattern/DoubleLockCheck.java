package src.main.java.org.example.singletonpattern;

public class DoubleLockCheck {

    private static volatile DoubleLockCheck doubleLockCheck;

    private DoubleLockCheck() {

    }

    public static DoubleLockCheck getInstance() {
        if(doubleLockCheck == null) {
            synchronized (DoubleLockCheck.class) {
                if(doubleLockCheck == null) {
                    doubleLockCheck = new DoubleLockCheck();
                }
            };
        }
        return doubleLockCheck;
    }

}
