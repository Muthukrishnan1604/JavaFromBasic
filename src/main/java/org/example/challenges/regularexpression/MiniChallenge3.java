package src.main.java.org.example.challenges.regularexpression;

public class MiniChallenge3 {

    public static void main(String[] args) {

        String regex = "^[A-Z][\\p{all}]+[.!?]$";

        System.out.println("Hello muthu how are you!".matches(regex));
        System.out.println("Hello muthu, how are you?".matches(regex));
    }

}
