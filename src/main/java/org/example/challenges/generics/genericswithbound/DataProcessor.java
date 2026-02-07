package src.main.java.org.example.challenges.generics.genericswithbound;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor<T extends Number> {

    private List<T> dataList;

    public DataProcessor(List<T> dataList) {
        this.dataList = new ArrayList<>(dataList);
    }

    public Double sumList() {
        double sum = 0;
        for(T t : dataList) {
            sum += t.doubleValue();
        }
        return sum;
    }
}
