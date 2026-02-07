package src.main.java.org.example.generics;

public class LPAStudent extends Student {

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
}
