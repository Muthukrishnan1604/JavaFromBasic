package src.main.java.org.example.reflection.otherpackage;

public class ProtectedConstructor {

    protected String protectedString;

    protected Integer privateIntegerValue;

    protected static final String PROTECTED_FINAL_FIELD = "Testing";

    protected ProtectedConstructor() {
        System.out.println("Inside protected constructor");
    }

    protected void printDetails(int iteration, String contentToBePrinted) {
        System.out.println("Print method from protected Constructor class");
        protectedString = contentToBePrinted;
        privateIntegerValue = iteration;
        for(int i = 0; i < iteration; i++) {
            System.out.println(contentToBePrinted);
        }
    }

}
