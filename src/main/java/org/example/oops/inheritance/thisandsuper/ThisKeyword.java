package src.main.java.org.example.oops.inheritance.thisandsuper;

/*
The keyword this is used to call the current class members (both variables and methods).
this is required when we have a parameter with the same name as an instance variable or field.

The keyword this is commonly used within constructors and setters and is optionally used within getters.
In this example, I'm using the this keyword in a constructor and setter since there's a parameter with the same name as the instance or field.
In the getter, I don't have any parameters so there's no conflict. Therefore, the use of this is optional there.
*/

public class ThisKeyword {

    private String color;

    public void setColor(String color) {
        this.color = color; // this is required when we have a parameter with the same name as an instance variable or field
    }

    public String getColor() {
        return color; // even if we don't return this.color it will return color value
    }
}
