package src.main.java.org.example.oops.polymorphism;

public class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Aliens intro", "Interval scene", "Climax");
    }
}
