package src.main.java.org.example.challenges.regularexpression;

public class MiniChallenge2 {

    public static void main(String[] args) {
        String regex = "^[A-Z][a-z\\s]*\\.";

        System.out.println("Hello muthu.".matches(regex));
        System.out.println("hello.".matches(regex)); // Does not start with capital letter
        System.out.println("H.".matches(regex)); // Does not have any small letter so false
        System.out.println("He.".matches(regex)); // Have all matching characters so true
        System.out.println("Hell.".matches(regex)); // Have all matching characters so true
        System.out.println("Hell".matches(regex)); // Full stop is missing so false
    }

}
