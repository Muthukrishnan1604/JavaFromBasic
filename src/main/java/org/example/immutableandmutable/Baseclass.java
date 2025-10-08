package src.main.java.org.example.immutableandmutable;

public class Baseclass {

    private String test;

    public void setTest(String test) {
        this.test = test;
    }

    public final void recommendedMethod() {
        System.out.println("[Baseclass.baseMethod]: Best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod() {
        System.out.println("[Baseclass.optionalMethod]: Customize Optional Method");
    }

    private void mandatoryMethod() {
        System.out.println("[Baseclass.mandatoryMethod]: NON-Negotiable");
    }

    public static void recommendedStatic() {
        System.out.println("[Baseclass.recommended static]: Best Way to do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic() {
        System.out.println("[Baseclass.optional static]: Optional Method");
    }

    private static void mandatoryStatic() {
        System.out.println("[Baseclass.mandatory]: NON-Negotiable");
    }

    public String getTest() {
        return this.test;
    }
}
