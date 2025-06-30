package src.main.java.org.example.oops.inheritance.thisandsuper;

public class ChildClass extends ParentClass {

    @Override
    public void print() {
        super.print();
        System.out.println("Printed in child class");
    }

}
