package src.main.java.org.example.oops.staticandinstance.variables;

/*
They don't use the static keyword.
They're also known as fields or member variables.
Instance variables belong to a specific instance of a class.

Each instance has its own copy of an instance variable.
Every instance can have a different value.
Instance variables represent the state of a specific instance of a class.

 */

public class InstanceVariable {

    private String instanceVariable;

    public InstanceVariable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public String getInstanceVariable() {
        return instanceVariable;
    }
}
