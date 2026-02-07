package src.main.java.org.example.practice.singleton;

import java.io.Serializable;

public class BillPughInitialization {

    private BillPughInitialization() {
        System.out.println("Bill Pugh Initialization");
    }

    private static class BillPughHelper {
        private static final BillPughInitialization singletonObj = new BillPughInitialization();
    }

    public static BillPughInitialization getInstance() {
        return BillPughHelper.singletonObj;
    }

    private String test(String input) {
        return input.toLowerCase();
    }

}
