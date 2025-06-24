package src.main.java.org.example.oops.staticandinstance.variables;

public class StaticVariableMain {

    private static String staticVariable = "Test";

    public static void main(String[] args) {
        System.out.println(StaticVariableMain.staticVariable);
        StaticVariable staticVariable = new StaticVariable("Muthu");
        StaticVariable staticVariable2 = new StaticVariable("Divya");
        System.out.println(staticVariable.getName());
        System.out.println(staticVariable2.getName());
    }

}
