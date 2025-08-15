package src.main.java.org.example.interestingfacts.objects;

public class Child extends Parent {

    protected int var;

    public Child() {
        var = 125;
    }

    @Override
    public int getVar() {
        return this.var;
    }

}
