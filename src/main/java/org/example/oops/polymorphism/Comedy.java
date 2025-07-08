package src.main.java.org.example.oops.polymorphism;

public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Something Funny happens", "Something even funnier happens", "Happy Ending");
    }
}
