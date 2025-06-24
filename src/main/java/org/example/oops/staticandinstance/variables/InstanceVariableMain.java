package src.main.java.org.example.oops.staticandinstance.variables;

public class InstanceVariableMain {

    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable("Muthu");

        InstanceVariable instanceVariable1 = new InstanceVariable("Divya");

        System.out.println(instanceVariable.getInstanceVariable());

        System.out.println(instanceVariable1.getInstanceVariable());
    }

}
