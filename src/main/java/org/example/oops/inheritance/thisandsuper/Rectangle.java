package src.main.java.org.example.oops.inheritance.thisandsuper;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int x, int y) {
        this(x, y, 0, 0);
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        //this(x);  --> If we call this we will get compile time error only one explicit constructor call is allowed
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x) {
        width = x;
    }

}
