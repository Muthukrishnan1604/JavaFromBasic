package src.main.java.org.example.challenges.generics;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {

    List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElement(T t) {
        if(!layerElements.contains(t)) {
            layerElements.add(t);
        }
    }

    public void addElements(List<T> t) {
        for (T val : t) {
            if(!layerElements.contains(val)) {
                layerElements.add(val);
            }
        }
    }

    public void renderLayer() {
        for(T t : layerElements) {
            t.render();
        }
    }

}
