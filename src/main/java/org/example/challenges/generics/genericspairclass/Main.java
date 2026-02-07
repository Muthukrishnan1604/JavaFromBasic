package src.main.java.org.example.challenges.generics.genericspairclass;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Testing 1", 10);

        Pair<Double, String> pair2 = new Pair<>(1.0, "Testing 2");

        Pair<String, String> pair3 = new Pair<>("Testing 3", "Testing 3");

        System.out.println(pair1);
        System.out.println("-".repeat(30));
        System.out.println(pair2);
        System.out.println("-".repeat(30));
        System.out.println(pair3);
        System.out.println("-".repeat(30));
    }

}
