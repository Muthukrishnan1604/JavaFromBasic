package src.main.java.org.example.challenges.genai.operators;

public class LogicalOperator {

    public static void main(String[] args) {

        if(returnTrue() && returnTrue2()) {
            System.out.println("It will check both the values");
        }

        if(returnTrue() && returnFalse()) {
            System.out.println("It will fail in the second check");
        }

        if(returnFalse() && returnTrue()) {
            System.out.println("It will fail in the first check and won't go to the next check");
        }

        if(returnFalse() || returnTrue()) {
            System.out.println("It will check the next condition as well even first condition fail");
        }

        if(returnTrue() || returnTrue2()) {
            System.out.println("It will check the first condition only as it is true");
        }

    }

    private static boolean returnTrue() {
        System.out.println("Return True 1");
        return true;
    }

    private static boolean returnTrue2() {
        System.out.println("Return True 2");
        return true;
    }

    private static boolean returnFalse() {
        System.out.println("Return False 1");
        return false;
    }

    private static boolean returnFalse2() {
        System.out.println("Return False 2");
        return false;
    }

}
