package src.main.java.org.example.singletonpattern;

public class BillPugh {

    private BillPugh() {

    }

    private static class BillPughInnerClass {
        private static final BillPugh billPugh = new BillPugh();
    }

    public static BillPugh getInstance() {
        return BillPughInnerClass.billPugh;
    }

}
