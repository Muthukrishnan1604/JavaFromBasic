package src.main.java.org.example.practice.immutable;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public record Random(String stringInput, List<String> stringList) {

    public Random(String stringInput, List<String> stringList) {
        this.stringInput = stringInput;
        this.stringList = new ArrayList<>(stringList);
    }

    @Override
    public List<String> stringList() {
        return new ArrayList<>(this.stringList);
    }

}
