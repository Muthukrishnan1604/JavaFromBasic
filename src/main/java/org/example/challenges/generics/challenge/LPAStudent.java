package src.main.java.org.example.challenges.generics.challenge;

import src.main.java.org.example.generics.util.QueryItem;

public class LPAStudent extends Student implements QueryItem {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.00);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    @Override
    public int compareTo(Double anotherId) {
        return Double.compare(percentComplete, anotherId);
    }
}
