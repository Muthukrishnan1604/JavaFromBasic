package src.main.java.org.example.interestingfacts.objects;

public class Parent {

    protected int var;

    public Parent() {
        this.var = 100;
    }

    public int getVar() {
        return var;
    }

    public Parent Parent() {
        return new Parent();
    }

}
