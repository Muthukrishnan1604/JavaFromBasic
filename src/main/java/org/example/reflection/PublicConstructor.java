package src.main.java.org.example.reflection;

public class PublicConstructor {
    
    public String publicString;
    
    public Integer publicIntegerValue;

    public static final String PUBLIC_FINAL_FIELD = "Testing";
    
    public PublicConstructor() {
        System.out.println("Inside public constructor");
    }

    public void printDetails(int iteration, String contentToBePrinted) {
        publicString = contentToBePrinted;
        for(int i = 0; i < iteration; i++) {
            System.out.println(contentToBePrinted);
        }
    }

}
