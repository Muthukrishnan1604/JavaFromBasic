package src.main.java.org.example.oops.staticandinstance.variables;

/*
Declared by using the keyword static.
Static variables are also known as static member variables.
Every instance of the class shares the same static variable.
If changes are made to that variable, all other instances of that class will see the effect of that change.

It is considered best practice to use the Class name and not a reference variable to access a static variable.

An instance isn't required to exist to access the value of a static variable.

 static variables are shared between the instance if one instance changes the value
 then the same will be reflected every place where it refers
*/

public class StaticVariable {

    private static String name;

    public StaticVariable(String name) {
        StaticVariable.name = name;
    }

    public String getName() {
        return StaticVariable.name;
    }
}
