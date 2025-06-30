package src.main.java.org.example.oops.methodoverriding;

public class Engine {
    String type;
    public Engine(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Engine Type: " + type;
    }
}
