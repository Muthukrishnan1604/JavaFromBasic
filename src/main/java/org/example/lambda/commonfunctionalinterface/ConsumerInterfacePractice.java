package src.main.java.org.example.lambda.commonfunctionalinterface;


import java.util.Arrays;
import java.util.function.BiConsumer;

public class ConsumerInterfacePractice {

    public static void main(String[] args) {
        var co_ordinates = Arrays.asList(new double[]{47.2160, -95.2348}
                , new double[] {42.2160, -92.2348}
                , new double[] {41.2160, -91.2348}
                , new double[] {40.2160, -90.2348});
        co_ordinates.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> biConsumer = (lat, lon) -> System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lon);

        co_ordinates.forEach(co_ordinate -> processPoint(co_ordinate[0], co_ordinate[1], biConsumer));
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

}
