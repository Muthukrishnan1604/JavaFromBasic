package src.main.java.org.example.oops.inheritance.thisandsuper;

public class MainClass {

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.print();

        ThisKeyword t = new ThisKeyword();
        t.setColor("Black");
        System.out.println(t.getColor());


    }

}
