package src.main.java.org.example.lambda.commonfunctionalinterface;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);

}
