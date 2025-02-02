package src.main.java.org.example.basics.method;

/*
To improve the code readability and avoid the duplicate code
lower camel case is recommended for method name
parameter order is important
 */

public class MethodInJava {

    public static void main(String[] args) {
        int score = 10_000;
        int bonus = 200;
        int level = 8;
        int finalScore = 0;

        calculateScore(score, bonus, level, finalScore);
        finalScore = 20_000;
        calculateScore(score, bonus, level, finalScore);
    }

    public static void calculateScore(int score, int bonus, int level, int finalScore) {
        System.out.println("Before check: " + finalScore);

        if(score > 1000) {
            finalScore += score + (bonus * level);
        }

        System.out.println("After check: " + finalScore);
    }

}
