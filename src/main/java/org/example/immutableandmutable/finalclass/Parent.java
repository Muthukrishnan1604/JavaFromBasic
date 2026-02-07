package src.main.java.org.example.immutableandmutable.finalclass;

import java.util.ArrayList;
import java.util.List;

public final class Parent {

    private final List<String> input;

    public Parent(List<String> input) {
        this.input = new ArrayList<>(input);
    }

    public List<String> getInput() {
        return new ArrayList<>(input);
    }
}
