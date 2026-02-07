package src.main.java.org.example.singletonpattern.patternbreaker;

import java.io.Serializable;

public class BillPugh implements Serializable {

    private BillPugh() {

    }

    private static class BillPughInnerClass {
        private static final BillPugh billPugh = new BillPugh();
    }

    public static BillPugh getInstance() {
        return BillPughInnerClass.billPugh;
    }

    // This method is the key to preserving the singleton property during deserialization
    protected Object readResolve() {
        return getInstance();
    }

}
